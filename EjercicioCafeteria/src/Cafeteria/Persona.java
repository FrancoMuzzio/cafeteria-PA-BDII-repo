package Cafeteria;

public class Persona {
	protected String nombre;
	protected int dni;
	
	public Persona() {
	}
	
	public Persona(String nombre, int dni) {
		this.nombre = nombre;
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	
}
