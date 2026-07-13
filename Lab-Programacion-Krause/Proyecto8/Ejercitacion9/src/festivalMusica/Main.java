package festivalMusica;

import exceptions.EspectaculoCortoException;

public class Main {

	public static void main(String[] args) {
		String[][] datosCantantes = {
				{"Taylor Swift", "Pop", "1500000", "18", "Tree Paine"},
				{"Bad Bunny", "Reggaeton", "RECHAZADO", "12", "Noah Assad"}, // <- Error Numérico
				{"Coldplay", "Rock", "1200000", "3", "Phil Harvey"}, // Cantidad de canciones < 5
				{"Duki", "Trap", "500000", "14", null} // <- Manager Nulo
				};
		
		Festival festival = new Festival("Lolapalooza");
		
		for(String[] fila : datosCantantes) {
			boolean flag = false;
			String nombre = fila[0];
			String genMusica = fila[1];
			int cachetSolicitado = -1;
			int cancionesProgramadas = -1;
			try {
				cachetSolicitado = Integer.parseInt(fila[2]);
				cancionesProgramadas = Integer.parseInt(fila[3]);
			}catch(NumberFormatException e) {
				System.out.println(e.getMessage());
				flag = true;
			}
			String manager = fila[4];
			if(cachetSolicitado>=0 || cancionesProgramadas>=0) {
				festival.agregarCantante(new Cantante(nombre, genMusica, cachetSolicitado, cancionesProgramadas, manager));
			}
		}
		
		try {
			System.out.println(festival.getCantanteByIndex(2).getManager());
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		for(int i = 0; i<festival.getCantantesSize(); i++) {
			try {
				festival.realizarSoundCheck(festival.getCantanteByIndex(i));
			}catch(EspectaculoCortoException e) {
				System.out.println(e.getMessage());
			}
		}
		
		festival.agregarEscenario("Plaza Park");
		
		try {
			festival.getCantanteByIndex(0).asignarEscenario("Plaza Park", festival);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			festival.getCantanteByIndex(1).asignarEscenario("El Muelle", festival);
		}catch(NullPointerException e) {
			System.out.println(e.getMessage());
		}
	}

}
