import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.EquipoDeTrabajo;
import ar.edu.unq.po2.tp3.Multioperador;
import ar.edu.unq.po2.tp3.PersonaEquipo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

class TestEquipoDeTrabajo {
	private EquipoDeTrabajo eq1;
	private PersonaEquipo pame;
    private PersonaEquipo lauta;
    private PersonaEquipo alan;
	@BeforeEach
	void setUp() throws Exception {
		pame = new PersonaEquipo("Pame", "Cardozo", 27);
		lauta = new PersonaEquipo("Lauta", "Munné", 23);
		alan = new PersonaEquipo("Alan", "Tubio", 24);
		eq1 = new EquipoDeTrabajo("Equipo 1");
		//Se agregan los numeros. Un solo par y nueve impares
		eq1.agregarIntegrante(pame);
		eq1.agregarIntegrante(lauta);
		eq1.agregarIntegrante(alan);
	}
	 
	
	@Test
	public void testPromedioDeEdad() {
	double promEd= eq1.promedioDeEdades();
	assertEquals(promEd, 24);
	}
	
	@Test
	public void testNombreDeEquipo() {
	String nombreEqui= eq1.getNombreDeEquipo();
	assertEquals(nombreEqui, "Equipo 1");
	}
}	