import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unq.po2.tp3.Point;


class TestPoint {
	private Point p;
	private Point p2;
	
	@BeforeEach
	void setUp() throws Exception {
		p  = new Point();
		p2 = new Point(2, 1);
		p.move(4, 2);
		p.add(p2);
		
		
		//Se agregan los numeros. Un solo par y nueve impares
	}
	@Test
	public void testPuntoActualX() {
		
	int x= p.getX();
	assertEquals(x,(4));
	}
	@Test
	public void testPuntoActualY() {
		
	int y= p.getY();
	assertEquals(y,(2));
	}
	
	@Test
	public void testMove() {
	int y= p.getY();
	int x= p.getX();
	assertEquals(x,(4));
	assertEquals(y,(2));
	}
	
	@Test
	public void testAdd() {
	Point resultado = p.add(p2);
	assertEquals(6, resultado.getX());  // Compara el valor de x
	assertEquals(3, resultado.getY());  // Compara el valor de y
	}
}
