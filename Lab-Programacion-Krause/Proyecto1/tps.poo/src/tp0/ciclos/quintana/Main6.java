package tp0.ciclos.quintana;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int suma = 0;
		int cont = 0;
		
		while(suma<20) {
			System.out.print("Ingrese un número: ");
			suma = suma + scanner.nextInt();
			cont++;
		}
		
		System.out.println("El promedio de los números ingresados es: " + suma/cont);
		scanner.close();

	}

}
