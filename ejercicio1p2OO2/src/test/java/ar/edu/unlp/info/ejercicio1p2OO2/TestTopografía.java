package ar.edu.unlp.info.ejercicio1p2OO2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.List;
import ar.edu.unlp.info.ejercicio1p2OO2.*;

public class TestTopografía {
	private Topografía topografía;
	
	@BeforeEach
	public void SetUp() {
		ArrayList<Topografía> partes = new ArrayList<Topografía>(4);
		partes.add(new TopografíaAtómica(new Agua()));
		partes.add(new TopografíaAtómica(new Agua()));
		partes.add(new TopografíaAtómica(new Tierra()));
		partes.add(new TopografíaAtómica(new Tierra()));
		ArrayList<Topografía> partes2 = new ArrayList<Topografía>(4);
		partes2.add(new TopografíaAtómica(new Pantano()));
		partes2.add(new TopografíaAtómica(new Tierra()));
		partes2.add(new TopografíaAtómica(new Tierra()));
		partes2.add(new TopografíaMixta(partes));
		TopografíaMixta topografíaMixta = new TopografíaMixta(partes2);
		topografía = topografíaMixta;
	}
	
	@Test
	public void testProporciónAgua() {
		assertEquals(topografía.getProporciónAgua(),0.3);
	}
	
	@Test
	public void testProporciónTierra() {
		assertEquals(topografía.getProporciónTierra(),0.7);
	}

}
