package Modelo;

public class DetallePropiedad {
	
	int id_propiedad;
	String rol;
	String nombre_prop;
	int id_inven;
	String nombre_inv;
	int costo;
	String nombre_tipo_inv;
	int cantidad;
	
	public DetallePropiedad() {
		// TODO Auto-generated constructor stub
	}

	public DetallePropiedad(int id_propiedad, String rol, String nombre_prop, int id_inven, String nombre_inv,
			int costo, String nombre_tipo_inv, int cantidad) {
		this.id_propiedad = id_propiedad;
		this.rol = rol;
		this.nombre_prop = nombre_prop;
		this.id_inven = id_inven;
		this.nombre_inv = nombre_inv;
		this.costo = costo;
		this.nombre_tipo_inv = nombre_tipo_inv;
		this.cantidad = cantidad;
	}

	public int getId_propiedad() {
		return id_propiedad;
	}

	public void setId_propiedad(int id_propiedad) {
		this.id_propiedad = id_propiedad;
	}

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}

	public String getNombre_prop() {
		return nombre_prop;
	}

	public void setNombre_prop(String nombre_prop) {
		this.nombre_prop = nombre_prop;
	}

	public int getId_inven() {
		return id_inven;
	}

	public void setId_inven(int id_inven) {
		this.id_inven = id_inven;
	}

	public String getNombre_inv() {
		return nombre_inv;
	}

	public void setNombre_inv(String nombre_inv) {
		this.nombre_inv = nombre_inv;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public String getNombre_tipo_inv() {
		return nombre_tipo_inv;
	}

	public void setNombre_tipo_inv(String nombre_tipo_inv) {
		this.nombre_tipo_inv = nombre_tipo_inv;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	

}
