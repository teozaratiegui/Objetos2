package ar.edu.unlp.info.ejercicio1p2OO2;

public interface Topografía {
	
	public double getProporciónAgua();
	
	public double getProporciónTierra();
	
	public boolean compararTopografiaAtomica(TopografíaAtómica topografia);
	
	public boolean compararTopografiaMixta(TopografíaMixta topografia);
}
