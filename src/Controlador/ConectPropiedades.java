package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import Modelo.Propiedad;
import oracle.jdbc.OracleCallableStatement;
import oracle.jdbc.OracleTypes;

public class ConectPropiedades {

	public void InsertPropiedad() {
		
	}
	
	public ArrayList<Propiedad> listarPropiedades() {
		ArrayList<Propiedad> lista_prop = new ArrayList<Propiedad>();
		
		ConexionDB con = new ConexionDB();
		Connection conn = con.connect();
		
		try {
			//String consulta = "SELECT PKG_PROPIEDAD.FN_LISTAR_PROPIEDADES FROM DUAL";
			//PreparedStatement st = conn.prepareStatement(consulta);
			
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
		}
		return lista_prop;
		
		
	}
	
}
