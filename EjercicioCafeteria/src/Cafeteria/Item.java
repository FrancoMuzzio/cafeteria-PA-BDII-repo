package Cafeteria;

public class Item {
	protected String nombre;
	protected boolean esComida;
	protected boolean esCaliente;
	protected String ingredientes;
	protected double precio;
	protected Menu menu;
	protected int numero;
	
	public Item() {
	}
	
	public Item(String nombre, boolean esComida, boolean esCaliente, String ingredientes, double precio,
			Menu menu) {
		super();
		this.nombre = nombre;
		this.esComida = esComida;
		this.esCaliente = esCaliente;
		this.ingredientes = ingredientes;
		this.precio = precio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public boolean isEsComida() {
		return esComida;
	}

	public void setEsComida(boolean esComida) {
		this.esComida = esComida;
	}

	public boolean isEsCaliente() {
		return esCaliente;
	}

	public void setEsCaliente(boolean esCaliente) {
		this.esCaliente = esCaliente;
	}

	public String getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(String ingredientes) {
		this.ingredientes = ingredientes;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public void preparar() {
		System.out.println("El item " + this.getNombre() + " fue preparado.");
	}
	
}
