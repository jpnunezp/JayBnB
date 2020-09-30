/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import form.Panel1;
import form.MenuClientes;
import form.MenuDashboard;
import form.MenuEmpresaTransporte;
import form.MenuEmpresaTurismo;
import form.MenuPagos;
import form.MenuPropiedades;
import form.MenuReservas;
import form.MenuServiciosExtra;
import form.MenuUsuarios;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import menu.MenuItem;
import java.awt.Dimension;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.GroupLayout.Alignment;

import org.kordamp.ikonli.entypo.Entypo;
import org.kordamp.ikonli.fontawesome5.FontAwesomeSolid;
import org.kordamp.ikonli.swing.FontIcon;

import javax.swing.GroupLayout;
import javax.swing.SwingConstants;
import java.awt.Toolkit;
import java.awt.Font;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author RavenPC
 */
public class MainMenu extends javax.swing.JFrame {

	Color color = new Color(1);
    /**
     * Creates new form Main
     */
    public MainMenu() {
    	setTitle("JayBnB :: Sistema de Arriendo de Propiedades");
    	setIconImage(Toolkit.getDefaultToolkit().getImage(MainMenu.class.getResource("/Recursos/jaybnb_6iv_icon.ico")));
    	setResizable(false);
    	panelBody.removeAll();
    	panelBody.add(new MenuDashboard());
        panelBody.repaint();
        panelBody.revalidate();
        initComponents();
        execute();
    }

