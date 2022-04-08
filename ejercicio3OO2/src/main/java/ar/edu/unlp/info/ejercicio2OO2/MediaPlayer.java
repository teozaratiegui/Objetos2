package ar.edu.unlp.info.ejercicio2OO2;

public class MediaPlayer {
	private Media media;
	
	public void setMedia(Media media) {
		this.media = media;
	}
	
	public int reproducir() {
		return this.media.Play();
	}
}
