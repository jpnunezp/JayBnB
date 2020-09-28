package Controlador;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class ConexionDB {

    public Connection connect() {
        Connection conect = null;
        try {
            conect = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "test", "test");
            System.out.println("Conectado");
        } catch (Exception ex2) {
            System.out.println("No se Pudo Conectar a la Base de Datos..."+ex2);
        }
        return conect;
    } 
    
	
}
