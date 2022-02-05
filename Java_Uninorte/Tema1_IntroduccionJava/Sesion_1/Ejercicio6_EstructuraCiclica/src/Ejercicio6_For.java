import java.util.*;

public class Ejercicio6_For {
    public static void main(String[] args) {
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de tipo de productos: ");
        int numDeProductos = capturaDatos.nextInt();

        int cantidadProducto, valorProducto, totalFactura = 0;

        for (int i = 0; i < numDeProductos; i++) {
            System.out.print("Cantidad del producto " + (i + 1) + " : ");
            cantidadProducto = capturaDatos.nextInt();

            System.out.print("Valor del producto " + (i + 1) + " : ");
            valorProducto = capturaDatos.nextInt();

            totalFactura += (cantidadProducto * valorProducto);
        }

        System.out.print("Total de la factura: " + totalFactura);

        capturaDatos.close();
    }
}
