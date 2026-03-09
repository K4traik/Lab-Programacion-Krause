package tp1.poo;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int contneg = 0;
		int sumapos = 0;
		int current = 0;
		
		do {
			System.out.print("Ingrese un numero: ");
			current = scanner.nextInt();
			
			if(current>0) {
				sumapos = sumapos + current;
			}else if(current<0) {
				contneg++;
			}
		}while(current != 0);
		
		System.out.println("La suma de los positivos es: " + sumapos);
		System.out.println("La cantidad de negativos es: " + contneg);
		scanner.close();

	}

}
