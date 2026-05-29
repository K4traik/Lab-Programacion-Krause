package tp7.poo;

import java.util.ArrayList;

public class Curso {
	private String nombre;
	private ArrayList<Estudiante> alumnos = new ArrayList<Estudiante>();
	
	public Curso(String nombre) {
		this.nombre = nombre;
	}
	
	public void inscribir(Estudiante e) {
		alumnos.add(e);
	}
	public void darDeBaja(int indice) {
		alumnos.remove(indice);
	}
	public void listarAlumnos() {
		int i = 0;
		for(Estudiante e:alumnos) {
			i++;
			System.out.println("Alumno " + i);
			e.mostrarFicha();
			System.out.println("------------------------");
		}
	}
	public int cantidadAlumnos() {
		return alumnos.size();
	}
}
