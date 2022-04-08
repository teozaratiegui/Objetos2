package ar.edu.unlp.info.oo2.biblioteca;

public class Main {

	public static void main(String[] args) {
		Biblioteca biblioteca = new Biblioteca();
		biblioteca.setExporter(new Adapter());
		biblioteca.agregarSocio(new Socio("Arya Stark", "needle@stark.com", "5234-5"));
		biblioteca.agregarSocio(new Socio("Tyrion Lannister", "tyrion@thelannisters.com", "2345-2"));
		System.out.println(biblioteca.exportarSocios());
	}

}