    private void execute() {
        ImageIcon iconStaff = new ImageIcon(getClass().getResource("/menu/user.png"));
        FontIcon icon = FontIcon.of(FontAwesomeSolid.USER_CIRCLE, 24, color.white);
        ImageIcon iconSetting = new ImageIcon(getClass().getResource("/menu/setting.png"));
        ImageIcon iconDatabase = new ImageIcon(getClass().getResource("/menu/database.png"));
        ImageIcon iconMessage = new ImageIcon(getClass().getResource("/menu/message.png"));
        ImageIcon iconSubMenu = new ImageIcon(getClass().getResource("/menu/subMenu.png"));
        ImageIcon iconNext = new ImageIcon(getClass().getResource("/menu/next.png"));
        
        //  create submenu Inicio
        MenuItem menuStaff0 = new MenuItem(FontIcon.of(FontAwesomeSolid.CHART_LINE, 16, color.white), new Color(0, 80, 112), "Dashboard", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
            	panelBody.add(new MenuDashboard());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        //  create submenu Clientes
        MenuItem menuStaff1 = new MenuItem(FontIcon.of(FontAwesomeSolid.USER_PLUS, 16, color.white), new Color(0, 80, 112), "Mantenedor de Clientes", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
            	panelBody.add(new MenuClientes());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        //  create submenu Departamentos
        MenuItem menuStaff4 = new MenuItem(FontIcon.of(Entypo.HOME, 16, color.white), new Color(0, 80, 112), "Mantenedor de Propiedades", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
            	panelBody.add(new MenuPropiedades());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        MenuItem menuStaff5 = new MenuItem(FontIcon.of(FontAwesomeSolid.TASKS, 16, color.white), new Color(0, 80, 112), "Inventario", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
            	panelBody.add(new MenuPropiedades());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        MenuItem menuStaff6 = new MenuItem(FontIcon.of(Entypo.TOOLS, 16, color.white), new Color(0, 80, 112), "Mantenciones", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
            	panelBody.add(new MenuPropiedades());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });

        //  create submenu Reservas
        MenuItem menuStaff7 = new MenuItem(FontIcon.of(Entypo.CALENDAR, 16, color.white), new Color(0, 80, 112), "Mantenedor de Reservas", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
            	panelBody.add(new MenuReservas());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        MenuItem menuStaff8 = new MenuItem(FontIcon.of(FontAwesomeSolid.CALENDAR_PLUS, 16, color.white), new Color(0, 80, 112), "Servicios Extras", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
            	panelBody.add(new MenuServiciosExtra());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });

        MenuItem menuStaff9 = new MenuItem(FontIcon.of(FontAwesomeSolid.DOLLAR_SIGN, 16, color.white), new Color(0, 80, 112), "Pagos", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                panelBody.removeAll();
            	panelBody.add(new MenuPagos());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });

        
        //  create submenu Informes
        MenuItem menuStaff10 = new MenuItem(FontIcon.of(FontAwesomeSolid.FILE_ALT, 16, Color.white), new Color(0, 80, 112), "Informe de Reservas", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
                panelBody.add(new Panel1());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        MenuItem menuStaff11 = new MenuItem(FontIcon.of(FontAwesomeSolid.CHART_LINE, 16, Color.white), new Color(0, 80, 112), "Informe de Finanzas", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
                panelBody.add(new Panel1());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        MenuItem menuStaff12 = new MenuItem(FontIcon.of(FontAwesomeSolid.CHART_PIE, 16, Color.white), new Color(0, 80, 112), "Informe de Estadísticas", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
                panelBody.add(new Panel1());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        
        //  create submenu Sistema
        MenuItem menuStaff13 = new MenuItem(FontIcon.of(FontAwesomeSolid.USERS, 16, Color.white), new Color(0, 80, 112), "Mantenedor de Usuarios", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
                panelBody.add(new MenuUsuarios());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        MenuItem menuStaff14 = new MenuItem(FontIcon.of(FontAwesomeSolid.CAR, 16, Color.white), new Color(0, 135, 185), "Empresas de Transporte", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
                panelBody.add(new MenuEmpresaTransporte());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });
        
        MenuItem menuStaff15 = new MenuItem(FontIcon.of(FontAwesomeSolid.CAMERA_RETRO, 16, Color.white), new Color(0, 135, 185), "Empresas de Turismo", new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
            	panelBody.removeAll();
                panelBody.add(new MenuEmpresaTurismo());
                panelBody.repaint();
                panelBody.revalidate();
            }
        });

        MenuItem menuSettingMessage = new MenuItem(FontIcon.of(FontAwesomeSolid.CAMERA_RETRO, 16, Color.white), new Color(0, 80, 112), "Mantenedor Empresa Externa", null, menuStaff14, menuStaff15);
        
        //  create submenu setting message

        MenuItem message1 = new MenuItem(iconNext, Color.white, "Message 001", null);
        MenuItem message2 = new MenuItem(iconNext, Color.white, "Message 002", null);
        MenuItem message3 = new MenuItem(iconNext, Color.white, "Message 003", null);

        //  create submenu setting 
        MenuItem menuSetting1 = new MenuItem(iconSubMenu, Color.white, "Setting 001", null);
        //MenuItem menuSettingMessage = new MenuItem(iconMessage, Color.white, "Setting 002 Message", null, message1, message2, message3);
        MenuItem menuSetting3 = new MenuItem(iconSubMenu, Color.white, "Setting 003", null);
        MenuItem menuSetting4 = new MenuItem(iconSubMenu, Color.white, "Setting 004", null);

        MenuItem menuInicio = new MenuItem(FontIcon.of(FontAwesomeSolid.HOME, 24, color.white), new Color(24, 52, 78), "Inicio", null, menuStaff0);
        MenuItem menuClientes = new MenuItem(FontIcon.of(FontAwesomeSolid.USER, 24, color.white), new Color(24, 52, 78), "Clientes", null, menuStaff1);
        MenuItem menuDepartamentos = new MenuItem(FontIcon.of(FontAwesomeSolid.HOME, 24, color.white), new Color(24, 52, 78), "Departamentos", null, menuStaff4, menuStaff5, menuStaff6);
        MenuItem menuReservas = new MenuItem(FontIcon.of(FontAwesomeSolid.CALENDAR_ALT, 24, color.white), new Color(24, 52, 78), "Reservas", null, menuStaff7, menuStaff8, menuStaff9);
        MenuItem menuInformes = new MenuItem(FontIcon.of(FontAwesomeSolid.CHART_BAR, 24, color.white), new Color(24, 52, 78), "Informes y Reportes", null, menuStaff10, menuStaff11, menuStaff12);
        MenuItem menuSistema = new MenuItem(FontIcon.of(FontAwesomeSolid.WRENCH, 24, color.white), new Color(24, 52, 78), "Sistema", null, menuStaff13, menuSettingMessage);
        //MenuItem menuSetting = new MenuItem(iconSetting, "Mantenedor de Propiedades", null, menuSetting1, menuSettingMessage, menuSetting3, menuSetting4);
        //MenuItem menuDatabase = new MenuItem(iconDatabase, "System Database", null);
        addMenu(menuInicio, menuClientes, menuDepartamentos, menuReservas, menuInformes, menuSistema );
    }

    private void addMenu(MenuItem... menu) {
        for (int i = 0; i < menu.length; i++) {
            menus.add(menu[i]);
            ArrayList<MenuItem> subMenu = menu[i].getSubMenu();
            for (MenuItem m : subMenu) {
                addMenu(m);
            }
        }
        menus.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelHeader = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        menus = new javax.swing.JPanel();
        panelBody = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelHeader.setBackground(new Color(255, 255, 255));
        panelHeader.setPreferredSize(new Dimension(561, 75));

        getContentPane().add(panelHeader, java.awt.BorderLayout.PAGE_START);
        panelHeader.setLayout(null);
        
        lblNewLabel = new JLabel("");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setIcon(new javax.swing.ImageIcon(MainMenu.class.getResource("/Recursos/Turismo-Real 400.png")));
        lblNewLabel.setBounds(410, 11, 426, 53);
        panelHeader.add(lblNewLabel);
        
        lblIconUser = new JLabel(".");
        lblIconUser.setBounds(10, 11, 63, 53);
        lblIconUser.setIcon(FontIcon.of(FontAwesomeSolid.USER_CIRCLE, 48, color.white));
        panelHeader.add(lblIconUser);
        
        JLabel lblNomUser = new JLabel("Nombre de Usuario");
        lblNomUser.setForeground(Color.WHITE);
        lblNomUser.setFont(new Font("Dubai", Font.BOLD, 14));
        lblNomUser.setBounds(83, 11, 192, 24);
        panelHeader.add(lblNomUser);
        
        JLabel lblPerfil = new JLabel("ROL del Usuario");
   
        lblPerfil.setForeground(Color.WHITE);
        lblPerfil.setFont(new Font("Dubai", Font.BOLD, 14));
        lblPerfil.setBounds(83, 40, 192, 24);
        panelHeader.add(lblPerfil);
        
        JPanel panel = new JPanel();
        panel.setBackground(new Color(24, 52, 78));
        panel.setBounds(0, 0, 250, 75);
        panelHeader.add(panel);

        panelMenu.setBackground(new java.awt.Color(115, 120, 230));
        panelMenu.setPreferredSize(new java.awt.Dimension(250, 384));

        jScrollPane1.setBorder(null);

        menus.setBackground(new Color(24, 52, 78));
        menus.setLayout(new javax.swing.BoxLayout(menus, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane1.setViewportView(menus);

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
        );

        getContentPane().add(panelMenu, java.awt.BorderLayout.LINE_START);

        panelBody.setBackground(Color.WHITE);
        getContentPane().add(panelBody, java.awt.BorderLayout.CENTER);
        panelBody.setLayout(new BorderLayout(0, 0));
        

        setSize(new Dimension(1024, 768));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    public void activaMenuClientes() {
		
		menuClientes.setVisible(true);
		menuPropiedades.setVisible(false);
	}
    
    public void activaMenuPropiedades() {
		
		menuClientes.setVisible(false);
		menuPropiedades.setVisible(true);
	}
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    MenuClientes menuClientes = new MenuClientes();
    MenuPropiedades menuPropiedades = new MenuPropiedades();
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel menus;
    public static javax.swing.JPanel panelBody;
    private javax.swing.JPanel panelHeader;
    private javax.swing.JPanel panelMenu;
    private JLabel lblNewLabel;
    private JLabel lblIconUser;
    private JLabel lblNewLabel_1;
}
