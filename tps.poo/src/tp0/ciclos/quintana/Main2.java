package tp0.ciclos.quintana;
import java.util.*;

public class Main2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int suma = 0;
		
		while(suma<=10){
			System.out.print("Ingrese un nuevo número: ");
			suma = suma + scanner.nextInt();
		}
		
		System.out.println("La suma es: " + suma);
		scanner.close();
		
	}

}
