package ar.edu.unlp.info.ejercicio2OO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ar.edu.unlp.info.ejercicio2OO2.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class TestMediaPlayer {
	private MediaPlayer media;
	
	@BeforeEach
	public void setUp() {
		media = new MediaPlayer();
	}

	@Test
	public void testAudio() {
		this.media.setMedia(new Audio());
		assertEquals(this.media.reproducir(),3);
	}
	
	@Test
	public void testVideoFile() {
		this.media.setMedia(new VideoFile());
		assertEquals(this.media.reproducir(),4);
	}
	
	@Test
	public void testVideoStream() {
		this.media.setMedia(new Adapter());
		assertEquals(this.media.reproducir(),2);
	}
}
