package tp4.poo;

public class Libro {
	private int isbn;
	private String titulo;
	
	public Libro(int isbn, String titulo) {
		this.isbn = isbn;
		this.titulo = titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getTitulo() {
		return titulo;
	}
}
