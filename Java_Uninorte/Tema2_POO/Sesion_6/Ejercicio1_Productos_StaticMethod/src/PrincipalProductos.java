import java.util.*;

public class PrincipalProductos {
    public static void main(String[] args) {

        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("CANTIDAD DE PRODUCTOS A INGRESAR: ");
        int cantidadProductos = capturaDatos.nextInt();

        Productos arrayDatos[] = new Productos[cantidadProductos];

        for (int i = 0; i < cantidadProductos; i++) {

            System.out.print("CÓDIGO PRODUCTO: ");
            int codigoProducto = capturaDatos.nextInt();

            System.out.print("PRECIO DE COMPRA: ");
            Double precioDeCompra = capturaDatos.nextDouble();

            System.out.print("CANTIDAD EN BODEGA: ");
            int cantidadEnBodega = capturaDatos.nextInt();

            System.out.print("CANTIDAD MÍNIMA EN BODEGA: ");
            int catidadMinBodega = capturaDatos.nextInt();

            System.out.print("CANTIDAD MÁXIMA EN BODEGA: ");
            int catidadMaxBodega = capturaDatos.nextInt();

            System.out.println();
            // Asignación de objetos al vector de Productos
            arrayDatos[i] = new Productos(codigoProducto, precioDeCompra, cantidadEnBodega, catidadMinBodega, catidadMaxBodega);
        }

        int cantidad_maxima = -1, cantidad = 0, posicion = 0;

        for (int i = 0; i < arrayDatos.length; i++) {
            // Verifica si se solicita pedido.
            if (miArray[i].solicitarPedido()) { System.err.println("ALERTA CÓDGO: " + miArray[i].getCodigo()); } 
            else { System.err.println("CÓDIGO: " + miArray[i].getCodigo() + " NO NECESITA PEDIDO"); }

            // verifica el código del producto que tiene mayor cantidad de unidades.
            cantidad = arrayDatos[i].getCantidadBodega();
            if (cantidad > cantidad_maxima) { cantidad_maxima = cantidad; posicion = i; }
        }

        System.out.println("PRODUCTO CON MAYOR CANTIDAD EN BODEGA " + arrayDatos[posicion].getCodigo());

        // Leer un código de producto y una cantidad de unidades de compra, indicar el total a pagar por ese pedido.
        System.out.print("CÓDIGO: ");
        int newCodigo = capturaDatos.nextInt();

        int i = 0, conteo = 0;

        while ((i < cantidadProductos) && (conteo == 0)) {
            int nuevo_codigo = arrayDatos[i].getCodigo();

            if (nuevo_codigo == newCodigo) {
                System.out.print("INGRESAR CANTIDAD DE UNIDADES DE COMPRA: ");
                int cantUnidadesCompra = capturaDatos.nextInt();

                System.out.println("TOTAL PAGAR PRODCUTO: " + arrayDatos[i].getCodigo() + " ES: " + arrayDatos[i].totalPagar(arrayDatos[i].getPrecioCompra(), cantUnidadesCompra));

                conteo = 1;
            }

            else { conteo = 0; }
        }

        if (conteo == 0) {
            System.out.println("PRODUCTO " + newCodigo + " NO EXISTE");
        }

        capturaDatos.close();

    }
}
