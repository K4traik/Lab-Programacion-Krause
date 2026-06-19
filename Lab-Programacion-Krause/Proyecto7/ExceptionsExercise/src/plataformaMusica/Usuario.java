package plataformaMusica;

import excepciones.*;

public class Usuario {
	private String nombre;
	private boolean esPremium;
	private int limiteCanciones;
	
	public Usuario(String nombre, boolean esPremium) {
	this.nombre = nombre;
	this.esPremium = esPremium;
	
	this.limiteCanciones = esPremium ? 99999 : 3;
	}
	
	public void reproducirCancion(Cancion cancion) throws ReproduccionException {
	
	if (!this.esPremium && cancion.isPremium()) {
	throw new ReproduccionException("Contenido exclusivo. El usuario '" + this.nombre + "' notiene cuenta Premium.");
	}
	
	if (!this.esPremium && this.limiteCanciones <= 0) {
	throw new ReproduccionException("Límite alcanzado. Al usuario '" + this.nombre + "' no lequedan créditos de reproducción.");
	}
	
	if (!this.esPremium) {
	this.limiteCanciones--;
	}
	System.out.println("🎶 Reproduciendo ahora: " + cancion.getTitulo() + " - [Quedan: " +
	(this.esPremium ? "Ilimitado" : this.limiteCanciones) + "]");
	}
}
