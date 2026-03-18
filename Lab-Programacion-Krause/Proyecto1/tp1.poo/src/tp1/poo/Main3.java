package tp1.poo;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese la cantidad de estudiantes a calificar: ");
		int cant = scanner.nextInt();
		
		int currentnota = 0;
		int suma = 0;
		int cont = 0;
		
		for(int i = 0; i<cant; i++) {
			System.out.print("Ingrese la nota del " + " estudiante (1-10): ");
			currentnota = scanner.nextInt();
			
			switch(currentnota){
			case 1, 2, 3:
				System.out.println("Insuficiente");
				break;
			case 4, 5:
				System.out.println("Regular");
				break;
			case 6, 7:
				System.out.println("Bueno");
				break;
			case 8, 9:
				System.out.println("Muy bueno");
				break;
			case 10:
				System.out.println("Excelente");
				break;
			default:
				System.out.println("Valor inválido");
			}
			
			if(currentnota<=10 && currentnota>=1) {
				suma = suma + currentnota;
				cont++;
			}
		}
		
		System.out.println("El promedio del curso (notas válidas) es: " + suma/cont);
		scanner.close();

	}

}
