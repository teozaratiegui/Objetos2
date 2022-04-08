package ar.edu.unlp.info.ejercicio1p2OO2;

import java.util.List;
import java.util.ArrayList;

public class TopografíaMixta implements Topografía {
	private ArrayList<Topografía> partes = new ArrayList<>(4);
	
	public TopografíaMixta(ArrayList<Topografía> partes) {
		this.partes = partes;
	}
	
	public ArrayList<Topografía> getComponents() {
		return this.partes;
	}
	
	public double getProporciónAgua() {
		return this.partes.stream().mapToDouble(p -> p.getProporciónAgua()).sum() / 4;
	}
	
	public double getProporciónTierra() {
		return this.partes.stream().mapToDouble(p -> p.getProporciónTierra()).sum() / 4;
	}
	
	public boolean compararTopografiaMixta(TopografíaMixta t1) {
		return partes.equals(t1.getComponents());
	}
	
	@Override
	public int hashCode () {
		return 9999;
	}
	
    @Override
	public boolean equals (Object t1) {
	    if (t1!=null) {
		    Topografía t2=(Topografía) t1;
		return t2.compararTopografiaMixta(this);
	    }
	    else
		    return false;
    }
 
    public boolean compararTopografiaAtomica(TopografíaAtómica t) {
		return false;
	}



 	@Override
    public String toString() {
	    return "TopografiaMixta [components=" + partes + "]";
    }
}
