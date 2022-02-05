import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner capturaDatos = new Scanner(System.in);
		
		System.out.print("CANTIDAD DE PRODUCTOS A INGRESAR: ");
		int cantidadProductos = capturaDatos.nextInt();

		Productos miArray[] = new Productos[cantidadProductos];

		for (int i = 0; i < cantidadProductos; i++) {
			
			System.out.print("CÓDIGO PRODUCTO: ");
			int codigoProducto = capturaDatos.nextInt();

			System.out.print("PRECIO DE COMPRA: ");
			Double precioDeCompra = capturaDatos.nextDouble();

			System.out.print("CANTIDAD EN BODEGA: ");
			int cantidadEnBodega = capturaDatos.nextInt();

			System.out.print("CANTIDAD MÍNIMA EN BODEGA: ");
			int catidadMinBodega = capturaDatos.nextInt();

			System.out.println();
			miArray[i] = new Productos(codigoProducto, precioDeCompra, cantidadEnBodega, catidadMinBodega);
		}

		for (int i = 0; i < miArray.length; i++) {
			System.out.print(miArray[i].getCodigo() + " ");
			System.out.print(miArray[i].getPrecioCompra() + " ");
			System.out.print(miArray[i].getCantidadBodega() + " ");
			System.out.print(miArray[i].getCantidadMinBodega() + " ");
			System.out.println();
		}

		int menor = 0;
		menor = miArray[0].getCantidadBodega();
		int codigoMenor = 0;
		codigoMenor = miArray[0].getCodigo();

		for (int i = 0; i < miArray.length; i++) {
			if (miArray[i].solicitarPedido()) { System.err.println("ALERTA CÓDGO: " + miArray[i].getCodigo()); }
			else { System.err.println("CÓDIGO: " + miArray[i].getCodigo() + " NO NECESITA PEDIDO"); }

			if (miArray[i].getCantidadBodega() < menor) {
				menor = miArray[i].getCantidadBodega();
				codigoMenor = miArray[i].getCodigo();
			}
		}

		System.out.println("CÓDIGO DEL MENOR " + codigoMenor + " Y SU CANDTIDAD ES: " + menor);
		
		capturaDatos.close();

	}

}
