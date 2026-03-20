package tp2.poo;
import java.util.Scanner;
import java.util.Random;
import java.util.concurrent.*;
import java.util.Arrays;

public class Main9 {

	public static void main(String[] args) throws InterruptedException {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int[] randomArray = new int[5];
		int[] guessArray = new int[5];
		
		for(int i=0; i<5; i++) {
			randomArray[i] = random.nextInt(10);
		}
	    
	    do {
	    	System.out.print("Presione [ENTER] para revelar los números");
			scanner.nextLine();
			
			for(int i=0; i<5; i++) {
				System.out.print(randomArray[i]);
			}
			TimeUnit.SECONDS.sleep(3);
			
			System.out.println("\n".repeat(50));
	    	
	    	for(int i=0; i<5; i++) {
		    	System.out.print("Ingrese el "+ (i+1) +" número de la secuencia: ");
		    	guessArray[i] = scanner.nextInt();
		    }
	    	if (!Arrays.equals(randomArray, guessArray)) {
	    		System.out.println("Conjunto incorrecto!");
	    	}
	    }while(!Arrays.equals(randomArray, guessArray));
	    
	    System.out.println("Bien hecho!");
	    scanner.close();

	}

}
