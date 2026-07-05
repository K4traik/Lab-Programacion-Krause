package escuelaPresentismo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Alumno {
	private String dni;
	private String nombre;
	private String apellido;
	private String curso;
	private String estadoAcademico;
	private int cantInasistencias;
	private Tutor tutor;
	
	public Alumno(String dni, String nombre, String apellido, String curso, String estadoAcademico,
			int cantInasistencias, Tutor tutor) {
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.curso = curso;
		this.estadoAcademico = estadoAcademico;
		this.cantInasistencias = validarInasistencias(cantInasistencias);
		this.tutor = tutor;
	}
	
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public String getCurso() {
		return curso;
	}
	public String getEstadoAcademico() {
		return estadoAcademico;
	}
	public int getCantInasistencias() {
		return cantInasistencias;
	}
	public void agregarInasistencias() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		
		int suma = sc.nextInt();
		cantInasistencias += suma;
		
		sc.close();
	}
	public Tutor getTutor() {
		if(tutor == null) {
			throw new NullPointerException("El alumno " + nombre + " " + apellido + " no tiene tutor.");
		}
		return tutor;
		
	}
	private int validarInasistencias(int cantInasistencias) {
		if(cantInasistencias<0) {
			throw new IllegalArgumentException("La cantidad de inasistencias es inválida.");
		}
		return cantInasistencias;
	}
}
