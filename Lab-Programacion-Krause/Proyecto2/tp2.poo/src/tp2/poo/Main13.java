package tp2.poo;

public class Main13 {

	public static void main(String[] args) {
		int[] arrayNotas = {10, 2, 5, 8, 8, 3, 9};
		String[] arrayNombres = {"Alberto", "Miranda", "Diego", "Steve", "Carla", "Alfonso", "Teresa"};
		
		for(int i=0; i<7; i++) {
			System.out.print(arrayNombres[i]+" ");
			if(arrayNotas[i]>=6) {
				System.out.println("Aprobado/a");
			}else {
				System.out.println("Desaprobado/a");
			}
		}

	}

}
