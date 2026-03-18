package tp0.ciclos.quintana;
import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		int suma = 0;
		int cont = 0;
		
		do {
			System.out.print("Ingrese un número: ");
			num = scanner.nextInt();
			
			suma = suma+num;
			
			if(num!=0 || cont==0) {
				cont++;
			}
			
		}while(num != 0);
		
		System.out.println("El promedio de los números ingresados es: " + suma/cont);
		scanner.close();

	}

}
