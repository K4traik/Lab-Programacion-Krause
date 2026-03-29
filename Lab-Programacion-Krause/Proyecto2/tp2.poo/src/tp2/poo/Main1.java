package tp2.poo;
import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int[] array = new int[5];
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
		}
		for(int i=0; i<5; i++) {
			sum+=array[i];
		}
		
		System.out.println("La suma de los números ingresados es: "+ sum);
		scanner.close();

	}

}
