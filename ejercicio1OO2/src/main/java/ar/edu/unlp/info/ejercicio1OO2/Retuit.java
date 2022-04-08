package ar.edu.unlp.info.ejercicio1OO2;

public class Retuit extends Tuit {
    private Tuit original;
    
    public Retuit(String texto, Usuario usuario, Tuit original) {
    	super(texto,usuario);
    	this.original = original;
    }
    
    public Usuario getOriginal() {
    	return this.original.getPropietario();
    }
}
