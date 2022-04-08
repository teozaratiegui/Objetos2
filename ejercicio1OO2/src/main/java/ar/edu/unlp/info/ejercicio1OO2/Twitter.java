package ar.edu.unlp.info.ejercicio1OO2;

import java.util.List;
import java.util.ArrayList;

public class Twitter {
    private List<Usuario> usuarios;
    
    public Twitter() {
    	this.usuarios = new ArrayList<Usuario>();
    }
    
    public void agregarUsuario(Usuario usuario) {
    	if (this.usuarios.stream().allMatch(u -> !u.getNombre().equals(usuario.getNombre()))) {
    	  this.usuarios.add(usuario);
    	  System.out.println("El usuario se registró exitosamente");
    	}
    	else 
    		System.out.println("El nombre ya está registrado");
    }
    
    public void eliminarUsuario(Usuario usuario) {
    	this.usuarios.stream().forEach(u -> u.EliminarRetuits(usuario));
    	this.usuarios.stream().forEach(u -> u.EliminarTuits());
    	this.usuarios.remove(usuario);
    }
	
}
