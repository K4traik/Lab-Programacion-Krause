package tp7.poo;

public class Estudiante {
	private String nombre;
	private String dni;
	private double promedio;
	
	public Estudiante(String nombre, String dni, double promedio) {
		this.nombre = nombre;
		this.dni = dni;
		this.promedio = promedio;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	public String getDNI() {
		return this.dni;
	}
	public double getPromedio() {
		return this.promedio;
	}
	public void mostrarFicha() {
		System.out.println("Nombre: " + this.nombre + "\nDNI: " + this.dni + "\nPromedio: " + this.promedio);
	}
}