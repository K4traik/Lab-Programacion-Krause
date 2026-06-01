package trueTp7;

public class Jugador {
	private String nombre;
	private String posicion;
	private int edad;
	private String club;
	private boolean convocado;
	
	public Jugador(String nombre, String posicion, int edad, String club, boolean convocado) {
		this.nombre = nombre;
		this.posicion = posicion;
		this.edad = edad;
		this.club = club;
		this.convocado = convocado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public String getClub() {
		return club;
	}
	public int getEdad() {
		return edad;
	}
	public boolean getConvocado() {
		return convocado;
	}
	public void setConvocado(boolean convocado) {
		this.convocado = convocado;
	}
}
