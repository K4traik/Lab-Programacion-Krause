package tp2.poo;
import java.util.Scanner;
import java.util.Random;

public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int numGenerado = random.nextInt(100)+1;
		int guess = 0;
		
		do {
			System.out.println("Adivine el número entre 1 y 100: ");
			guess = scanner.nextInt();
			
			if(guess != numGenerado) {
				System.out.print("Incorrecto. ");
				if(guess>numGenerado) {
					System.out.println("El número ingresado es mayor que el generado.");
				} else {
					System.out.println("El número ingreado es menor que el generado.");
				}
			}
		}while(guess != numGenerado);
		
		System.out.println("Correcto!");
		scanner.close();

	}

}
