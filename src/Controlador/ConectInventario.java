package Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.Inventario;
import Modelo.Propiedad;
import Modelo.TipoInventario;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

public class ConectInventario {

	public ArrayList<Inventario> listarInventarios() {
		ArrayList<Inventario> lista_invent = new ArrayList<Inventario>();
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {

		      OracleCallableStatement st =
		    	        (OracleCallableStatement) conn.prepareCall( "BEGIN :1 := PKG_INVENTARIO.FN_LISTAR_INVENTARIOS(); END;" );
		    	      st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      System.out.println( st.execute() );
		    	      ResultSet rs = st.getCursor( 1 );
			while (rs.next()) {
				Inventario inv = new Inventario();
				inv.setId_iventario(rs.getInt(1));
				inv.setNombre(rs.getString(2));
				inv.setCosto(rs.getInt(3));
				inv.setEstado(rs.getString(4).charAt(0));
				inv.setTipo_inventario(rs.getInt(5));
				lista_invent.add(inv);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista_invent;
		
		
	}
	
	public Inventario buscarInventario(String nombre_inv) {
		Inventario inv = new Inventario();
		boolean existe = false;
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {

		      OracleCallableStatement st =
		    	        (OracleCallableStatement) conn.prepareCall( "BEGIN :1 := PKG_INVENTARIO.FN_LISTAR_INVENTARIO('"+nombre_inv+"'); END;" );
		      		  //st.setString(1, rol);
		    	      
		    	      st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      System.out.println( st.execute() );

		    	      ResultSet rs = st.getCursor( 1 );
			while (rs.next()) {
				inv.setId_iventario(rs.getInt(1));
				inv.setNombre(rs.getString(2));
				inv.setCosto(rs.getInt(3));
				inv.setEstado(rs.getString(4).charAt(0));
				inv.setTipo_inventario(rs.getInt(5));

				existe = true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			//JOptionPane.showMessageDialog(null, "La Propiedad buscada no existe, verifique los datos", "Información", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
		return inv;
		
		
	}
	
	public boolean registrarInventario(Inventario inv) {
		boolean exito = false;
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {
			//String consulta = "SELECT PKG_PROPIEDAD.FN_LISTAR_PROPIEDADES FROM DUAL";
			//PreparedStatement st = conn.prepareStatement(consulta);
			
			CallableStatement  st =
		    	        conn.prepareCall( "{call PKG_INVENTARIO.SP_CREAR_INVENTARIO(?,?,?,?)}" );
		      			st.setString(1, inv.getNombre());
		      			st.setInt(2, inv.getCosto());
		      			st.setString(3, String.valueOf(inv.getEstado()));
		      			st.setInt(4, inv.getTipo_inventario());

		      			System.out.println( st.executeUpdate());
		      			exito = true;
		    	      //st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      //System.out.println( st.execute() );
		    	      //ResultSet rs = st.getCursor( 1 );


			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
			if(e.getErrorCode()== 20011) {
				//handle error here, or convert to some specific error and use e.getMessage()
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Ya existe un Inventario con ese Nombre, verifique los datos", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			exito = false;
		}
		return exito;
		
		
	}
	
	public ArrayList<TipoInventario> listarTipoInventarios() {
		ArrayList<TipoInventario> lista_invent = new ArrayList<TipoInventario>();
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {

		      OracleCallableStatement st =
		    	        (OracleCallableStatement) conn.prepareCall( "BEGIN :1 := PKG_INVENTARIO.FN_LISTAR_TIPOINVENT(); END;" );
		    	      st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      System.out.println( st.execute() );
		    	      ResultSet rs = st.getCursor( 1 );
			while (rs.next()) {
				TipoInventario inv = new TipoInventario();
				inv.setId_tipo(rs.getInt(1));
				inv.setNombre_tipo(rs.getString(2));
				lista_invent.add(inv);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista_invent;
		
		
	}
	
	
}
