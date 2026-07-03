package mundial;

public class Entrenador {
	private String nombre;
	private String apellido;
	
	public Entrenador(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	@Override
	public String toString() {
		return (nombre + " " + apellido);
	}
}
