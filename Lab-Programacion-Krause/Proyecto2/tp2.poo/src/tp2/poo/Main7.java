package tp2.poo;
import java.util.Scanner;
import java.util.Random;

public class Main7 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int compu = random.nextInt(3);
		int usu = 0;
		
		System.out.println("0.Piedra \n1.Papel \n2.Tijeras \nElija una opción: ");
		usu = scanner.nextInt();
		
		if(usu == compu) {
			System.out.println("Empate!");
		}else if((usu==0 && compu==2)||(usu==1 && compu==0)||(usu==2 && compu==1)){
			System.out.println("Ganaste!");
		}else {
			System.out.println("Perdiste!");
		}
		
		scanner.close();

	}

}
