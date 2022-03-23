package Cafeteria;

public class Cliente extends Persona{
	protected int numero;
	
	public Cliente() {
		super();
	}

	public Cliente(String nombre, int dni) {
		super(nombre, dni);
	}
	
	public void pagar(Cuenta cuenta) {
		System.out.println(this.getNombre() + " pago la cuenta " + cuenta.getNumero());
	}
}
