import java.util.Scanner;

public class EjecicioCondicionalAnidado {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 4 - Condicional Anidado");
		
		Scanner capturaDato = new Scanner(System.in);
		
		System.out.print("Ingresa la cantidad en bodega: ");
		int cantidadBodega = capturaDato.nextInt();
		
		System.out.print("Ingresa la cantidad en mínima requerida: ");
		int cantidadMinima = capturaDato.nextInt();
		
		int resultadoOperacion = cantidadBodega - cantidadMinima;
		
		if (cantidadBodega > cantidadMinima && resultadoOperacion >= 10) {
			System.out.println("No es necesario realizar pedido al proveedor");
			System.out.println("Unidades que hacen falta vender: " + resultadoOperacion);
		}
		else if (cantidadBodega > cantidadMinima && resultadoOperacion < 10) {
			System.out.println("No es necesario realizar pedido al proveedor");
			System.out.println("Unidades que hacen falta vender: " + resultadoOperacion + " Alerta generada");
		}
		else {
			System.out.println("Es necesario realizar pedido al proveedor");
			
			System.out.print("Ingresa la cantidad de compra deseada: ");
			int cantidadDeseada = capturaDato.nextInt();
			
			System.out.print("Ingresa el valor de la compra: ");
			int valorCompra = capturaDato.nextInt();
			
			System.out.print("Ingresa el valor en caja: ");
			int valorCaja = capturaDato.nextInt();
			
			int operacionCompra = cantidadDeseada * valorCompra;
			int valorAceptado = valorCaja - operacionCompra;
			
			if (valorAceptado >= 0) {
				System.out.println("Si es posible realizar el pedido");
			}
			else {
				System.out.println("No es posible realizar el pedido");
			}
		}
		
		capturaDato.close();

	}

}
