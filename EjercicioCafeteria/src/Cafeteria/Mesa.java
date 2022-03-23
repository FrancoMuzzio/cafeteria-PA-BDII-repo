package Cafeteria;

public class Mesa {
	protected int numero;
	protected Cuenta cuenta;
	protected Mozo mozo;
	protected boolean habilitada;
	
	public Mesa() {
	}
	
	public Mesa(Cuenta cuenta, Mozo mozo) {
		this.cuenta = cuenta;
		this.mozo = mozo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}

	public Mozo getMozo() {
		return mozo;
	}

	public void setMozo(Mozo mozo) {
		this.mozo = mozo;
	}
	
	public void habilitar() {
		this.habilitada = true;
		System.out.println("La mesa " + this.getNumero() + " esta habilitada.");
	}
	
	public void deshabilitar() {
		this.habilitada = false;
		System.out.println("La mesa " + this.getNumero() + " esta deshabilitada.");
	}
	
}
