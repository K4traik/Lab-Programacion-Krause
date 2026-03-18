package tp2.poo;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
			
		}
		int max = array[0];
		for(int i=0; i<5; i++) {
			if (array[i]>max) {
				max = array[i];
			}
		}
		
		System.out.println("El número más alto ingresado es: "+ max);
		scanner.close();

	}

}
