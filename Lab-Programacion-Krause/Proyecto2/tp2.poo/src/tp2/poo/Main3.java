package tp2.poo;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
			
		}
		int min = array[0];
		for(int i=0; i<5; i++) {
			if (array[i]<min) {
				min = array[i];
			}
		}
		
		System.out.println("El número más bajo ingresado es: "+ min);
		scanner.close();

	}

}
