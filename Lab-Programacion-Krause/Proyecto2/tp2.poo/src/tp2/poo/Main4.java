package tp2.poo;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int[] array = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<5; i++) {
			System.out.println("Ingrese el "+ (i+1) +" número: ");
			array[i] = scanner.nextInt();
		}
		float prom = (array[0]+array[1]+array[2]+array[3]+array[4])/array.length;
		System.out.println("El promedio de los números ingresados es: "+ prom);
		scanner.close();

	}

}
