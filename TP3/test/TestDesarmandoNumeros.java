import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.DesarmandoNumeros2;


public class TestDesarmandoNumeros {
	
	private DesarmandoNumeros2 desarmNum; 
	
	/**
	* Crea un escenario de test básico, que consiste en un contador
	* con 10 enteros
	*
	* @throws Exception
	*/
	@BeforeEach
	public void setUp() throws Exception {
	desarmNum = new DesarmandoNumeros2();
	//Se agregan los numeros. Un solo par y nueve impares
	desarmNum.addNumber(2);
	desarmNum.addNumber(4);
	desarmNum.addNumber(6);
	desarmNum.addNumber(8);
	desarmNum.addNumber(222);
	
	}
	@Test
	public void elMayor() {
		
	int amount = desarmNum.elMayor(3, 6);
	// I check the amount is the expected one
	assertEquals(amount, 6);
	}
	@Test
	public void cantPares() {
	int amount = desarmNum.cantPares(88);
	// I check the amount is the expected one
	assertEquals(amount, 2);
	}
	@Test
	public void elNumeroConMasPares() {
		
	int amount = desarmNum.elNumeroConMasPares();
	// I check the amount is the expected one
	assertEquals(amount, 222);
	}
}
