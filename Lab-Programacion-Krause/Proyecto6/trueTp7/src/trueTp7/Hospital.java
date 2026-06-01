package trueTp7;

import java.util.ArrayList;

public class Hospital {
	private ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
	
	public void añadirPaciente(Paciente p) {
		pacientes.add(p);
	}
	public void listarPacientes() {
		for(Paciente p:pacientes) {
			System.out.println(p.getNombre());
		}
	}
	public void cantidadPacientes() {
		System.out.println(pacientes.size());
	}
	public void infoPorIndice(int indice) {
		Paciente p = pacientes.get(indice);
		
		System.out.println("Nombre: "+p.getNombre());
		System.out.println("Edad: "+p.getEdad());
		p.hospitalizado();
	}
}
