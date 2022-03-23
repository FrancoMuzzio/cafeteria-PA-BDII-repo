package Cafeteria;

public class Mozo extends Persona{

	public Mozo() {
		super();
	}

	public Mozo(String nombre, int dni) {
		super(nombre, dni);
	}
	
	public void limpiarMesa(Mesa mesa) {
		System.out.println(this.getNombre() + " limpio la mesa " + mesa.getNumero());
	}

}
