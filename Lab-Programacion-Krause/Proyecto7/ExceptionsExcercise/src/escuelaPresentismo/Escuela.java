package escuelaPresentismo;

import java.util.ArrayList;
import exceptions.AlumnoLibreException;

public class Escuela {
	private ArrayList<Alumno> alumnos;
	private int limiteInasistencias;
	
	public Escuela(int limiteInasistencias) {
		this.alumnos = new ArrayList<Alumno>();
		this.limiteInasistencias = limiteInasistencias;
	}
	
	public void agregarAlumno(Alumno a) {
		alumnos.add(a);
	}
	public void quitarAlumno(Alumno a) {
		alumnos.remove(a);
	}
	public Alumno getAlumnoByIndex(int index) {
		if(index<0 || index>=alumnos.size()) {
			throw new IllegalArgumentException("El índice es inválido.");
		}
		return alumnos.get(index);
	}
	public int getLimiteInasistencias() {
		return limiteInasistencias;
	}
	public void operacionAcademicaEspecial(Alumno a) throws AlumnoLibreException{
		if (a.getCantInasistencias()>limiteInasistencias) {
			throw new AlumnoLibreException("El alumno " + a.getNombre() + " " + a.getApellido() + " está libre.");
		}
		System.out.println("Operación académica especial realizada con el alumno " + a.getNombre() +
				" " + a.getApellido() + ".");
	}
}
