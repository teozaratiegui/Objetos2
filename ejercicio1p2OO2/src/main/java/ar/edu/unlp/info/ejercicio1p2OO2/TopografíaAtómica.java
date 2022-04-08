package ar.edu.unlp.info.ejercicio1p2OO2;

public class TopografíaAtómica implements Topografía {
	private Elemento elemento;
	
	public TopografíaAtómica(Elemento elemento) {
		this.elemento = elemento;
	}
	
	public double getProporciónAgua() {
		return this.elemento.getProporciónAgua();
	}
	
	public double getProporciónTierra() {
		return this.elemento.getProporciónTierra();
	}
	
	 @Override
		public boolean equals (Object t1) {
		if (t1!=null) {
			Topografía t2=(Topografía) t1;
			return t2.compararTopografiaAtomica(this);
		}
		else
			return false;

	 }

	public boolean compararTopografiaAtomica (TopografíaAtómica t1) {
		return this.getProporciónAgua() == t1.getProporciónAgua();
	}
		
	public boolean compararTopografiaMixta(TopografíaMixta t) {
		return false;
	}
		
	
}
