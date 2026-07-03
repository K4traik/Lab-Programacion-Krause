package mundial;

import exceptions.JugadoresInsuficientesException;

public class Main {
	public static void main(String[] args) {
		Mundial canMexUsa = new Mundial();
		
		Seleccion arg = null;
		Seleccion mex = null;
		Seleccion fra = null;
		
		try{
			DirectorTecnico dtArg = new DirectorTecnico("Lionel", "Scaloni");
			arg = new Seleccion("Argentina", "América", 0, 23, true, dtArg, null);
			
			DirectorTecnico dtMex = new DirectorTecnico("Javier", "Aguirre");
			mex = new Seleccion("México", "América", 0, 26, true, dtMex, null);
			
			DirectorTecnico dtFra = new DirectorTecnico("Didier", "Deschamps");
			fra = new Seleccion("Francia", "Europa", 0, 24, true, dtFra, null);
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		canMexUsa.agregarSeleccion(arg);
		canMexUsa.agregarSeleccion(mex);
		canMexUsa.agregarSeleccion(fra);
		
		try {
			canMexUsa.getSeleccionByIndex(4).agregarPuntos();
			canMexUsa.getSeleccionByIndex(2).agregarPuntos();
		}catch(IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			canMexUsa.simularPartido(arg, fra);
		}catch(JugadoresInsuficientesException e) {
			System.out.println(e.getMessage());
		}
	}
}
