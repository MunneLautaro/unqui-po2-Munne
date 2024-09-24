import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Cuadrado;


class TestCuadrado {
	private Cuadrado cuad;


	@BeforeEach
	void setUp() throws Exception {
	cuad  = new Cuadrado();
	
	}

	
	@Test
	public void testArea() {
		int area = cuad.getArea();
		assertEquals(area, 9);  // Compara el valor de x
		}
	@Test
	public void testPerimetro() {
		int perimetro = cuad.getPerimeter();
		assertEquals(perimetro, 12);  // Compara el valor de x
		}
	


}
