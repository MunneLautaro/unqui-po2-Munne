package ar.edu.unq.po2.tpStrategy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testEncriptadoReversa {
	private EncriptadoReversa eR;
	@BeforeEach
	void setUp() throws Exception {
		eR = new EncriptadoReversa();
	}

	@Test
	void testEncriptarER() {
		assertEquals("aloh", eR.encriptar("hola"));
		assertEquals("", eR.encriptar(""));
	}
	@Test
	void testDesencriptarER() {
		assertEquals("hola", eR.desencriptar("aloh"));
		assertEquals("", eR.encriptar(""));
	}

}
