package mundial;

import java.util.ArrayList;
import exceptions.JugadoresInsuficientesException;

public class Mundial {
	private ArrayList<Seleccion> selecciones = new ArrayList<Seleccion>();
	
	public void agregarSeleccion(Seleccion s) {
		selecciones.add(s);
	}
	public void quitarSeleccion(Seleccion s) {
		selecciones.remove(s);
	}
	public Seleccion getSeleccionByIndex(int index){
		if(index>=selecciones.size()||index<0) {
			throw new IndexOutOfBoundsException("El índice no coincide con alguna posición existente");
		}
		return selecciones.get(index);
	}
	public void simularPartido(Seleccion s1, Seleccion s2) throws JugadoresInsuficientesException{
		if(s1.getCantJugadores()<11 || s2.getCantJugadores()<11) {
			throw new JugadoresInsuficientesException("Uno de los equipos del partido tiene jugadores insuficientes.");
		}
		System.out.println("Partido entre " + s1.getNombre() + " y " + s2.getNombre() + " se disputó con normalidad.");
	}
}
