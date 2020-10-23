package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.ConexionDB;
import Controlador.ValidarLogin;
import Modelo.Usuario;
import jiconfont.IconFont;
import jiconfont.icons.FontAwesome;
import jiconfont.swing.IconFontSwing;
import jiconfont.icons.google_material_design_icons.GoogleMaterialDesignIcons;
import jiconfont.icons.entypo.Entypo;
import org.kordamp.ikonli.*;
import org.kordamp.ikonli.fontawesome5.FontAwesomeRegular;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.swing.FontIcon;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import RSMaterialComponent.RSButtonShape;
import RSMaterialComponent.RSButtonShape.FORMA;
import RSMaterialComponent.RSTextFieldOne;
import necesario.Global.THEMETOOLTIP;
import RSMaterialComponent.RSPasswordOne;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static final String EMAIL_PATTERN = 
		    "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
		    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	private JPanel contentPane;
	private RSTextFieldOne txtUsername = new RSTextFieldOne();
	private String contra;
	Usuario usuario = new Usuario();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		setResizable(false);
		setTitle("Ingreso al Sistema");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
		IconFontSwing.register(FontAwesome.getIconFont());
		
		JLabel lblNewLabel_2 = new JLabel("");
		//lblNewLabel_2.setIcon((Icon) new javax.swing.ImageIcon(getClass().getResource("/Recursos/Turismo-Real.png")).getImage().getScaledInstance(200, 50 , Image.SCALE_SMOOTH));
		lblNewLabel_2.setIcon(new ImageIcon(Login.class.getResource("/Recursos/Turismo-Real 400.png")));
		lblNewLabel_2.setBounds(318, 221, 405, 126);
		contentPane.add(lblNewLabel_2);	
		
		JLabel lblIconUser = new JLabel("");
		lblIconUser.setBounds(495, 38, 118, 142);
		contentPane.add(lblIconUser);
		Color color = new Color(1);
		FontIcon icon = FontIcon.of(FontAwesomeSolid.USER_CIRCLE, 85, color.BLACK);
		lblIconUser.setIcon(icon);
		txtUsername.setPhColor(Color.GRAY);
		txtUsername.setForeground(new Color(46, 139, 87));
		

		txtUsername.setPlaceholder("email@email.com");
		txtUsername.setFont(new Font("Tahoma", Font.BOLD, 24));
		txtUsername.setBorderColor(new Color(0, 128, 128));
		txtUsername.setBounds(366, 374, 368, 52);
		txtUsername.addFocusListener(new FocusAdapter() {
        	@Override
        	public void focusLost(FocusEvent arg0) {
        		if(!txtUsername.getText().equals("")) {
            		if (!txtUsername.getText().matches(EMAIL_PATTERN)) {
            			JOptionPane.showMessageDialog(null, "DEBE INGRESAR UN EMAIL VALIDO");
            			txtUsername.requestFocus();
            		}
        		}

        	}
        });
		contentPane.add(txtUsername);
		
		RSButtonShape btnshpIngresar = new RSButtonShape();
		btnshpIngresar.setFont(new Font("Dubai", Font.BOLD, 32));
		btnshpIngresar.setHorizontalAlignment(SwingConstants.CENTER);
		btnshpIngresar.setText("Ingresar");
		btnshpIngresar.setBackgroundHover(new Color(30, 144, 255));
		btnshpIngresar.setBackground(new Color(0, 181, 236));
		btnshpIngresar.setForma(FORMA.ROUND);
		btnshpIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.out.println(txtUsername.getText()+" "+contra);
				validaPass(txtUsername.getText(), contra);
			}
		});
		btnshpIngresar.setBounds(388, 534, 305, 72);
		contentPane.add(btnshpIngresar);
		

		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Dubai", Font.BOLD, 26));
		lblEmail.setBounds(236, 374, 118, 52);
		contentPane.add(lblEmail);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContrasea.setFont(new Font("Dubai", Font.BOLD, 26));
		lblContrasea.setBounds(140, 441, 214, 52);
		contentPane.add(lblContrasea);
		
		RSPasswordOne passwordOne = new RSPasswordOne();
		passwordOne.setPhColor(Color.GRAY);
		passwordOne.setForeground(new Color(46, 139, 87));
		passwordOne.setFont(new Font("Tahoma", Font.BOLD, 24));
		passwordOne.setPlaceholder("***");
		passwordOne.setBorderColor(new Color(0, 128, 128));
		passwordOne.setBounds(366, 450, 368, 52);
		contentPane.add(passwordOne);
		passwordOne.addFocusListener(null);
		
		JLabel lblNewLabel_3 = new JLabel("Bienvenidos a");
		lblNewLabel_3.setFont(new Font("Dubai", Font.BOLD, 58));
		lblNewLabel_3.setBounds(343, 173, 380, 61);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblolvidSuContrasea = new JLabel("\u00BFOlvid\u00F3 su contrase\u00F1a?");
		lblolvidSuContrasea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				JOptionPane.showMessageDialog(null, "¿Olvido?");
			}
		});
		lblolvidSuContrasea.setHorizontalAlignment(SwingConstants.CENTER);
		lblolvidSuContrasea.setFont(new Font("Dubai", Font.BOLD, 26));
		lblolvidSuContrasea.setBounds(366, 633, 355, 52);
		contentPane.add(lblolvidSuContrasea);
		
		passwordOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JPasswordField input = (JPasswordField) e.getSource();
				char[] passy = input.getPassword();
				contra = new String(passy);
				btnshpIngresar.requestFocus();
				
			}
		});
		
		btnshpIngresar.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (e.getKeyCode()==KeyEvent.VK_ENTER){
					validaPass(txtUsername.getText(), contra);
				}
			}

		});
		
	}
	
	private void validaPass(String text, String contra) {
		// TODO Auto-generated method stub
		ValidarLogin vl = new ValidarLogin();
		boolean resu = vl.getPass(txtUsername.getText(), contra);
		if (resu) {
			usuario = vl.usuarioActual(txtUsername.getText());
			MainMenu mp = new MainMenu();
			mp.setVisible(true);
			dispose();
		} else {
			JOptionPane.showMessageDialog(null, "El Usuario o Contraseña es Incorrecto");
		}
	}
	
}
