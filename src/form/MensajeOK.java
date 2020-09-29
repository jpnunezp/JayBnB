package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import RSMaterialComponent.RSButtonMaterialOne;
import newscomponents.RSButtonFlat_new;
import RSMaterialComponent.RSButtonMaterialGradientTwo;
import RSMaterialComponent.RSButtonMaterialTwo;
import RSMaterialComponent.RSButtonShape;
import RSMaterialComponent.RSButtonShape.FORMA;
import javax.swing.SwingConstants;
import java.awt.Font;
import RSMaterialComponent.RSLabelTextIcon;
import rojeru_san.efectos.ValoresEnum.ICONS;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MensajeOK extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void Mensaje(String titulo, String mensaje) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MensajeOK frame = new MensajeOK(titulo, mensaje);
					frame.setUndecorated(true);
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
	public MensajeOK(String titulo, String mensaje) {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 361, 214);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 345, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel(titulo);
		lblTitulo.setFont(new Font("Dubai", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(23, 0, 288, 35);
		panel.add(lblTitulo);
		
		RSButtonShape btnshpAceptar = new RSButtonShape();
		btnshpAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnshpAceptar.setBackgroundHover(new Color(46, 139, 87));
		btnshpAceptar.setBackground(new Color(0, 128, 128));
		btnshpAceptar.setFont(new Font("Dubai", Font.BOLD, 16));
		btnshpAceptar.setHorizontalAlignment(SwingConstants.CENTER);
		btnshpAceptar.setText("ACEPTAR");
		btnshpAceptar.setForma(FORMA.ROUND);
		btnshpAceptar.setBounds(84, 123, 166, 35);
		contentPane.add(btnshpAceptar);
		
		RSLabelTextIcon lblMensaje = new RSLabelTextIcon();
		lblMensaje.setForeground(new Color(25, 25, 112));
		lblMensaje.setIcons(ICONS.INFO);
		lblMensaje.setText(mensaje);
		lblMensaje.setBounds(56, 54, 200, 40);
		contentPane.add(lblMensaje);
	}
}
