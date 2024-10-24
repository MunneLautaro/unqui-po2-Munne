package ar.edu.unq.po2.tpStrategy;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class TestEncriptadorNaive {
	private EncriptadoReversa ec;
	private IEncriptarStrategy ec2;
	private IEncriptarStrategy ec3;
	private EncriptadorNaive ecn;
	
	
	@BeforeEach
	void setUp() throws Exception {
		ec  = new EncriptadoReversa();
		ec2 = mock(IEncriptarStrategy.class);
		ec3 = mock(IEncriptarStrategy.class);
		ecn = new EncriptadorNaive();
		ecn.setEstrategia(ec);
	}

	@Test
	void test() {
		assertEquals("aloh", ecn.encriptar("hola"));
	}

}
