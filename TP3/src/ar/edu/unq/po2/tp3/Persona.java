package ar.edu.unq.po2.tp3;

import java.time.LocalDate;

import java.time.ZoneId;
import java.util.Date;
public class Persona {
    private int edad;       
    private LocalDate fechaNacimiento;
    private String nombre;
    
	public Persona(String nombre, LocalDate fechaNacimiento, int edad) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
	}
	public String getNombre() {
        return nombre;
    }

    // Método para obtener la fecha de nacimiento
    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    // Método para calcular la edad
    public int getEdad() {
        return edad;
    }
    public int getEdad2() {
        return ((LocalDate.now().getYear()) - (fechaNacimiento.getYear()));
    }
    
        public boolean menorQue(Persona persona) {
        	return this.getEdad() < persona.getEdad();
        }
        
        public static Persona creacionDePersona(String nombre, LocalDate fechaNacimiento){
        	 LocalDate fechaNacimientoLocalDate = fechaNacimiento;
        	int edadDePersona = (LocalDate.now().getYear()) - (fechaNacimientoLocalDate.getYear());
        	return new Persona(nombre, fechaNacimientoLocalDate, edadDePersona);
        }
	
}
