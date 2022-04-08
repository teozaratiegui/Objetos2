package ar.edu.unlp.info.ejercicio1OO2;

public class Tuit {
    private Usuario usuario;
    private String texto;
    
    public Tuit(Usuario usuario, String texto) {
    	this.usuario = usuario;
    	this.texto = texto;
    }
    
    public Tuit(String texto,Usuario usuario) {
    	this.usuario = usuario;
    	this.texto = texto;
    }
    
    public Usuario getPropietario() {
    	return this.usuario;
    }
    
    
}
