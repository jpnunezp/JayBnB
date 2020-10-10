package form;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import RSMaterialComponent.RSTextFieldOne;
import java.awt.SystemColor;
import RSMaterialComponent.RSComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextArea;
import javax.swing.DropMode;
import javax.swing.JScrollPane;
import javax.swing.border.LineBorder;

public class RegistroPropiedad extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RegistroPropiedad frame = new RegistroPropiedad();
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
	public RegistroPropiedad() {
		setTitle("JayBnB :: Sistema de Arriendo de Propiedades");
		setResizable(false);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblRegistrarUnaPropiedad = new JLabel();
		lblRegistrarUnaPropiedad.setText("Registrar una Propiedad");
		lblRegistrarUnaPropiedad.setOpaque(true);
		lblRegistrarUnaPropiedad.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrarUnaPropiedad.setForeground(Color.WHITE);
		lblRegistrarUnaPropiedad.setFont(new Font("Dubai", Font.BOLD, 18));
		lblRegistrarUnaPropiedad.setBackground(new Color(0, 80, 112));
		lblRegistrarUnaPropiedad.setBounds(0, 0, 1018, 32);
		contentPane.add(lblRegistrarUnaPropiedad);
		
		JLabel lblRol = new JLabel("ROL:");
		lblRol.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRol.setForeground(new Color(3, 33, 57));
		lblRol.setFont(new Font("Dubai", Font.BOLD, 16));
		lblRol.setBounds(69, 71, 115, 33);
		contentPane.add(lblRol);
		
		JLabel lblNombre = new JLabel("Nombre Propiedad:");
		lblNombre.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombre.setForeground(new Color(3, 33, 57));
		lblNombre.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNombre.setBounds(25, 104, 159, 33);
		contentPane.add(lblNombre);
		
		JLabel lblDirecci = new JLabel("Direcci\u00F3n:");
		lblDirecci.setHorizontalAlignment(SwingConstants.RIGHT);
		lblDirecci.setForeground(new Color(3, 33, 57));
		lblDirecci.setFont(new Font("Dubai", Font.BOLD, 16));
		lblDirecci.setBounds(69, 140, 115, 33);
		contentPane.add(lblDirecci);
		
		JLabel lblComuna = new JLabel("Comuna:");
		lblComuna.setHorizontalAlignment(SwingConstants.RIGHT);
		lblComuna.setForeground(new Color(3, 33, 57));
		lblComuna.setFont(new Font("Dubai", Font.BOLD, 16));
		lblComuna.setBounds(69, 179, 115, 33);
		contentPane.add(lblComuna);
		
		RSTextFieldOne textFieldOne = new RSTextFieldOne();
		textFieldOne.setPlaceholder("0001");
		textFieldOne.setPhColor(SystemColor.controlDkShadow);
		textFieldOne.setForeground(new Color(25, 25, 112));
		textFieldOne.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne.setBorderColor(new Color(3, 33, 57));
		textFieldOne.setBounds(194, 72, 82, 28);
		contentPane.add(textFieldOne);
		
		RSTextFieldOne textFieldOne_1 = new RSTextFieldOne();
		textFieldOne_1.setPlaceholder("0001");
		textFieldOne_1.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_1.setForeground(new Color(25, 25, 112));
		textFieldOne_1.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_1.setBorderColor(new Color(3, 33, 57));
		textFieldOne_1.setBounds(304, 72, 82, 28);
		contentPane.add(textFieldOne_1);
		
		JLabel label_1 = new JLabel("-");
		label_1.setHorizontalAlignment(SwingConstants.RIGHT);
		label_1.setForeground(new Color(3, 33, 57));
		label_1.setFont(new Font("Dubai", Font.BOLD, 39));
		label_1.setBounds(278, 71, 20, 27);
		contentPane.add(label_1);
		
		RSTextFieldOne textFieldOne_2 = new RSTextFieldOne();
		textFieldOne_2.setPlaceholder("");
		textFieldOne_2.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_2.setForeground(new Color(25, 25, 112));
		textFieldOne_2.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_2.setBorderColor(new Color(3, 33, 57));
		textFieldOne_2.setBounds(194, 106, 261, 28);
		contentPane.add(textFieldOne_2);
		
		RSTextFieldOne textFieldOne_3 = new RSTextFieldOne();
		textFieldOne_3.setPlaceholder("");
		textFieldOne_3.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_3.setForeground(new Color(25, 25, 112));
		textFieldOne_3.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_3.setBorderColor(new Color(3, 33, 57));
		textFieldOne_3.setBounds(194, 142, 261, 28);
		contentPane.add(textFieldOne_3);
		
		RSComboBox comboBox = new RSComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"SANTIAGO", "VI\u00D1A DE MAR"}));
		comboBox.setForeground(new Color(25, 25, 112));
		comboBox.setFont(new Font("Dubai", Font.BOLD, 16));
		comboBox.setConBorde(true);
		comboBox.setColorFondo(Color.WHITE);
		comboBox.setColorBorde(new Color(25, 25, 112));
		comboBox.setColorArrow(new Color(25, 25, 112));
		comboBox.setBounds(194, 179, 200, 32);
		contentPane.add(comboBox);
		
		RSTextFieldOne textFieldOne_4 = new RSTextFieldOne();
		textFieldOne_4.setPlaceholder("");
		textFieldOne_4.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_4.setForeground(new Color(25, 25, 112));
		textFieldOne_4.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_4.setBorderColor(new Color(3, 33, 57));
		textFieldOne_4.setBounds(194, 222, 261, 28);
		contentPane.add(textFieldOne_4);
		
		JLabel lblRutPropietario = new JLabel("RUT Propietario:");
		lblRutPropietario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRutPropietario.setForeground(new Color(3, 33, 57));
		lblRutPropietario.setFont(new Font("Dubai", Font.BOLD, 16));
		lblRutPropietario.setBounds(69, 259, 115, 33);
		contentPane.add(lblRutPropietario);
		
		RSTextFieldOne textFieldOne_5 = new RSTextFieldOne();
		textFieldOne_5.setPlaceholder("");
		textFieldOne_5.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_5.setForeground(new Color(25, 25, 112));
		textFieldOne_5.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_5.setBorderColor(new Color(3, 33, 57));
		textFieldOne_5.setBounds(194, 261, 135, 28);
		contentPane.add(textFieldOne_5);
		
		JLabel lblNombrePropietario = new JLabel("Nombre Propietario:");
		lblNombrePropietario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNombrePropietario.setForeground(new Color(3, 33, 57));
		lblNombrePropietario.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNombrePropietario.setBounds(25, 220, 159, 33);
		contentPane.add(lblNombrePropietario);
		
		JLabel lblAvaloFiscal = new JLabel("Aval\u00FAo Fiscal:");
		lblAvaloFiscal.setHorizontalAlignment(SwingConstants.RIGHT);
		lblAvaloFiscal.setForeground(new Color(3, 33, 57));
		lblAvaloFiscal.setFont(new Font("Dubai", Font.BOLD, 16));
		lblAvaloFiscal.setBounds(493, 71, 115, 33);
		contentPane.add(lblAvaloFiscal);
		
		RSTextFieldOne textFieldOne_6 = new RSTextFieldOne();
		textFieldOne_6.setPlaceholder("$");
		textFieldOne_6.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_6.setForeground(new Color(25, 25, 112));
		textFieldOne_6.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_6.setBorderColor(new Color(3, 33, 57));
		textFieldOne_6.setBounds(628, 71, 135, 32);
		contentPane.add(textFieldOne_6);
		
		JLabel lblValorDeCompra = new JLabel("Valor de Compra:");
		lblValorDeCompra.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorDeCompra.setForeground(new Color(3, 33, 57));
		lblValorDeCompra.setFont(new Font("Dubai", Font.BOLD, 16));
		lblValorDeCompra.setBounds(483, 106, 135, 33);
		contentPane.add(lblValorDeCompra);
		
		RSTextFieldOne textFieldOne_7 = new RSTextFieldOne();
		textFieldOne_7.setPlaceholder("$");
		textFieldOne_7.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_7.setForeground(new Color(25, 25, 112));
		textFieldOne_7.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_7.setBorderColor(new Color(3, 33, 57));
		textFieldOne_7.setBounds(628, 106, 135, 32);
		contentPane.add(textFieldOne_7);
		
		JLabel lblGastosComunes = new JLabel("Gastos Comunes:");
		lblGastosComunes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGastosComunes.setForeground(new Color(3, 33, 57));
		lblGastosComunes.setFont(new Font("Dubai", Font.BOLD, 16));
		lblGastosComunes.setBounds(483, 142, 135, 33);
		contentPane.add(lblGastosComunes);
		
		RSTextFieldOne textFieldOne_8 = new RSTextFieldOne();
		textFieldOne_8.setPlaceholder("$");
		textFieldOne_8.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_8.setForeground(new Color(25, 25, 112));
		textFieldOne_8.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_8.setBorderColor(new Color(3, 33, 57));
		textFieldOne_8.setBounds(628, 142, 135, 32);
		contentPane.add(textFieldOne_8);
		
		JLabel lblGastosBsicos = new JLabel("Gastos B\u00E1sicos:");
		lblGastosBsicos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblGastosBsicos.setForeground(new Color(3, 33, 57));
		lblGastosBsicos.setFont(new Font("Dubai", Font.BOLD, 16));
		lblGastosBsicos.setBounds(483, 179, 135, 33);
		contentPane.add(lblGastosBsicos);
		
		RSTextFieldOne textFieldOne_9 = new RSTextFieldOne();
		textFieldOne_9.setPlaceholder("$");
		textFieldOne_9.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_9.setForeground(new Color(25, 25, 112));
		textFieldOne_9.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_9.setBorderColor(new Color(3, 33, 57));
		textFieldOne_9.setBounds(628, 179, 135, 32);
		contentPane.add(textFieldOne_9);
		
		JLabel lblContribuciones = new JLabel("Contribuciones:");
		lblContribuciones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblContribuciones.setForeground(new Color(3, 33, 57));
		lblContribuciones.setFont(new Font("Dubai", Font.BOLD, 16));
		lblContribuciones.setBounds(483, 217, 135, 33);
		contentPane.add(lblContribuciones);
		
		RSTextFieldOne textFieldOne_10 = new RSTextFieldOne();
		textFieldOne_10.setPlaceholder("$");
		textFieldOne_10.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_10.setForeground(new Color(25, 25, 112));
		textFieldOne_10.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_10.setBorderColor(new Color(3, 33, 57));
		textFieldOne_10.setBounds(628, 217, 135, 32);
		contentPane.add(textFieldOne_10);
		
		JLabel lblValorInventario = new JLabel("Valor Inventario:");
		lblValorInventario.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorInventario.setForeground(new Color(3, 33, 57));
		lblValorInventario.setFont(new Font("Dubai", Font.BOLD, 16));
		lblValorInventario.setBounds(483, 259, 135, 33);
		contentPane.add(lblValorInventario);
		
		RSTextFieldOne textFieldOne_11 = new RSTextFieldOne();
		textFieldOne_11.setPlaceholder("$");
		textFieldOne_11.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_11.setForeground(new Color(25, 25, 112));
		textFieldOne_11.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_11.setBorderColor(new Color(3, 33, 57));
		textFieldOne_11.setBounds(628, 259, 135, 32);
		contentPane.add(textFieldOne_11);
		
		JLabel lblValorNoche = new JLabel("Valor Noche:");
		lblValorNoche.setHorizontalAlignment(SwingConstants.RIGHT);
		lblValorNoche.setForeground(new Color(3, 33, 57));
		lblValorNoche.setFont(new Font("Dubai", Font.BOLD, 16));
		lblValorNoche.setBounds(483, 299, 135, 33);
		contentPane.add(lblValorNoche);
		
		RSTextFieldOne textFieldOne_12 = new RSTextFieldOne();
		textFieldOne_12.setPlaceholder("$");
		textFieldOne_12.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_12.setForeground(new Color(25, 25, 112));
		textFieldOne_12.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_12.setBorderColor(new Color(3, 33, 57));
		textFieldOne_12.setBounds(628, 299, 135, 32);
		contentPane.add(textFieldOne_12);
		
		JLabel lblNDeHabitaciones = new JLabel("N\u00B0 de Habitaciones:");
		lblNDeHabitaciones.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeHabitaciones.setForeground(new Color(3, 33, 57));
		lblNDeHabitaciones.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNDeHabitaciones.setBounds(39, 299, 145, 33);
		contentPane.add(lblNDeHabitaciones);
		
		RSTextFieldOne textFieldOne_13 = new RSTextFieldOne();
		textFieldOne_13.setPlaceholder("3");
		textFieldOne_13.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_13.setForeground(new Color(25, 25, 112));
		textFieldOne_13.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_13.setBorderColor(new Color(3, 33, 57));
		textFieldOne_13.setBounds(194, 301, 45, 28);
		contentPane.add(textFieldOne_13);
		
		JLabel lblMaxOcupantes = new JLabel("Max. Ocupantes:");
		lblMaxOcupantes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMaxOcupantes.setForeground(new Color(3, 33, 57));
		lblMaxOcupantes.setFont(new Font("Dubai", Font.BOLD, 16));
		lblMaxOcupantes.setBounds(39, 338, 145, 33);
		contentPane.add(lblMaxOcupantes);
		
		RSTextFieldOne textFieldOne_14 = new RSTextFieldOne();
		textFieldOne_14.setPlaceholder("3");
		textFieldOne_14.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_14.setForeground(new Color(25, 25, 112));
		textFieldOne_14.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_14.setBorderColor(new Color(3, 33, 57));
		textFieldOne_14.setBounds(194, 340, 45, 28);
		contentPane.add(textFieldOne_14);
		
		JLabel lblNDeBaos = new JLabel("N\u00B0 de Ba\u00F1os:");
		lblNDeBaos.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeBaos.setForeground(new Color(3, 33, 57));
		lblNDeBaos.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNDeBaos.setBounds(39, 375, 145, 33);
		contentPane.add(lblNDeBaos);
		
		RSTextFieldOne textFieldOne_15 = new RSTextFieldOne();
		textFieldOne_15.setPlaceholder("3");
		textFieldOne_15.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_15.setForeground(new Color(25, 25, 112));
		textFieldOne_15.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_15.setBorderColor(new Color(3, 33, 57));
		textFieldOne_15.setBounds(194, 377, 45, 28);
		contentPane.add(textFieldOne_15);
		
		JLabel lblNDeBodegas = new JLabel("N\u00B0 de Bodegas:");
		lblNDeBodegas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeBodegas.setForeground(new Color(3, 33, 57));
		lblNDeBodegas.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNDeBodegas.setBounds(39, 411, 145, 33);
		contentPane.add(lblNDeBodegas);
		
		RSTextFieldOne textFieldOne_16 = new RSTextFieldOne();
		textFieldOne_16.setPlaceholder("3");
		textFieldOne_16.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_16.setForeground(new Color(25, 25, 112));
		textFieldOne_16.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_16.setBorderColor(new Color(3, 33, 57));
		textFieldOne_16.setBounds(194, 413, 45, 28);
		contentPane.add(textFieldOne_16);
		
		JLabel lblNDeEstacionamiento = new JLabel("N\u00B0 de Estacionamiento:");
		lblNDeEstacionamiento.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeEstacionamiento.setForeground(new Color(3, 33, 57));
		lblNDeEstacionamiento.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNDeEstacionamiento.setBounds(10, 447, 174, 33);
		contentPane.add(lblNDeEstacionamiento);
		
		RSTextFieldOne textFieldOne_17 = new RSTextFieldOne();
		textFieldOne_17.setPlaceholder("3");
		textFieldOne_17.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_17.setForeground(new Color(25, 25, 112));
		textFieldOne_17.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_17.setBorderColor(new Color(3, 33, 57));
		textFieldOne_17.setBounds(194, 449, 45, 28);
		contentPane.add(textFieldOne_17);
		
		RSTextFieldOne textFieldOne_18 = new RSTextFieldOne();
		textFieldOne_18.setPlaceholder("3");
		textFieldOne_18.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_18.setForeground(new Color(25, 25, 112));
		textFieldOne_18.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_18.setBorderColor(new Color(3, 33, 57));
		textFieldOne_18.setBounds(194, 484, 45, 28);
		contentPane.add(textFieldOne_18);
		
		JLabel lblNDeCocinas = new JLabel("N\u00B0 de Cocinas:");
		lblNDeCocinas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNDeCocinas.setForeground(new Color(3, 33, 57));
		lblNDeCocinas.setFont(new Font("Dubai", Font.BOLD, 16));
		lblNDeCocinas.setBounds(39, 482, 145, 33);
		contentPane.add(lblNDeCocinas);
		
		JLabel lblMetrosCuadrados = new JLabel("Metros Cuadrados:");
		lblMetrosCuadrados.setHorizontalAlignment(SwingConstants.RIGHT);
		lblMetrosCuadrados.setForeground(new Color(3, 33, 57));
		lblMetrosCuadrados.setFont(new Font("Dubai", Font.BOLD, 16));
		lblMetrosCuadrados.setBounds(39, 518, 145, 33);
		contentPane.add(lblMetrosCuadrados);
		
		RSTextFieldOne textFieldOne_19 = new RSTextFieldOne();
		textFieldOne_19.setPlaceholder("3");
		textFieldOne_19.setPhColor(SystemColor.controlDkShadow);
		textFieldOne_19.setForeground(new Color(25, 25, 112));
		textFieldOne_19.setFont(new Font("Dubai", Font.BOLD, 16));
		textFieldOne_19.setBorderColor(new Color(3, 33, 57));
		textFieldOne_19.setBounds(194, 520, 45, 28);
		contentPane.add(textFieldOne_19);
		
		RSComboBox comboBox_1 = new RSComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"SI", "NO"}));
		comboBox_1.setForeground(new Color(25, 25, 112));
		comboBox_1.setFont(new Font("Dubai", Font.BOLD, 16));
		comboBox_1.setConBorde(true);
		comboBox_1.setColorFondo(Color.WHITE);
		comboBox_1.setColorBorde(new Color(25, 25, 112));
		comboBox_1.setColorArrow(new Color(25, 25, 112));
		comboBox_1.setBounds(194, 554, 66, 32);
		contentPane.add(comboBox_1);
		
		JLabel lblJardn = new JLabel("Jard\u00EDn:");
		lblJardn.setHorizontalAlignment(SwingConstants.RIGHT);
		lblJardn.setForeground(new Color(3, 33, 57));
		lblJardn.setFont(new Font("Dubai", Font.BOLD, 16));
		lblJardn.setBounds(69, 554, 115, 33);
		contentPane.add(lblJardn);
		
		JLabel lblCaractersticas = new JLabel("Caracter\u00EDsticas:");
		lblCaractersticas.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCaractersticas.setForeground(new Color(3, 33, 57));
		lblCaractersticas.setFont(new Font("Dubai", Font.BOLD, 16));
		lblCaractersticas.setBounds(39, 589, 145, 33);
		contentPane.add(lblCaractersticas);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setViewportBorder(new LineBorder(new Color(25, 25, 112)));
		scrollPane.setBounds(194, 597, 603, 48);
		contentPane.add(scrollPane);
		
		JTextArea textArea = new JTextArea();
		textArea.setFont(new Font("Dubai", Font.BOLD, 14));
		scrollPane.setViewportView(textArea);
	}
}
