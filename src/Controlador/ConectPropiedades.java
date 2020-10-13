package Controlador;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Modelo.DetallePropiedad;
import Modelo.Propiedad;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

public class ConectPropiedades {
	
	public ArrayList<Propiedad> listarPropiedades() {
		ArrayList<Propiedad> lista_prop = new ArrayList<Propiedad>();
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {

		      OracleCallableStatement st =
		    	        (OracleCallableStatement) conn.prepareCall( "BEGIN :1 := PKG_PROPIEDAD.FN_LISTAR_PROPIEDADES(); END;" );
		    	      st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      System.out.println( st.execute() );
		    	      ResultSet rs = st.getCursor( 1 );
			while (rs.next()) {
				Propiedad prop = new Propiedad();
				prop.setId_propiedad(rs.getInt(1));
				prop.setRol_propie(rs.getString(2));
				prop.setNom_propiedad(rs.getString(3));
				prop.setAvaluo_fiscal(rs.getInt(4));
				prop.setValor_compra(rs.getInt(5));
				prop.setDireccion(rs.getString(6));
				prop.setNom_propietario(rs.getString(7));
				prop.setRun_propie(rs.getString(8));
				prop.setPago_contri(rs.getInt(9));
				prop.setValor_gastoc(rs.getInt(10));
				prop.setValor_gastobasic(rs.getInt(11));
				prop.setNum_habita(rs.getInt(12));
				prop.setCant_max_ocu(rs.getInt(13));
				prop.setNum_banno(rs.getInt(14));
				prop.setNum_bodega(rs.getInt(15));
				prop.setNum_estaci(rs.getInt(16));
				prop.setNum_cocina(rs.getInt(17));
				prop.setJardin(rs.getString(18).charAt(0));
				prop.setMetros(rs.getInt(19));
				prop.setInven_valori(rs.getInt(20));
				prop.setValor_noche(rs.getInt(21));
				prop.setCaracteris(rs.getString(22));
				prop.setId_estado_pro(rs.getInt(23));
				prop.setId_comuna(rs.getInt(24));
				System.out.println(prop.getId_propiedad()+" "+prop.getRol_propie());
				lista_prop.add(prop);
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista_prop;
		
		
	}
	
	public Propiedad buscarPropiedad(String rol) {
		Propiedad prop = new Propiedad();
		boolean existe = false;
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {

		      OracleCallableStatement st =
		    	        (OracleCallableStatement) conn.prepareCall( "BEGIN :1 := PKG_PROPIEDAD.FN_LISTAR_UNA_PROPIEDAD('"+rol+"'); END;" );
		      		  //st.setString(1, rol);
		    	      
		    	      st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      System.out.println( st.execute() );

		    	      ResultSet rs = st.getCursor( 1 );
			while (rs.next()) {
				prop.setId_propiedad(rs.getInt(1));
				prop.setRol_propie(rs.getString(2));
				prop.setNom_propiedad(rs.getString(3));
				prop.setAvaluo_fiscal(rs.getInt(4));
				prop.setValor_compra(rs.getInt(5));
				prop.setDireccion(rs.getString(6));
				prop.setNom_propietario(rs.getString(7));
				prop.setRun_propie(rs.getString(8));
				prop.setPago_contri(rs.getInt(9));
				prop.setValor_gastoc(rs.getInt(10));
				prop.setValor_gastobasic(rs.getInt(11));
				prop.setNum_habita(rs.getInt(12));
				prop.setCant_max_ocu(rs.getInt(13));
				prop.setNum_banno(rs.getInt(14));
				prop.setNum_bodega(rs.getInt(15));
				prop.setNum_estaci(rs.getInt(16));
				prop.setNum_cocina(rs.getInt(17));
				prop.setJardin(rs.getString(18).charAt(0));
				prop.setMetros(rs.getInt(19));
				prop.setInven_valori(rs.getInt(20));
				prop.setValor_noche(rs.getInt(21));
				prop.setCaracteris(rs.getString(22));
				prop.setId_estado_pro(rs.getInt(23));
				prop.setId_comuna(rs.getInt(24));
				System.out.println(prop.getId_propiedad()+" "+prop.getRol_propie());
				existe = true;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			//JOptionPane.showMessageDialog(null, "La Propiedad buscada no existe, verifique los datos", "Información", JOptionPane.INFORMATION_MESSAGE);
			e.printStackTrace();
		}
		return prop;
		
		
	}
	
	public boolean registrarPropiedad(Propiedad prop) {
		boolean exito = false;
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {
			//String consulta = "SELECT PKG_PROPIEDAD.FN_LISTAR_PROPIEDADES FROM DUAL";
			//PreparedStatement st = conn.prepareStatement(consulta);
			
			CallableStatement  st =
		    	        conn.prepareCall( "{call PKG_PROPIEDAD.SP_CREAR_PROPIEDAD(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}" );
		      			st.setString(1, prop.getRol_propie());
		      			st.setString(2, prop.getNom_propiedad());
		      			st.setInt(3, prop.getAvaluo_fiscal());
		      			st.setInt(4, prop.getValor_compra());
		      			st.setString(5, prop.getDireccion());
		      			st.setString(6, prop.getNom_propietario());
		      			st.setString(7, prop.getRun_propie());
		      			st.setInt(8, prop.getPago_contri());
		      			st.setInt(9, prop.getValor_gastoc());
		      			st.setInt(10, prop.getValor_gastobasic());
		      			st.setInt(11, prop.getNum_habita());
		      			st.setInt(12, prop.getCant_max_ocu());
		      			st.setInt(13, prop.getNum_banno());
		      			st.setInt(14, prop.getNum_bodega());
		      			st.setInt(15, prop.getNum_estaci());
		      			st.setInt(16, prop.getNum_cocina());
		      			st.setString(17, String.valueOf(prop.getJardin()));
		      			st.setInt(18, prop.getMetros());
		      			st.setInt(19, prop.getInven_valori());
		      			st.setInt(20, prop.getValor_noche());
		      			st.setString(21, prop.getCaracteris());
		      			st.setInt(22, prop.getId_estado_pro());
		      			st.setInt(23, prop.getId_comuna());
		      			System.out.println( st.executeUpdate());
		      			exito = true;
		    	      //st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      //System.out.println( st.execute() );
		    	      //ResultSet rs = st.getCursor( 1 );


			
			
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
			if(e.getErrorCode()== 20001) {
				//handle error here, or convert to some specific error and use e.getMessage()
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "Ya existe una Propiedad con ese ROL, verifique los datos", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			exito = false;
		}
		return exito;
		
		
	}
	
	public boolean actualizarPropiedad(Propiedad prop) {
		boolean exito = false;
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {
			//String consulta = "SELECT PKG_PROPIEDAD.FN_LISTAR_PROPIEDADES FROM DUAL";
			//PreparedStatement st = conn.prepareStatement(consulta);
			
			CallableStatement  st =
		    	        conn.prepareCall( "{call PKG_PROPIEDAD.sp_update_all_propie(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}" );
						st.setString(1, prop.getDireccion());
		      			st.setString(2, prop.getNom_propietario());
		      			st.setInt(3, prop.getNum_banno());
		      			st.setString(4, prop.getCaracteris());
		      			st.setInt(5, prop.getNum_bodega());
		      			st.setInt(6, prop.getValor_gastoc());
		      			st.setString(7, String.valueOf(prop.getJardin()));
		      			st.setInt(8, prop.getNum_habita());
		      			st.setInt(9, prop.getCant_max_ocu());
		      			st.setInt(10, prop.getId_estado_pro());
		      			st.setInt(11, prop.getNum_estaci());
		      			st.setInt(12, prop.getInven_valori());
		      			st.setInt(13, prop.getValor_compra());
						st.setString(14, prop.getRol_propie());
		      			st.setInt(15, prop.getAvaluo_fiscal());
		      			st.setInt(16, prop.getPago_contri());
		      			st.setInt(17, prop.getMetros());
		      			st.setInt(18, prop.getValor_noche());
		      			st.setString(19, prop.getNom_propiedad());
		      			st.setString(20, prop.getRun_propie());
		      			st.setInt(21, prop.getValor_gastobasic());
		      			st.setInt(22, prop.getId_comuna());
		      			st.setInt(23, prop.getNum_cocina());
		      			System.out.println( st.executeUpdate());
		      			
		      			exito = true;
		    	      //st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      //System.out.println( st.execute() );
		    	      //ResultSet rs = st.getCursor( 1 );


			
			
		} catch (SQLException e) {
			// TODO: handle exception
			if(e.getErrorCode()== 20001) {
				//handle error here, or convert to some specific error and use e.getMessage()
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "La Propiedad no se pudo actualizar, verifique los datos", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			exito = false;
		}
		return exito;
		
		
	}
	
	public ArrayList<DetallePropiedad> detallePropiedad(String rol) {
		ArrayList<DetallePropiedad> lista_dp = new ArrayList<DetallePropiedad>();
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {

		      OracleCallableStatement st =
		    	        (OracleCallableStatement) conn.prepareCall( "BEGIN :1 := pkg_detalle_inv_propi.FN_DET_INVENT_PROPIEDAD('"+rol+"'); END;" );
		      		  //st.setString(1, rol);
		    	      
		    	      st.registerOutParameter( 1, OracleTypes.CURSOR );
		    	      System.out.println( st.execute() );

		    	      ResultSet rs = st.getCursor( 1 );
			while (rs.next()) {
				DetallePropiedad dp = new DetallePropiedad();
				dp.setId_propiedad(rs.getInt(1));
				dp.setRol(rs.getString(2));
				dp.setNombre_prop(rs.getString(3));
				dp.setId_inven(rs.getInt(4));
				dp.setNombre_inv(rs.getString(5));
				dp.setCosto(rs.getInt(6));
				dp.setNombre_tipo_inv(rs.getString(7));
				dp.setCantidad(rs.getInt(8));
				lista_dp.add(dp);
				
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return lista_dp;
		
		
	}
	
	public boolean actualizarDetallePropiedad(DetallePropiedad dprop) {
		boolean exito = false;
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {
			
			CallableStatement  st =
		    	        conn.prepareCall( "{call pkg_detalle_inv_propi.sp_agregar_inv_propie(?,?,?)}" );
		      			st.setString(1, dprop.getRol());
		      			st.setInt(2, dprop.getId_inven());
		      			st.setInt(3, dprop.getCantidad());

		      			System.out.println( st.executeUpdate());
		      			
		      			exito = true;

			
		} catch (SQLException e) {
			// TODO: handle exception
			if(e.getErrorCode()== 20001) {
				//handle error here, or convert to some specific error and use e.getMessage()
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "La Propiedad no se pudo actualizar, verifique los datos", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			exito = false;
		}
		return exito;
		
		
	}
	
	
	public boolean limpiarrDetallePropiedad(String rol) {
		boolean exito = false;
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {
			
			CallableStatement  st =
		    	        conn.prepareCall( "{call pkg_detalle_inv_propi.sp_eliminar_inventario_prop('"+rol+"')}" );
		      			System.out.println( st.executeUpdate());
		      			
		      			exito = true;

			
		} catch (SQLException e) {
			// TODO: handle exception
			if(e.getErrorCode()== 20001) {
				//handle error here, or convert to some specific error and use e.getMessage()
				System.out.println(e.getMessage());
				JOptionPane.showMessageDialog(null, "La Propiedad no se pudo actualizar, verifique los datos", "Error", JOptionPane.ERROR_MESSAGE);;
				}
			exito = false;
		}
		return exito;
		
		
	}
	
	
}
