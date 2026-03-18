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
		char guess = '_';
		
		do {
			System.out.println("Ingrese una letra: ");
			guess = scanner.next().charAt(0);
			
			for(int i=0; i<palabraCompu.length; i++) {
				if(guess == palabraCompu[i]) {
					palabraOculta[i]=palabraCompu[i];
				}
			}
			
			System.out.println(palabraOculta);
		}while(!Arrays.equals(palabraOculta, palabraCompu));
		
		scanner.close();

	}

}
