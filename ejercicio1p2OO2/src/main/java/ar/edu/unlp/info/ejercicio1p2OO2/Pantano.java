package ar.edu.unlp.info.ejercicio1p2OO2;

public class Pantano implements Elemento {
	
	public double getProporciónAgua() {
		return 0.7;
	}
	
	public double getProporciónTierra() {
		return 0.3;
	}
	
	@Override
	public int hashCode() {
		return 333;
	}
}
