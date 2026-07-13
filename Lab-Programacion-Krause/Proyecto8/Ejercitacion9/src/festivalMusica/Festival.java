package festivalMusica;

import java.util.ArrayList;
import exceptions.EspectaculoCortoException;

public class Festival {
	private String nombre;
	private String[] escenarios;
	private int escenariosMark;
	private ArrayList<Cantante> cantantes;
	
	public Festival(String nombre) {
		this.nombre = nombre;
		cantantes = new ArrayList<Cantante>();
		this.escenarios = new String[50];
		this.escenariosMark = 0;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getEscenarioByIndex(int index) {
		return escenarios[index];
	}
	public Cantante getCantanteByIndex(int index) {
		return cantantes.get(index);
	}
	public int getCantantesSize() {
		return cantantes.size();
	}
	public void agregarEscenario(String e) {
		escenarios[escenariosMark] = e;
		escenariosMark++;
	}
	public void agregarCantante(Cantante c) {
		cantantes.add(c);
	}
	public void realizarSoundCheck(Cantante c) throws EspectaculoCortoException{
		if(c.getCancionesProgramadas()<5) {
			throw new EspectaculoCortoException("El espectaculo"
					+ " del cantante "+ c.getNombre() + " tiene menos de 5 "
							+ "canciones programadas");
		}
	}
	public boolean comprobarEscenario(String escenario) {
		boolean flag = false;
		for(String e : escenarios) {
			if(escenario.equals(e)) {
				flag = true;
			}
		}
		return flag;
	}
}
