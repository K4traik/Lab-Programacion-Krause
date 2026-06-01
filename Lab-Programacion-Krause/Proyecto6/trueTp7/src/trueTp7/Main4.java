package trueTp7;

public class Main4 {
	public static void  main(String[] args) {
		Seleccion argentina = new Seleccion();
		Seleccion francia = new Seleccion();
		
		String [ ] [ ] datos = {
				// Argentina
				{"Emiliano Martinez", "Arquero", "33", "Aston Villa", "true"},
				{"Cristian Romero", "Defensor", "28", "Tottenham", "true"},
				{"Nicolas Otamendi", "Defensor", "38", "Benfica", "true"},
				{"Nahuel Molina", "Defensor", "28", "Atletico Madrid", "true"},
				{"Enzo Fernandez", "Mediocampista", "25", "Chelsea", "true"},
				{"Rodrigo De Paul", "Mediocampista", "32", "Inter Miami", "true"},
				{"Alexis Mac Allister", "Mediocampista", "27", "Liverpool", "true"},
				{"Lionel Messi", "Delantero", "39", "Inter Miami", "true"},
				{"Julian Alvarez", "Delantero", "26", "Atletico Madrid", "true"},
				{"Lautaro Martinez", "Delantero", "29", "Inter Milan", "true"},
				{"Paulo Dybala", "Delantero", "33", "Roma", "false"},
				// Francia
				{"Mike Maignan", "Arquero", "31", "Milan", "true"},
				{"William Saliba", "Defensor", "25", "Arsenal", "true"},
				{"Theo Hernandez", "Defensor", "29", "Milan", "true"},
				{"Jules Kounde", "Defensor", "28", "Barcelona", "true"},
				{"Aurelien Tchouameni", "Mediocampista", "26", "Real Madrid", "true"},
				{"Eduardo Camavinga", "Mediocampista", "24", "Real Madrid", "true"},
				{"Adrien Rabiot", "Mediocampista", "31", "Marseille", "true"},
				{"Kylian Mbappe", "Delantero", "28", "Real Madrid", "true"},
				{"Ousmane Dembele", "Delantero", "29", "PSG", "true"},
				{"Marcus Thuram", "Delantero", "29", "Inter Milan", "true"},
				{"Antoine Griezmann", "Delantero", "35", "Atletico Madrid", "false"}
				};
		
		Jugador[] jugadores1 = new Jugador[datos.length/2];
		for(int i = 0; i < datos.length/2; i++) {
			jugadores1[i] = new Jugador(datos[i][0], datos[i][1],
					Integer.parseInt(datos[i][2]), datos[i][3],
					Boolean.parseBoolean(datos[i][4]));
		}
		Jugador[] jugadores2 = new Jugador[datos.length/2];
		for(int i = datos.length/2; i < datos.length; i++) {
			jugadores2[i-11] = new Jugador(datos[i][0], datos[i][1],
					Integer.parseInt(datos[i][2]), datos[i][3],
					Boolean.parseBoolean(datos[i][4]));
		}
		for(Jugador j:jugadores1) {
			argentina.agregarJugador(j);
		}
		for(Jugador j:jugadores2) {
			francia.agregarJugador(j);
		}
		
		argentina.mostrarConvocados();
		System.out.println("<---------------->");
		argentina.mostrarNoConvocados();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		argentina.contarPorSeleccion();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		argentina.jugadorMasJoven();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		argentina.jugadorMasVeterano();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		argentina.ordenarPorEdad();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		argentina.contarPorPosicion();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		argentina.promedioEdad();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		System.out.println("<<<<<<<<<>>>>>>>>>");
		System.out.println("<<<<<<<<<>>>>>>>>>");
		francia.mostrarConvocados();
		System.out.println("<---------------->");
		francia.mostrarNoConvocados();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		francia.contarPorSeleccion();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		francia.jugadorMasJoven();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		francia.jugadorMasVeterano();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		francia.ordenarPorEdad();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		francia.contarPorPosicion();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		francia.promedioEdad();
		System.out.println("<<<<<<<<<>>>>>>>>>");
		System.out.println("<<<<<<<<<>>>>>>>>>");
		System.out.println("<<<<<<<<<>>>>>>>>>");
		
		
		
	}
}
