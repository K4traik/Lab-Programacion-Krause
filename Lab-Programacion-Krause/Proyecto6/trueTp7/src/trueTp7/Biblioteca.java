package trueTp7;

import java.util.ArrayList;

public class Biblioteca {
	private ArrayList<Libro> libros = new ArrayList<Libro>();
	
	public void añadirLibro(Libro l) {
		libros.add(l);
	}
	public void listarLibros() {
		for(Libro l:libros) {
			System.out.println(l.getTitulo());
		}
	}
	public void cantidadLibros() {
		System.out.println(libros.size());
	}
	public void pagLibroPorIndice(int indice) {
		System.out.println(libros.get(indice).getCantPag());
	}
}
