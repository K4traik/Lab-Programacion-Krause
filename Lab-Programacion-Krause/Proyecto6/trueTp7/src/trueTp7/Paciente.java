package trueTp7;

public class Paciente {
	private String nombre;
	private int dni;
	private int edad;
	private double peso;
	private boolean estaHospitalizado;
	
	public Paciente(String nombre, int dni, int edad, double peso, boolean estaHospitalizado) {
		this.nombre = nombre;
		this.dni = dni;
		this.edad = edad;
		this.peso = peso;
		this.estaHospitalizado = estaHospitalizado;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void hospitalizado() {
		if(estaHospitalizado) {
			System.out.println("Está hospitalizado/a.");
		}else {
			System.out.println("No está hospitalizado/a.");
		}
	}
}
