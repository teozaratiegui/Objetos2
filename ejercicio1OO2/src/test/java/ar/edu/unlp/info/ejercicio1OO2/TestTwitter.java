package ar.edu.unlp.info.ejercicio1OO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import ar.edu.unlp.info.ejercicio1OO2.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TestTwitter {
	private Twitter twitter;
	
	@BeforeEach
	public void setup() {
		twitter = new Twitter();
	}
	
	@Test
    public void probarAgregarUsuario() {
		Usuario usuario = new Usuario("Fermin");
		Usuario usuario2 = new Usuario("Alejo");
		twitter.agregarUsuario(usuario);
		twitter.agregarUsuario(usuario2);
	}
}
