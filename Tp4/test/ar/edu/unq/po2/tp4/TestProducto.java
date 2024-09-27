package ar.edu.unq.po2.tp4;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class TestProducto {
	private Producto prod;
	private ProductoPrimeraNecesidad prod2;
	private Producto prod3;
	private SuperMercado superM;
	
	@BeforeEach
	void setUp() throws Exception {
		prod  = new Producto("Tomate", 240);
		prod2 = new ProductoPrimeraNecesidad("Arroz", 100, 8);
		prod3 = new ProductoPrimeraNecesidad("Papitas", 50);
		prod3.cambiarEstadoDePrecio(true);
		superM = new SuperMercado("Campeones", "delhi 1533");
		superM.agregarProducto(prod);
		superM.agregarProducto(prod2);
		superM.agregarProducto(prod3);
	}

	@Test
	void testProdNormal() {
		double precio= prod.getPrecio();
		assertEquals(precio,240);
	}
	@Test 
	void testProdPrecioCuidado() {
		double precio= prod3.getPrecio();
		assertEquals(precio,45);
	}
	@Test
	void testProdPrecioCuidadoPerso() {
		double precio= prod2.getPrecio();
		assertEquals(precio,92);
	}
	@Test
	void testProdTotalesSM() {
		int productos= superM.cantidadDeProductos();
		assertEquals(productos, 3);
	}
	@Test
	void testPrecioTotalConDescuentoIncluidos() {
		double precios= superM.precioTotales();
		assertEquals(precios, 377);
	}
	
}
