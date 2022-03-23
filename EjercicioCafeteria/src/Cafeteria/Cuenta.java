package Cafeteria;

public class Cuenta {
	protected int numero;
	protected Cliente cliente;
	protected double total;
	protected boolean pagada;
	
	public Cuenta() {
	}
	
	public Cuenta(int numero, Cliente cliente, double total, boolean pagada) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.total = total;
		this.pagada = pagada;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public boolean isPagada() {
		return pagada;
	}

	public void setPagada(boolean pagada) {
		this.pagada = pagada;
	}
	
	
	public void agregarItem(Item item) {
		this.total = this.total + item.getPrecio();
		System.out.println("El item " + item.getNombre() + " se ha añadido a la cuenta " + this.getNumero() + ".");
	}
	
	public void quitarItem(Item item) {
		this.total = this.total - item.getPrecio();
		System.out.println("El item " + item.getNombre() + " se ha quitado a la cuenta " + this.getNumero() + ".");
	}
	

	
}
