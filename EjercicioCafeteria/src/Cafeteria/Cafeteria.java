package Cafeteria;

public class Cafeteria {
	protected String empresa;
	protected int numeroFranquicia;
	protected String direccion;
	protected Menu menuManana;
	protected Menu menuTarde;
	protected Menu menuNoche;
	
	public Cafeteria() {
	}
	
	public Cafeteria(String empresa, int numeroFranquicia, String direccion, Menu menuManana, Menu menuTarde, Menu menuNoche) {
		this.empresa = empresa;
		this.numeroFranquicia = numeroFranquicia;
		this.direccion = direccion;
		this.menuManana = menuManana;
		this.menuTarde = menuTarde;
		this.menuNoche = menuNoche;
	}
	
	public Menu getMenuManana() {
		return menuManana;
	}

	public void setMenuManana(Menu menuManana) {
		this.menuManana = menuManana;
	}

	public Menu getMenuTarde() {
		return menuTarde;
	}

	public void setMenuTarde(Menu menuTarde) {
		this.menuTarde = menuTarde;
	}

	public Menu getMenuNoche() {
		return menuNoche;
	}

	public void setMenuNoche(Menu menuNoche) {
		this.menuNoche = menuNoche;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public int getNumeroFranquicia() {
		return numeroFranquicia;
	}

	public void setNumeroFranquicia(int numeroFranquicia) {
		this.numeroFranquicia = numeroFranquicia;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public void abrir() {
		System.out.println("La cafeteria esta abierta.");
	}
	
	
	public void cerrar() {
		System.out.println("La cafeteria esta cerrada.");
	}
}

