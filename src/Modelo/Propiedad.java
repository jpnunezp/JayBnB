package Modelo;

public class Propiedad {
	
	int id_propiedad;
	String rol_propie;
	String nom_propiedad;
	int avaluo_fiscal;
	int valor_compra;
	String direccion;
	String nom_propietario;
	String run_propie;
	int pago_contri;
	int valor_gastoc;
	int valor_gastobasic;
	int num_habita;
	int cant_max_ocu;
	int num_banno;
	int num_bodega;
	int num_estaci;
	int num_cocina;
	char jardin;
	int metros;
	int inven_valori;
	int valor_noche;
	String caracteris;
	int id_estado_pro;
	int id_comuna;
	
	public Propiedad() {
		
	}

	public Propiedad(int id_propiedad, String rol_propie, String nom_propiedad, int avaluo_fiscal, int valor_compra,
			String direccion, String nom_propietario, String run_propie, int pago_contri, int valor_gastoc,
			int valor_gastobasic, int num_habita, int cant_max_ocu, int num_banno, int num_bodega, int num_estaci,
			int num_cocina, char jardin, int metros, int inven_valori, int valor_noche, String caracteris,
			int id_estado_pro, int id_comuna) {
		this.id_propiedad = id_propiedad;
		this.rol_propie = rol_propie;
		this.nom_propiedad = nom_propiedad;
		this.avaluo_fiscal = avaluo_fiscal;
		this.valor_compra = valor_compra;
		this.direccion = direccion;
		this.nom_propietario = nom_propietario;
		this.run_propie = run_propie;
		this.pago_contri = pago_contri;
		this.valor_gastoc = valor_gastoc;
		this.valor_gastobasic = valor_gastobasic;
		this.num_habita = num_habita;
		this.cant_max_ocu = cant_max_ocu;
		this.num_banno = num_banno;
		this.num_bodega = num_bodega;
		this.num_estaci = num_estaci;
		this.num_cocina = num_cocina;
		this.jardin = jardin;
		this.metros = metros;
		this.inven_valori = inven_valori;
		this.valor_noche = valor_noche;
		this.caracteris = caracteris;
		this.id_estado_pro = id_estado_pro;
		this.id_comuna = id_comuna;
	}

	public int getId_propiedad() {
		return id_propiedad;
	}

	public void setId_propiedad(int id_propiedad) {
		this.id_propiedad = id_propiedad;
	}

	public String getRol_propie() {
		return rol_propie;
	}

	public void setRol_propie(String rol_propie) {
		this.rol_propie = rol_propie;
	}

	public String getNom_propiedad() {
		return nom_propiedad;
	}

	public void setNom_propiedad(String nom_propiedad) {
		this.nom_propiedad = nom_propiedad;
	}

	public int getAvaluo_fiscal() {
		return avaluo_fiscal;
	}

	public void setAvaluo_fiscal(int avaluo_fiscal) {
		this.avaluo_fiscal = avaluo_fiscal;
	}

	public int getValor_compra() {
		return valor_compra;
	}

	public void setValor_compra(int valor_compra) {
		this.valor_compra = valor_compra;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNom_propietario() {
		return nom_propietario;
	}

	public void setNom_propietario(String nom_propietario) {
		this.nom_propietario = nom_propietario;
	}

	public String getRun_propie() {
		return run_propie;
	}

	public void setRun_propie(String run_propie) {
		this.run_propie = run_propie;
	}

	public int getPago_contri() {
		return pago_contri;
	}

	public void setPago_contri(int pago_contri) {
		this.pago_contri = pago_contri;
	}

	public int getValor_gastoc() {
		return valor_gastoc;
	}

	public void setValor_gastoc(int valor_gastoc) {
		this.valor_gastoc = valor_gastoc;
	}

	public int getValor_gastobasic() {
		return valor_gastobasic;
	}

	public void setValor_gastobasic(int valor_gastobasic) {
		this.valor_gastobasic = valor_gastobasic;
	}

	public int getNum_habita() {
		return num_habita;
	}

	public void setNum_habita(int num_habita) {
		this.num_habita = num_habita;
	}

	public int getCant_max_ocu() {
		return cant_max_ocu;
	}

	public void setCant_max_ocu(int cant_max_ocu) {
		this.cant_max_ocu = cant_max_ocu;
	}

	public int getNum_banno() {
		return num_banno;
	}

	public void setNum_banno(int num_banno) {
		this.num_banno = num_banno;
	}

	public int getNum_bodega() {
		return num_bodega;
	}

	public void setNum_bodega(int num_bodega) {
		this.num_bodega = num_bodega;
	}

	public int getNum_estaci() {
		return num_estaci;
	}

	public void setNum_estaci(int num_estaci) {
		this.num_estaci = num_estaci;
	}

	public int getNum_cocina() {
		return num_cocina;
	}

	public void setNum_cocina(int num_cocina) {
		this.num_cocina = num_cocina;
	}

	public char getJardin() {
		return jardin;
	}

	public void setJardin(char jardin) {
		this.jardin = jardin;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	public int getInven_valori() {
		return inven_valori;
	}

	public void setInven_valori(int inven_valori) {
		this.inven_valori = inven_valori;
	}

	public int getValor_noche() {
		return valor_noche;
	}

	public void setValor_noche(int valor_noche) {
		this.valor_noche = valor_noche;
	}

	public String getCaracteris() {
		return caracteris;
	}

	public void setCaracteris(String caracteris) {
		this.caracteris = caracteris;
	}

	public int getId_estado_pro() {
		return id_estado_pro;
	}

	public void setId_estado_pro(int id_estado_pro) {
		this.id_estado_pro = id_estado_pro;
	}

	public int getId_comuna() {
		return id_comuna;
	}

	public void setId_comuna(int id_comuna) {
		this.id_comuna = id_comuna;
	}
	
	
	

}
