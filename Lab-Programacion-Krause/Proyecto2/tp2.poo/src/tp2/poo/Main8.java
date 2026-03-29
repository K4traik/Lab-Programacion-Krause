package tp2.poo;
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Main8 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		
		String a = "abcdefghijklmnopqrstuvwxyz";
		char[] opciones = a.toCharArray();
		
		char[] palabraCompu = {opciones[random.nextInt(26)], opciones[random.nextInt(26)],
				opciones[random.nextInt(26)], opciones[random.nextInt(26)], opciones[random.nextInt(26)]};
		
		char[] palabraOculta = {'_', '_', '_', '_', '_'};
		String guess = "hello";
		
		do {
			do {
				System.out.println("Ingrese una palabra de 5 letras: ");
				guess = scanner.next();
				if(guess.length()!=5) {
					System.out.println("Cantidad de cáracteres inválida.");
				}
			}while(guess.length()!=5);
			
			for(int i=0; i<palabraCompu.length; i++) {
				if(guess.toCharArray()[i] == palabraCompu[i]) {
					palabraOculta[i]=palabraCompu[i];
					System.out.println("Coincidieron en la "+(i+1)+" posición.");
				}
			}
			
			System.out.println(palabraOculta);
		}while(!Arrays.equals(palabraOculta, palabraCompu));
		
		System.out.println("\nCompletaste las palabras cruzadas!");
		
		scanner.close();

	}

}
