package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JOptionPane;

import Modelo.Usuario;

public class ValidarLogin {
	
    static Statement st;
    static ResultSet rs;
    static ResultSetMetaData rsmeta;
    
    public boolean getPass(String username, String pass) {
    	Usuario user = new Usuario();
    	Hasher hash = new Hasher();
    	boolean resultado = false;
    	ConexionDB conn = new ConexionDB();
    	Connection cnx = conn.connect();
    	
    	String consultasql = "SELECT au.password FROM AUTH_USER au WHERE au.username = ?";

    	boolean existe = false;
    	
    	try {
			PreparedStatement ps = cnx.prepareStatement(consultasql);
			ps.setString(1, username);
			ResultSet rs = ps.executeQuery();
			
			if(username.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Debe llenar el campo Usuario");
			}else {
				while(rs.next()) {
					existe = true;
					user.setPassword(rs.getString("password"));
					
				}
				if(existe == false) {
					System.out.println("El usuario ingresado no existe");
				}
			}
			try {
				if(hash.checkPassword(pass, user.getPassword())) {
					System.out.println("La Password coincide");
					resultado = true;
				}else {
					System.out.println("La Contraseña no Coincide");
					resultado = false;
				}
			} catch (Exception e) {
				// TODO: handle exception
				return resultado;
			}

			
			cnx.close();
    		
		} catch (SQLException e) {
			// TODO: handle exception
			JOptionPane.showMessageDialog(null, "Error:"+e);
		}
    	
    	
    	return resultado;
    }    
    
}
