import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Persona;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

class PersonaTest {
	private Persona per;
	private Persona per1;
	private Persona per3;
	
	@BeforeEach
	void setUp() throws Exception {
		per  = new Persona("Pame", LocalDate.of(1997, 11, 5), 26);
		per1 = new Persona("Juan", LocalDate.of(1998, 11, 5), 28);
		per3 = Persona.creacionDePersona("Lauta", LocalDate.of(2001, 06, 06));
	}
	 
	@Test
	public void testMenorQue() {
	boolean esMenor= per1.menorQue(per);
	assertEquals(esMenor, false);
	}
	
	@Test
	public void testNuevaPersonaEdad() {
	int edad= per3.getEdad();
	assertEquals(edad, 23);
	}
	@Test
	public void testNuevaPersonaNombre() {
	String nombre= per3.getNombre();
	assertEquals(nombre, "Lauta");
	}
	
}	