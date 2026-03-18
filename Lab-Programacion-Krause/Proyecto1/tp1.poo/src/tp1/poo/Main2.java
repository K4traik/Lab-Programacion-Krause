package tp1.poo;
import java.util.Scanner;

public class Main2 {
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		
		int clave = 0;
		int errores = 0;
		
		while(clave != 1808 && errores < 3) {
			System.out.print("Ingrese la clave: ");
			clave = scanner.nextInt();
			
			if (clave != 1808) {
				System.out.println("Clave incorrecta");
				errores++;
			}
		}
		
		if(errores<3) {
			System.out.println("Bienvenido al Sistema");
		}else {
			System.out.println("Sistema Bloqueado");
		}
		scanner.close();
		
	}
}
