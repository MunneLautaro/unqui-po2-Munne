import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Multioperador;

class TestMultiop {
	private Multioperador multiOp; 
	
	@BeforeEach
	void setUp() throws Exception {
		multiOp = new Multioperador();
		//Se agregan los numeros. Un solo par y nueve impares
		multiOp.addNumber(2);
		multiOp.addNumber(4);
		multiOp.addNumber(6);
		multiOp.addNumber(8);
		multiOp.addNumber(1);
	}

	
	@Test
	public void sumaTotal() {
		
	int amount = multiOp.suma();
	// I check the amount is the expected one
	assertEquals(amount, 21);
	}
	@Test
	public void restaTotal() {
		
	int amount = multiOp.resta();
	// I check the amount is the expected one
	assertEquals(amount, -21);
	}
	@Test
	public void prodTotal() {
		
	int amount = multiOp.multiplicacion();
	// I check the amount is the expected one
	assertEquals(amount, 384);
	}
	

}
