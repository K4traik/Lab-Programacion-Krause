package tp2.poo;
import java.util.Scanner;

public class Main12 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int[] array = new int[8];
		
		for(int i=0; i<8; i++) {
			System.out.print("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
		}
		
		int max = array[0], min = array[0];
		
		for(int i=0; i<8; i++) {
			if(array[i] > max) {
				max = array[i];
			}
			if(array[i] < min) {
				min = array[i];
			}
		}
		
		System.out.println("El número máximo es "+ max +" y el mínimo es "+ min);
		
		scanner.close();

	}

}
