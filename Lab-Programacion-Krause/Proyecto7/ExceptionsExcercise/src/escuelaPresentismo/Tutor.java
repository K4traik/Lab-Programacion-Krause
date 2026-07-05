package escuelaPresentismo;

public class Tutor {
	private String nombre;
	private String apellido;
	
	public Tutor(String nombre, String apellido) {
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
