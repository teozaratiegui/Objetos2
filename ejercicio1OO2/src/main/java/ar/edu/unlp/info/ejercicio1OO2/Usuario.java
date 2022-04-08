package ar.edu.unlp.info.ejercicio1OO2;

import java.util.ArrayList;
import java.util.List;

public class Usuario {
	private String nombre;
    private List<Tuit> tuits;
    private List<Retuit> retuits;
    
    public Usuario(String nombre) {
    	this.tuits = new ArrayList<Tuit>();
    	this.retuits = new ArrayList<Retuit>();
    	this.nombre = nombre;
    }
    
    public String getNombre() {
    	return this.nombre;
    }
	
    public void EliminarTuits() {
    	this.tuits.clear();
    }
    
    public void EliminarRetuits(Usuario usuario) {
    	retuits = retuits.stream().filter(r -> !r.getOriginal().equals(usuario)).toList();
    }
    
    public void tuitear(String texto) {
    	if (texto.length() <= 140 && texto.length() > 1) {
    		Tuit tuit = new Tuit(texto,this);
    		this.tuits.add(tuit);
    	}
    	else
    		System.out.println("El tuit no debe contener más de 140 caracteres");
    }
    
    public void retuitear(String texto, Tuit tuit) {
    	if (texto.length() <= 140 && texto.length() > 1) {
    		Retuit retuit = new Retuit(texto,this,tuit);
    		this.retuits.add(retuit);
        }
    	else
    		System.out.println("El retuit no debe contener más de 140 caracteres");
    }
}
