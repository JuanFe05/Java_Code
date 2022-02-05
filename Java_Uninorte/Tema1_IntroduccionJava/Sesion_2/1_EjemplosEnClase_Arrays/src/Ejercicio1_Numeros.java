import java.util.Scanner;

public class Ejercicio1_Numeros {

	public static void main(String[] args) {
		
		Scanner capturaDatos = new Scanner(System.in);
		
		int numeros[] = new int[10];
		int positivos = 0, negativos = 0, ceros = 0;
		
		for (int j = 0; j < numeros.length; j++) {
			System.out.print("numeros[" + j + "] = ");
			numeros[j] = capturaDatos.nextInt();
		}
		
		for (int j = 0; j < numeros.length; j++) {
			
			if (numeros[j] > 0) {
				positivos ++;
			}
			else if (numeros[j] < 0) {
				negativos ++;
			}
			else {
				ceros ++;
			}
			
		}
		
		System.out.println("Los positivos son: " + positivos);
		System.out.println("Los negativos son: " + negativos);
		System.out.println("Los ceros son: " + ceros);
		
		capturaDatos.close();

	}

}
