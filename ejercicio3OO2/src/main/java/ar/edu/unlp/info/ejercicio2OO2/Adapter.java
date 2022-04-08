package ar.edu.unlp.info.ejercicio2OO2;

public class Adapter extends Media {
	private VideoStream video;
	
    public Adapter() {
    	this.video = new VideoStream();
    }
    
	public int Play() {
		return this.video.reproduce();
	}

}
