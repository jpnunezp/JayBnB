package Controlador;

import java.nio.charset.Charset;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.KeySpec;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;

public class Hasher {
	/* Example implementation of password hasher similar to Django's PasswordHasher
	 * Requires Java8 (but should be easy to port to older JREs)
	 * Currently it would work only for pbkdf2_sha256 algorithm
	 *
	 * Django code: https://github.com/django/django/blob/1.6.5/django/contrib/auth/hashers.py#L221
	 */


	    public final Integer DEFAULT_ITERATIONS = 10000;
	    public final String algorithm = "pbkdf2_sha256";

	    public Hasher() {}

	    public String getEncodedHash(String password, String salt, int iterations) {
	        // Returns only the last part of whole encoded password
	        SecretKeyFactory keyFactory = null;
	        try {
	            keyFactory = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA256");
	        } catch (NoSuchAlgorithmException e) {
	            System.err.println("Could NOT retrieve PBKDF2WithHmacSHA256 algorithm");
	            System.exit(1);
	        }
	        KeySpec keySpec = new PBEKeySpec(password.toCharArray(), salt.getBytes(Charset.forName("UTF-8")), iterations, 256);
	        SecretKey secret = null;
	        try {
	            secret = keyFactory.generateSecret(keySpec);
	        } catch (InvalidKeySpecException e) {
	            System.out.println("Could NOT generate secret key");
	            e.printStackTrace();
	        }

	        byte[] rawHash = secret.getEncoded();
	        byte[] hashBase64 = Base64.getEncoder().encode(rawHash);

	        return new String(hashBase64);
	    }

	    public String encode(String password, String salt, int iterations) {
	        // returns hashed password, along with algorithm, number of iterations and salt
	        String hash = getEncodedHash(password, salt, iterations);
	        return String.format("%s$%d$%s$%s", algorithm, iterations, salt, hash);
	    }

	    public String encode(String password, String salt) {
	        return this.encode(password, salt, this.DEFAULT_ITERATIONS);
	    }

	    public boolean checkPassword(String password, String hashedPassword) {
	        // hashedPassword consist of: ALGORITHM, ITERATIONS_NUMBER, SALT and
	        // HASH; parts are joined with dollar character ("$")
	        String[] parts = hashedPassword.split("\\$");
	        if (parts.length != 4) {
	            // wrong hash format
	            return false;
	        }
	        Integer iterations = Integer.parseInt(parts[1]);
	        String salt = parts[2];
	        String hash = encode(password, salt, iterations);

	        return hash.equals(hashedPassword);
	    }

	    // Following examples can be generated at any Django project:
	    //
	    //  >>> from django.contrib.auth.hashers import make_password
	    //  >>> make_password('mystery', hasher='pbkdf2_sha256')  # salt would be randomly generated
	    //  'pbkdf2_sha256$10000$HqxvKtloKLwx$HdmdWrgv5NEuaM4S6uMvj8/s+5Yj+I/d1ay6zQyHxdg='
	    //  >>> make_password('mystery', salt='mysalt', hasher='pbkdf2_sha256')
	    //  'pbkdf2_sha256$10000$mysalt$KjUU5KrwyUbKTGYkHqBo1IwUbFBzKXrGQgwA1p2AuY0='
	    //
	    //
	    // mystery
	    // pbkdf2_sha256$10000$qx1ec0f4lu4l$3G81rAm/4ng0tCCPTrx2aWohq7ztDBfFYczGNoUtiKQ=
	    //
	    // s3cr3t
	    // pbkdf2_sha256$10000$BjDHOELBk7fR$xkh1Xf6ooTqwkflS3rAiz5Z4qOV1Jd5Lwd8P+xGtW+I=
	    //
	    // puzzle
	    // pbkdf2_sha256$10000$IFYFG7hiiKYP$rf8vHYFD7K4q2N3DQYfgvkiqpFPGCTYn6ZoenLE3jLc=
	    //
	    // riddle
	    // pbkdf2_sha256$10000$A0S5o3pNIEq4$Rk2sxXr8bonIDOGj6SU4H/xpjKHhHAKpFXfmNZ0dnEY=

