package ar.edu.unq.po2.tp8;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class testEnum1 {
	
	@BeforeEach
	

	@Test
    public void testSiguiente() {
        assertEquals(LesionesDermatologicas.ROJO, LesionesDermatologicas.MIEL.getSiguiente());
	}
}
