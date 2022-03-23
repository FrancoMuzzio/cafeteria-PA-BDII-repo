package Cafeteria;

public class Menu {
	protected String periodo;
	protected String items;
	protected int numero;

	public Menu() {
	}
	
	public Menu(String periodo, String items) {
		super();
		this.periodo = periodo;
		this.items = items;
	}

	public String getPeriodo() {
		return periodo;
	}

	public void setPeriodo(String periodo) {
		this.periodo = periodo;
	}
	
	public String getItems() {
		return items;
	}
	
	public void setItems(String items) {
		this.items = items;
	}
	
	public void entregar(String periodo) {
		System.out.println("Menú del periodo '" + this.getPeriodo() + "' entregado.");
	}
	
	public void retirar(String periodo) {
		System.out.println("Menú del periodo '" + this.getPeriodo() + "' retirado.");
	}
	
	public void mostrarBebidas(String periodo) {
		System.out.println("Mostrando bebidas (DB).");
	}
	
	public void mostrarComidas(String periodo) {
		System.out.println("Mostrando comidas (DB).");
	}
	
	public void AgregarItem(Item item) {
		System.out.println("Agregando item (DB).");
	}
	
	public void EliminarItem(Item item) {
		System.out.println("Eliminando item (DB).");
	}
		

}
