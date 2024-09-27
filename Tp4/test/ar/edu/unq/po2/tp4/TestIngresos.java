package ar.edu.unq.po2.tp4;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestIngresos {
	private Trabajador t;
	private Ingreso ingreso1;
	private IngresoPorHsExtras ingreso2;
	private IngresoPorHsExtras ingreso3;
	
	@BeforeEach
	void setUp() throws Exception {
		ingreso1 = new Ingreso("1", "x", 3000);
		ingreso2 = new IngresoPorHsExtras("1", "x", 3000, 5);
		ingreso3 = new IngresoPorHsExtras("1", "x", 3000, 6);
		t = new Trabajador();
;		t.agregarIngreso(ingreso1);
		t.agregarIngreso(ingreso2);
		t.agregarIngreso(ingreso3);
	}

	@Test
	void testMontoPercibido() {
		double totalPerc = t.getTotalPercibido();
		assertEquals(totalPerc,9000);
	}
	@Test
	void testMontoImponible() {
		double totalPerc = t.getMontoImponible();
		assertEquals(totalPerc,3000);
	}
	@Test
	void testMontoDeImpuestos() {
		double totalPerc = t.getImpuestoAPagar();
		assertEquals(totalPerc,60);
	}
}
