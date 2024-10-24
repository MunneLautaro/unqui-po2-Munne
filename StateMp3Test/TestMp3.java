package ar.edu.unq.po2.StateMp3;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestMp3 {
	private MP3 mp3;
	private ModoSeleccion ms;
	private ModoReprod mr;
	private ModoPausa mp;
	
	@BeforeEach
	void setUp() throws Exception {
		mp3 = new MP3();
		ms  = mock (ModoSeleccion.class);
		mr  = mock (ModoReprod.class);
		mp  = mock (ModoPausa.class);
	}

	@Test
	void testPlay() {
		mp3.setModo(ms);
		mp3.play();
		verify(ms).play(mp3);
	}

	@Test
	void testPause() {
		mp3.setModo(mr);
		mp3.pause();
		verify(mr).pause(mp3);
	}
	@Test
	void testStop() {
		mp3.setModo(mr);
		mp3.stop();
		verify(mr).stop(mp3);
	}
	@Test
	void testPause2() {
		mp3.setModo(mp);
		mp3.pause();
		verify(mp).pause(mp3);
	}
	@Test
	void testStop2() {
		mp3.setModo(mp);
		mp3.stop();
		verify(mp).stop(mp3);
	}
}
