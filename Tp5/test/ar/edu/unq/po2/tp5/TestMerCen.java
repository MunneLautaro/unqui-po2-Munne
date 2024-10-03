package ar.edu.unq.po2.tp5;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMerCen {
	private MercadoCentral mc;
	private MercadoCentral mc2;
	private MercadoCentral mc3;
	private Producto prod;
	private ProductoDeCooperativa prodCoop;
	private AgenciaRecaudadora ag1;
	private Factura fac;
	
	@BeforeEach
	void setUp() throws Exception {
		fac      = new Factura(5000, 2, 1000);
		ag1      = new AgenciaRecaudadora();
		mc       = new MercadoCentral();
		mc2      = new MercadoCentral();
		mc3      = new MercadoCentral();
		prod     = new Producto(5, "Arroz", 200);
		prodCoop = new ProductoDeCooperativa(5, "Papas", 100);
		mc3.registrarProducto(prod);
		mc2.registrarProducto(prod);
		mc2.registrarProducto(prod);
		mc2.registrarProducto(prod);
		mc2.registrarProducto(prod);
		mc2.registrarProducto(prod);
		mc.registrarFactura(fac, ag1);
	}

	@Test
	void testTotalAPagar() {
		double montoTotal = mc3.montoTotalAPagar();
		assertEquals(montoTotal,200);
	}
	
	@Test
	void testTotalAPagarPeroNoHayStock() {
		double montoTotal = mc2.montoTotalAPagar();
		assertEquals(montoTotal,800);
	}
	@Test
	void testMontoAPagarDeFacturas() {
		double montoTotal = mc.montoTotalAPagar();
		assertEquals(montoTotal,12000);
	}

}