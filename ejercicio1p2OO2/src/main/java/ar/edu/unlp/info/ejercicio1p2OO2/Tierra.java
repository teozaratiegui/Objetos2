package ar.edu.unlp.info.ejercicio1p2OO2;

public class Tierra implements Elemento {

	public double getProporciónAgua() {
		return 0;
	}
	
	public double getProporciónTierra() {
		return 1;
	}
	
	@Override
	public int hashCode() {
		return 222;
	}
	
}
