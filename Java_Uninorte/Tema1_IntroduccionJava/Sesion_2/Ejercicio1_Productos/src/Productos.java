import java.util.Arrays;
import java.util.Scanner;

public class Productos {

	public static void main(String[] args) {
		
		Scanner capturaDatos = new Scanner(System.in);
		
		int numeroProductos;
		
		// condicion por si numeroProductos es menor o igual a cero.
		do {
			System.out.print("Ingresa el número de productos: ");
			numeroProductos = capturaDatos.nextInt();
		} while (numeroProductos <= 0);
		
		// Creando los arrays.
		double codigos[] = new double[numeroProductos];
		double cantidadBodega[] = new double[numeroProductos];
		double cantidadMinima[] = new double[numeroProductos];
		
		// llenando los arrays
		System.out.println("Códigos de productos que son necesario pedir: ");
		
		for (int i = 0; i < cantidadMinima.length; i++) {
			codigos[i] = (int) (Math.random() * 500) + 1;
			cantidadBodega[i] = (int) (Math.random() * 500) + 1;
			cantidadMinima[i] = (int) (Math.random() * 500) + 1;
			
			if (cantidadBodega[i] < cantidadMinima[i]) {
				System.out.println(codigos[i]);
			}
		}
		
		System.out.println();
		
		// Imprimiendo los arrays.
		System.out.println("CÓDIGOS PRODUCTOS  : " + Arrays.toString(codigos));
		System.out.println("CANTIDAD EN BODEGA : " + Arrays.toString(cantidadBodega));
		System.out.println("MÍNIMO REQUERIDO   : " + Arrays.toString(cantidadMinima) + "\n");
		
		
		// mayor y menor en bodega
		int indiceMayor = 0, indiceMenor = 0;
		double mayorBodega, menorBodega;
		
		mayorBodega = menorBodega = cantidadBodega[0];

        for (int x = 0; x < cantidadBodega.length; x++) {
            if(cantidadBodega[x] > cantidadBodega[indiceMayor]) {
				mayorBodega = cantidadBodega[x];
				indiceMayor = x;
            }
            if(cantidadBodega[x] < cantidadBodega[indiceMenor]) {
				menorBodega = cantidadBodega[x];
				indiceMenor = x;
            } 
        }
        
        for(int j = 0; j < codigos.length; j++) {
            if (indiceMayor == j) {
				System.out.println("C�digo con mayor n�mero unidades: " + codigos[j] + " Cantidad en bodega: " + mayorBodega);
			}
            if (indiceMenor == j) {
				System.out.println("C�digo con menor n�mero  unidades: " + codigos[j] + " Cantidad en bodega: " + menorBodega);
			}
        }
        
		capturaDatos.close();

	}

}