	    public static void main(String[] args) {
	        runTests();
	    }

	    private static void runTests() {
	        System.out.println("===========================");
	        System.out.println("= Testing password hasher =");
	        System.out.println("===========================");
	        System.out.println();

	        System.out.println();
	        passwordShouldMatch("welookof", "pbkdf2_sha256$150000$xOJ8G4YdOP3g$gZ9jgGxI2khv5gX+3KTjMZoDiOH3EHQb8mMvfgRdW2A=");
	        passwordShouldMatch("mystery", "pbkdf2_sha256$10000$mysalt$KjUU5KrwyUbKTGYkHqBo1IwUbFBzKXrGQgwA1p2AuY0=");  // custom salt
	        passwordShouldMatch("s3cr3t", "pbkdf2_sha256$10000$BjDHOELBk7fR$xkh1Xf6ooTqwkflS3rAiz5Z4qOV1Jd5Lwd8P+xGtW+I=");
	        passwordShouldMatch("puzzle", "pbkdf2_sha256$10000$IFYFG7hiiKYP$rf8vHYFD7K4q2N3DQYfgvkiqpFPGCTYn6ZoenLE3jLc=");
	        passwordShouldMatch("riddle", "pbkdf2_sha256$10000$A0S5o3pNIEq4$Rk2sxXr8bonIDOGj6SU4H/xpjKHhHAKpFXfmNZ0dnEY=");

	        System.out.println();
	        passwordShouldNotMatch("foo", "");
	        passwordShouldNotMatch("mystery", "pbkdf2_md5$10000$qx1ec0f4lu4l$3G81rAm/4ng0tCCPTrx2aWohq7ztDBfFYczGNoUtiKQ=");
	        passwordShouldNotMatch("mystery", "pbkdf2_sha1$10000$qx1ec0f4lu4l$3G81rAm/4ng0tCCPTrx2aWohq7ztDBfFYczGNoUtiKQ=");
	        passwordShouldNotMatch("mystery", "pbkdf2_sha256$10001$Qx1ec0f4lu4l$3G81rAm/4ng0tCCPTrx2aWohq7ztDBfFYczGNoUtiKQ=");
	        passwordShouldNotMatch("mystery", "pbkdf2_sha256$10001$qx1ec0f4lu4l$3G81rAm/4ng0tCCPTrx2aWohq7ztDBfFYczGNoUtiKQ=");
	        passwordShouldNotMatch("mystery", "pbkdf2_sha256$10000$qx7ztDBfFYczGNoUtiKQ=");
	        passwordShouldNotMatch("s3cr3t", "pbkdf2_sha256$10000$BjDHOELBk7fR$foobar");
	        passwordShouldNotMatch("puzzle", "pbkdf2_sha256$10000$IFYFG7hiiKYP$rf8vHYFD7K4q2N3DQYfgvkiqpFPGCTYn6ZoenLE3jLcX");
	    }

	    private static void passwordShouldMatch(String password, String expectedHash) {
	        Hasher hasher = new Hasher();

	        if (hasher.checkPassword(password, expectedHash)) {
	            System.out.println(" => OK");
	        } else {
	            String[] parts = expectedHash.split("\\$");
	            if (parts.length != 4) {
	                System.out.printf(" => Wrong hash provided: '%s'\n", expectedHash);
	                return;
	            }
	            String salt = parts[2];
	            String resultHash = hasher.encode(password, salt);
	            String msg = " => Wrong! Password '%s' hash expected to be '%s' but is '%s'\n";
	            System.out.printf(msg, password, expectedHash, resultHash);
	        }
	    }

	    private static void passwordShouldNotMatch(String password, String expectedHash) {
	        Hasher hasher = new Hasher();

	        if (hasher.checkPassword(password, expectedHash)) {
	            System.out.printf(" => Wrong (password '%s' did '%s' match but were not supposed to)\n", password, expectedHash);
	        } else {
	            System.out.println(" => OK (password didn't match)");
	        }
	    }

	}
