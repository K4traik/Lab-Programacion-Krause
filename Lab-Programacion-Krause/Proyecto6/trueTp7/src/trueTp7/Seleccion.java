package trueTp7;

import java.util.ArrayList;

public class Seleccion {
	private ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
	
	public void agregarJugador(Jugador j) {
		jugadores.add(j);
	}
	public void eliminarJugador(Jugador j) {
		jugadores.remove(j);
	}
	public void buscarPorPosicion(String posicion) {
		for(Jugador j:jugadores) {
			if(j.getClub().equals(posicion)) {
				System.out.println(j.getNombre());
			}
		}
	}
	public void mostrarConvocados() {
		for(Jugador j:jugadores) {
			if(j.getConvocado()) {
				System.out.println(j.getNombre());
			}
		}
	}
	public void mostrarNoConvocados() {
		for(Jugador j:jugadores) {
			if(!j.getConvocado()) {
				System.out.println(j.getNombre());
			}
		}
	}
	public void contarPorSeleccion() {
		System.out.println(jugadores.size());
	}
	public void jugadorMasJoven() {
		Jugador masJoven = jugadores.get(0);
		
		for(Jugador j:jugadores) {
			if(j.getEdad()<masJoven.getEdad()) {
				masJoven = j;
			}
		}
		
		System.out.println("Jugador más joven: "+ masJoven.getNombre());
	}
	public void jugadorMasVeterano() {
		Jugador masViejo = jugadores.get(0);
		
		for(Jugador j:jugadores) {
			if(j.getEdad()>masViejo.getEdad()) {
				masViejo = j;
			}
		}
		
		System.out.println("Jugador más veterano: "+ masViejo.getNombre());
	}
	public void buscarPorEquipo(String club) {
		for(Jugador j:jugadores) {
			if(j.getClub().equals(club)) {
				System.out.println(j.getNombre());
			}
		}
	}
	public void ordenarPorEdad() {
		Jugador[] js = new Jugador[jugadores.size()];
		js = jugadores.toArray(js);
		Jugador aux;
		for(int i = 0; i < js.length; i++) {
			for(int j = 0; j < js.length; j++) {
				if(js[j].getEdad() > js[i].getEdad()) {
					aux = js[j];
					js[j] = js[i];
					js[i] = aux;
				}
			}
		}
		
		for(int i = 0; i < js.length; i++) {
			System.out.println(js[i].getNombre()+" "+js[i].getEdad()+" años.");
		}
	}
	public void contarPorPosicion() {
		int arqueros = 0;
		int defensores = 0;
		int mediocampistas = 0;
		int delanteros = 0;
		for(Jugador j:jugadores) {
			if(j.getPosicion().equals("Delantero")) {
				delanteros++;
			}else if(j.getPosicion().equals("Mediocampista")) {
				mediocampistas++;
			}else if(j.getPosicion().equals("Defensor")) {
				defensores++;
			}else if(j.getPosicion().equals("Arquero")) {
				arqueros++;
			}else {
				System.out.println(j.getNombre()+" tiene una posición inválida.");
			}
		}
		
		System.out.println("Arqueros: "+arqueros);
		System.out.println("Defensores: "+defensores);
		System.out.println("Mediocampistas: "+mediocampistas);
		System.out.println("Delanteros: "+delanteros);
	}
	public void estaConvocado(Jugador j) {
		if(j.getConvocado()) {
			System.out.println("El jugador "+j.getNombre()+" está convocado.");
		}else {
			System.out.println("El jugador "+j.getNombre()+" no está convocado.");
		}
	}
	public void promedioEdad() {
		float prom = 0f;
		for(Jugador j:jugadores) {
			prom = prom + j.getEdad();
		}
		prom = prom/jugadores.size();
		System.out.printf("El promedio de edad en la selección es: %.2f", prom);
		System.out.println(".");
	}
}
