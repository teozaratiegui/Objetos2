package ar.edu.unlp.info.ejercicio1p2OO2;

public class Agua implements Elemento {

	public double getProporciónAgua() {
		return 1;
	}
	
	public double getProporciónTierra() {
		return 0;
	}
	
	@Override
	public int hashCode() {
		return 111;
	}
	
}
