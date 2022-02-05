import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.Vector;

public class ProductosV3 {

	public static void main(String[] args) {
		
		Scanner capturaDatos = new Scanner(System.in);
		Random rnd = new Random();

		// condicion por si numeroProductos es menor o igual a cero.
		int numeroProductos;
				
		do {
			System.out.print("Ingresa el número de productos: ");
			numeroProductos = capturaDatos.nextInt();
		} while (numeroProductos <= 0);
		
		// Creando los arrays.
		int codigos[] = new int[numeroProductos];
		int cantidadBodega[] = new int[numeroProductos];
		int cantidadMinima[] = new int[numeroProductos];
		
		for (int i = 0; i < numeroProductos; i++) {
			codigos[i] = rnd.nextInt(500) + 1;
			cantidadBodega[i] = rnd.nextInt(500) + 1;
			cantidadMinima[i] = rnd.nextInt(500) + 1;
		}

		// Vereficando mayor, menor y requerido.
		int mayor = 0, menor = 500;
		int codigoMayor = 0, codigoMenor = 0;
		Vector<String> codigosProductos = new Vector<String>();

		for (int i = 0; i < numeroProductos; i++) {
			if (cantidadBodega[i] < cantidadMinima[i]) {
				codigosProductos.add(Integer.toString(codigos[i]));
			}
			if (cantidadBodega[i] > mayor) {
				mayor = cantidadBodega[i];
				codigoMayor = codigos[i];
			}
			if (cantidadBodega[i] < menor) {
				menor = cantidadBodega[i];
				codigoMenor = codigos[i];
			}
		}
		
		System.out.println("Códigos: " + Arrays.toString(codigos));
		System.out.println("Cantidad Bodega: " + Arrays.toString(cantidadBodega));
		System.out.println("Cantidad Minima: " + Arrays.toString(cantidadMinima));
		System.out.println("Códigos de productos a pedir: " + codigosProductos);
		System.out.println("Código con mayor cantidad de prodcutos: " + codigoMayor);
		System.out.println("Código con menor cantidad de prodcutos: " + codigoMenor);

		capturaDatos.close();
	}

}
