package tp2.poo;
import java.util.Scanner;

public class Main11 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.print("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
		}
		
		System.out.println("Estos son los números en orden contrario al ingresado:");
		
		for(int i=4; i>=0; i--) {
			System.out.println(array[i]);
		}
		
		scanner.close();

	}

}
