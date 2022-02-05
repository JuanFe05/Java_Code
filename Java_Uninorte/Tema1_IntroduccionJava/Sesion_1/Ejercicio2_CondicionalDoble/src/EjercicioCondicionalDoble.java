import java.util.Scanner;

public class EjercicioCondicionalDoble {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 2 - Condicional Doble");
		
		
		Scanner capturaDato = new Scanner(System.in);
		
		
		System.out.print("Ingresa la cantidad en bodega: ");
		int cantidadBodega = capturaDato.nextInt();
		
		System.out.print("Ingresa la cantidad en mínima requerida: ");
		int cantidadMinima = capturaDato.nextInt();
		
		if (cantidadBodega > cantidadMinima) {
			System.out.println("No es necesario realizar pedido al proveedor");
		}
		else if (cantidadMinima > cantidadBodega) {
			System.out.println("Es necesario realizar el pedido al proveedor");
			
			System.out.print("Ingresa la cantidad en bodega: ");
		}
		
		capturaDato.close();

	}

}
