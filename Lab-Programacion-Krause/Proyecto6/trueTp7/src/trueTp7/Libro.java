package trueTp7;

public class Libro {
	private String titulo;
	private String isbn;
	private int cantPag;
	
	public Libro(String titulo, String isbn, int cantPag) {
		this.titulo = titulo;
		this.isbn = isbn;
		this.cantPag = cantPag;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public int getCantPag() {
		return cantPag;
	}
}
