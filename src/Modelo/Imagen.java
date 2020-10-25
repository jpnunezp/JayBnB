package Modelo;

public class Imagen {

	int idimagen;
	String ruta;
	String nombre;
	int idpropiedad;
	
	public Imagen() {
		
	}
	
	public Imagen(int idimagen, String ruta, String nombre, int idpropiedad) {
		this.idimagen = idimagen;
		this.ruta = ruta;
		this.nombre = nombre;
		this.idpropiedad = idpropiedad;
	}

	public int getIdimagen() {
		return idimagen;
	}

	public void setIdimagen(int idimagen) {
		this.idimagen = idimagen;
	}

	public String getRuta() {
		return ruta;
	}

	public void setRuta(String ruta) {
		this.ruta = ruta;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getIdpropiedad() {
		return idpropiedad;
	}

	public void setIdpropiedad(int idpropiedad) {
		this.idpropiedad = idpropiedad;
	}
	
	
	
	
}
