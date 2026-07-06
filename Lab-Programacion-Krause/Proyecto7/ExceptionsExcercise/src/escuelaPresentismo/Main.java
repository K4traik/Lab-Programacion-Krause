package escuelaPresentismo;

import java.util.InputMismatchException;
import exceptions.AlumnoLibreException;

public class Main {
	public static void main(String[] args) {
		Escuela escuela = new Escuela(5);
		
		Tutor tutor = new Tutor("Rick", "Sanchez");
		
		Alumno alumno1 = null;
		Alumno alumno2 = null;
		Alumno alumno3 = null;
		
		try {
			alumno1 = new Alumno("49003084", "Eric", "Quintana", "5to 2da", "Aprobado", 0, tutor);
			alumno2 = new Alumno("49100102", "Facundo", "Villafañe", "5to 2da", "Desaprobado", 0, null);
			alumno3 = new Alumno("41002002", "Walter", "Walterson", "6to 7ma", "Aprobado", -67, tutor);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		escuela.agregarAlumno(alumno1);
		escuela.agregarAlumno(alumno2);
		escuela.agregarAlumno(alumno3);
		
		try {
			System.out.println(escuela.getAlumnoByIndex(0).getDni());
			System.out.println(escuela.getAlumnoByIndex(-2).getDni());
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			escuela.getAlumnoByIndex(0).agregarInasistencias();
			escuela.getAlumnoByIndex(1).agregarInasistencias();
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(InputMismatchException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			escuela.getAlumnoByIndex(1).getTutor().toString();
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			escuela.operacionAcademicaEspecial(escuela.getAlumnoByIndex(0));
		}catch(IndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}catch(AlumnoLibreException e) {
			System.out.println(e.getMessage());
		}
	}
}