package ar.edu.unlp.info.oo2.biblioteca;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;
import ar.edu.unlp.info.oo2.biblioteca.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BibliotecaTest {
	private Biblioteca biblioteca;
	
	@BeforeEach
	public void setUp() {
		biblioteca = new Biblioteca();
	}

	@Test
	public void exportarSociosVoorhees() { 
		biblioteca.setExporter(new VoorheesExporter());
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyrion Lannister", "tyrion@thelannisters.com", "2345-2"));
		String socios = "[\n"
				+ "	{\n"
				+ "		\"nombre\": \"Arya Stark\",\n"
				+ "		\"email\": \"needle@stark.com\",\n"
				+ "		\"legajo\": \"5234-5\"\n"
				+ "	},\n"
				+ "	{\n"
				+ "		\"nombre\": \"Tyrion Lannister\",\n"
				+ "		\"email\": \"tyrion@thelannisters.com\",\n"
				+ "		\"legajo\": \"2345-2\"\n"
				+ "	}\n"
				+ "]";
	}
	
	@Test
	public void exportarSociosAdapter() {
		biblioteca.setExporter(new Adapter());
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyrion Lannister", "tyrion@thelannisters.com", "2345-2"));
	}
}
