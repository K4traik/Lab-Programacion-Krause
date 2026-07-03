package mundial;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Seleccion {
	private String nombre;
	private String continente;
	private int cantPuntos;
	private int cantJugadores;
	private boolean estadoClasificacion;
	private DirectorTecnico directorTecnico;
	private Entrenador entrenador;
	
	public Seleccion(String nombre, String continente, int cantPuntos, int cantJugadores, boolean estadoClasificacion, DirectorTecnico directorTecnico,
			Entrenador entrenador){
		this.nombre = nombre;
		this.continente = continente;
		this.cantPuntos = cantPuntos;
		if(cantJugadores<1 || cantJugadores>26) {
			throw new IllegalArgumentException("La cantidad de jugadores es inválida.");
		}
		this.cantJugadores = cantJugadores;
		this.estadoClasificacion = estadoClasificacion;
		this.directorTecnico = directorTecnico;
		this.entrenador = entrenador;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getContinente(){
		return continente;
	}
	public int getPuntos() {
		return cantPuntos;
	}
	public int getCantJugadores() {
		return cantJugadores;
	}
	public boolean getEstadoClasificacion() {
		return estadoClasificacion;
	}
	public DirectorTecnico getDirectorTecnico() {
		return directorTecnico;
	}
	public Entrenador getEntrenador(){
		if(entrenador == null) {
			throw new NullPointerException("La selección " + nombre + " no tiene entrenador.");
		}else {
			return entrenador;
		}
	}
	public void agregarPuntos() throws InputMismatchException{
		Scanner sc = new Scanner(System.in);
		
		int suma = sc.nextInt();
		cantPuntos += suma;
		
		sc.close();
	}
	
}
