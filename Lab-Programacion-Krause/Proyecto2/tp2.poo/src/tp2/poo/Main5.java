package tp2.poo;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int cant = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
			
		}
		for(int i=0; i<5; i++) {
			if(array[i]%2 == 0) {
				cant++;
			}
		}
		
		System.out.println("La cantidad de pares ingresados es: "+ cant);
		scanner.close();

	}

}
