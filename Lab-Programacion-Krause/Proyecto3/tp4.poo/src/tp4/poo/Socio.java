package tp4.poo;

import java.util.List;

public class Socio {
	private int nroSocio;
	private String nombre;
	private List<Libro> libros;
	
	public Socio(int nroSocio, String nombre) {
		this.nroSocio = nroSocio;
		this.nombre = nombre;
	}
	
	public void añadirLibro(Libro libro) {
		libros.add(libro); // Esto no te funcionaría por el simple hecho que debería de haber un this.libro = new Arraylist<>();
		System.out.println("Socio "+ nombre +" ahora es dueño de "+ libro);
	}
	
	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}
	public int getNroSocio() {
		return nroSocio;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
}
