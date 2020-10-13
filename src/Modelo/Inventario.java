package Modelo;

public class Inventario {
	
	int id_iventario;
	String nombre;
	int costo;
	char estado;
	int tipo_inventario;
	
	public Inventario() {
		
	}

	public Inventario(int id_iventario, String nombre, int costo, char estado, int tipo_inventario) {
		this.id_iventario = id_iventario;
		this.nombre = nombre;
		this.costo = costo;
		this.estado = estado;
		this.tipo_inventario = tipo_inventario;
	}

	public int getId_iventario() {
		return id_iventario;
	}

	public void setId_iventario(int id_iventario) {
		this.id_iventario = id_iventario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCosto() {
		return costo;
	}

	public void setCosto(int costo) {
		this.costo = costo;
	}

	public char getEstado() {
		return estado;
	}

	public void setEstado(char estado) {
		this.estado = estado;
	}

	public int getTipo_inventario() {
		return tipo_inventario;
	}

	public void setTipo_inventario(int tipo_inventario) {
		this.tipo_inventario = tipo_inventario;
	}
	
	

}
