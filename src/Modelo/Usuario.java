package Modelo;

public class Usuario {
	
	int id;
	String password;
	String lastlogin;
	int isSuper;
	String username;
	String firstName;
	String lastName;
	String email;
	int isStaff;
	int isActive;
	String dateJoined;
	
	public Usuario() {
		
	}
	
	public Usuario(int id, String password, String lastlogin, int isSuper, String username, String firstName,
			String lastName, String email, int isStaff, int isActive, String dateJoined) {
		this.id = id;
		this.password = password;
		this.lastlogin = lastlogin;
		this.isSuper = isSuper;
		this.username = username;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.isStaff = isStaff;
		this.isActive = isActive;
		this.dateJoined = dateJoined;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getLastlogin() {
		return lastlogin;
	}

	public void setLastlogin(String lastlogin) {
		this.lastlogin = lastlogin;
	}

	public int getIsSuper() {
		return isSuper;
	}

	public void setIsSuper(int isSuper) {
		this.isSuper = isSuper;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getIsStaff() {
		return isStaff;
	}

	public void setIsStaff(int isStaff) {
		this.isStaff = isStaff;
	}

	public int getIsActive() {
		return isActive;
	}

	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}

	public String getDateJoined() {
		return dateJoined;
	}

	public void setDateJoined(String dateJoined) {
		this.dateJoined = dateJoined;
	}
	
	
	
	
	

}
