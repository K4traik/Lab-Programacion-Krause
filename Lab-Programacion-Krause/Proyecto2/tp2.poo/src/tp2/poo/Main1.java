package tp2.poo;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("La suma de los números ingresados es: "+ (array[0]+array[1]+array[2]+array[3]+array[4]));
		scanner.close();

	}

}
