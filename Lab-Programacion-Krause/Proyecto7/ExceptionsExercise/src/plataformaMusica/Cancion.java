package plataformaMusica;

public class Cancion {
	private String titulo;
	private String artista;
	private int duracionEnSegundos;
	private boolean esPremium;
	
	public Cancion(String titulo, String artista, int duracionEnSegundos,
			boolean esPremium) {
		this.titulo = titulo;
		this.artista = artista;
		this.duracionEnSegundos = duracionEnSegundos;
		this.esPremium = esPremium;
	}
	
	public String getTitulo() {
		return titulo;
	}
	public String getArtista() {
		return artista;
	}
	public int getDuracion() {
		return duracionEnSegundos;
	}
	public boolean isPremium() {
		return esPremium;
	}
	
	public void setPremium(boolean premium) {
		this.esPremium = premium;
	}
}
