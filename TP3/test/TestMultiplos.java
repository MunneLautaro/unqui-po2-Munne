import ar.edu.unq.po2.tp3.Multiplos;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMultiplos {

	private Multiplos multNum; 
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	multNum = new Multiplos();
	}
	@Test
	public void elMayorMultiplo() {
		
	int amount = multNum.elMayorMultiplo(3, 9);
	// I check the amount is the expected one
	assertEquals(amount, 999);
	}
	

}
//import static org.junit.jupiter.api.Assertions.assertEquals;



