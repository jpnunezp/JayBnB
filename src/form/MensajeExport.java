package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.kordamp.ikonli.fontawesome5.FontAwesomeBrands;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.swing.FontIcon;

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
import javax.swing.JOptionPane;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import RSMaterialComponent.RSButtonShapeIcon;

public class MensajeExport extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void Mensaje() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MensajeExport frame = new MensajeExport();
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
	public MensajeExport() {
		setType(Type.POPUP);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 317, 144);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(25, 25, 112));
		panel.setBounds(0, 0, 324, 35);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("EXPORTAR A");
		lblTitulo.setFont(new Font("Dubai", Font.BOLD, 20));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setForeground(new Color(255, 255, 255));
		lblTitulo.setBounds(46, 0, 231, 35);
		panel.add(lblTitulo);
		
		RSButtonShapeIcon buttonShapeIcon = new RSButtonShapeIcon();
		buttonShapeIcon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
			
		});
		buttonShapeIcon.setBackgroundHover(new Color(128, 0, 0));
		buttonShapeIcon.setBackground(new Color(178, 34, 34));
		buttonShapeIcon.setIcons(ICONS.CLOSE);
		buttonShapeIcon.setForma(RSButtonShapeIcon.FORMA.RECT);
		buttonShapeIcon.setHorizontalAlignment(SwingConstants.CENTER);
		buttonShapeIcon.setBounds(287, 0, 28, 35);
		panel.add(buttonShapeIcon);
		
		RSButtonShape btnshpAceptar = new RSButtonShape();
		btnshpAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "ARCHIVO EXPORTADO A PDF");
				dispose();
			}
		});
		btnshpAceptar.setBackgroundHover(new Color(128, 0, 0));
		btnshpAceptar.setBackground(new Color(165, 42, 42));
		btnshpAceptar.setFont(new Font("Dubai", Font.BOLD, 16));
		btnshpAceptar.setHorizontalAlignment(SwingConstants.CENTER);
		btnshpAceptar.setText("  PDF");
		btnshpAceptar.setForma(FORMA.ROUND);
		btnshpAceptar.setIcon(FontIcon.of(FontAwesomeSolid.FILE_PDF, 25, Color.white));
		btnshpAceptar.setBounds(10, 68, 134, 47);
		contentPane.add(btnshpAceptar);
		
		RSButtonShape btnshpExcel = new RSButtonShape();
		btnshpExcel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "ARCHIVO EXPORTADO A EXCEL");
				dispose();
			}
		});
		btnshpExcel.setText("  EXCEL");
		btnshpExcel.setHorizontalAlignment(SwingConstants.CENTER);
		btnshpExcel.setForma(FORMA.ROUND);
		btnshpExcel.setFont(new Font("Dubai", Font.BOLD, 16));
		btnshpExcel.backgroundHover = new Color(46, 139, 87);
		btnshpExcel.setBackgroundHover(new Color(46, 139, 87));
		btnshpExcel.setBackground(new Color(0, 128, 128));
		btnshpExcel.setIcon(FontIcon.of(FontAwesomeSolid.FILE_EXCEL, 25, Color.white));
		btnshpExcel.setBounds(163, 68, 138, 47);
		contentPane.add(btnshpExcel);
	}
}
