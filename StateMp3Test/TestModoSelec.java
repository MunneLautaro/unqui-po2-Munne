package ar.edu.unq.po2.StateMp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestModoSelec {

	private MP3 mp3;
	private ModoSeleccion ms;
	private ModoReprod mr;
	private ModoPausa mp;
	
	@BeforeEach
	void setUp() throws Exception {
		mp3 = mock (MP3.class);
		ms  = new ModoSeleccion();
		mr  = mock (ModoReprod.class);
		mp  = mock (ModoPausa.class);
	}
	@Test
	void testPlay() {
		ms.play(mp3);
		verify(mp3).setModo(any());
	}

}
