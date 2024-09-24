import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Rectangulo;


class TestRectangulo {
	private Rectangulo rectan;


	@BeforeEach
	void setUp() throws Exception {
	rectan  = new Rectangulo();
	
	}

	
	@Test
	public void testArea() {
		int area = rectan.getArea();
		assertEquals(area, 2);  // Compara el valor de x
		}
	@Test
	public void testPerimetro() {
		int perimetro = rectan.getPerimeter();
		assertEquals(perimetro, 6);  // Compara el valor de x
		}
	@Test
	public void testOrientacion() {
		String recOri = rectan.getOrientation();
		assertEquals(recOri, "Vertical");  // Compara el valor de x
		}


}
