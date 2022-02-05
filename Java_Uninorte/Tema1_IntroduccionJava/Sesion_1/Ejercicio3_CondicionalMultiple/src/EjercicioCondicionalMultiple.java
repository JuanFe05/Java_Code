import java.util.Scanner;

public class EjercicioCondicionalMultiple {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 3 - Condicional Multiple");
		
		
		Scanner capturaDato = new Scanner(System.in);
		
		
		System.out.print("Ingresa la cantidad en bodega: ");
		int cantidadBodega = capturaDato.nextInt();
		
		System.out.print("Ingresa la cantidad en mínima requerida: ");
		int cantidadMinima = capturaDato.nextInt();
		
		int operacion = cantidadBodega - cantidadMinima;
		
		if (cantidadBodega > cantidadMinima && operacion > 10) {
			System.out.println("No es necesario realizar pedido al proveedor");
			System.out.println("Unidades que hacen falta vender: " + operacion);
		}
		else if (cantidadBodega > cantidadMinima && operacion < 10) {
			System.out.println("No es necesario realizar pedido al proveedor");
			System.out.println("Unidades que hacen falta vender: " + operacion + " Alerta generada");
		}
		else {
			System.out.println("Es necesario realizar el pedido al proveedor");
		}
		
		capturaDato.close();

	}

}
