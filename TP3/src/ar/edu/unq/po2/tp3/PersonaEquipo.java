package ar.edu.unq.po2.tp3;

public class PersonaEquipo {
	private String nombre;
	private String apellido;
	private int edad;
	
	public PersonaEquipo(String nombre, String apellido, int edad) {
		this.nombre  = nombre;
		this.apellido= apellido;
		this.edad    = edad;
		
	}
	
	
	public String getApellido() {
		return apellido;
	}
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
}
