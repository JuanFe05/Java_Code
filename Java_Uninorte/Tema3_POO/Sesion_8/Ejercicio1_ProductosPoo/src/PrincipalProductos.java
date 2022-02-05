import java.util.Scanner;

public class PrincipalProductos {
    public static void main(String[] args) {
        
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("CANTIDAD DE PRODUCTOS A INGRESAR: ");
        int cantidadProductos = capturaDatos.nextInt();

        Productos arrayDeDatos[] = new Productos[cantidadProductos];

        for (int i = 0; i < cantidadProductos; i++) {

            System.out.print("CÓDIGO PRODUCTO: ");
            int codigoProducto = capturaDatos.nextInt();
            System.out.print("PRECIO DE COMPRA: ");
            Double precioDeCompra = capturaDatos.nextDouble();
            System.out.print("PRECIO DE VENTA: ");
            Double precioDeVenta = capturaDatos.nextDouble();
            System.out.print("CANTIDAD EN BODEGA: ");
            int cantidadEnBodega = capturaDatos.nextInt();
            System.out.print("CANTIDAD MÍNIMA EN BODEGA: ");
            int catidadMinBodega = capturaDatos.nextInt();
            System.out.print("CANTIDAD MÁXIMA EN BODEGA: ");
            int catidadMaxBodega = capturaDatos.nextInt();
            System.out.println();

            // Asignación de objetos al vector de Productos
            arrayDeDatos[i] = new Productos(codigoProducto, precioDeCompra, precioDeVenta, cantidadEnBodega, catidadMinBodega, catidadMaxBodega);
        }

        // Menú
        int opcion = 0;

        do {
            System.out.println("Menú principal");
            System.out.println("1 - Verificar productos a pedir. ");
            System.out.println("2 - Producto con mayor cantidad de unidades. ");
            System.out.println("3 - Total a pagar por pedido. ");
            System.out.println("4 - Modificar cantidad mínima requerida en bodega. ");
            System.out.println("5 - Vender producto. ");
            System.out.println("6 - Salir");
            System.out.println("Elija una opción [1 - 6] ");
            opcion = lector.nextInt();
            
            switch (opcion) {
                case 1:
                    verificarProductos(arrayDeDatos);
                    break;

                case 2:
                    productoCantidadMayor(arrayDeDatos);
                    break;

                case 3:
                    totalPagar(arrayDeDatos, cantidadProductos);
                    break;

                case 6:
                    System.out.println("GRACIAS!!!");
                    break;
            
                default:

                    break;
            }

        } while (opcion != 6);

        capturaDatos.close();

    }

    // Metodo verificarProductos
    public static void verificarProductos(Productos listaProductos[]) {
        for (Productos productos : listaProductos) {
            if (productos.solicitarPedido()) {
                System.out.println("ALERTA, PEDIDO EN EL CÓDIGO: " + productos.getCodigo());
            }
        }
    }

    // Metodo productoCantidadMayor
    public static void productoCantidadMayor(Productos listaProductos[]) {
        int mayor = -1, posicion = 0, codMayor = 0;

        for (int i = 0; i < listaProductos.length; i++) {
            int cantidadBodega = listaProductos[i].getCantidadBodega();

            if (cantidadBodega > mayor) {
                mayor = listaProductos[i].getCantidadBodega();
                posicion = i;
                codMayor = posicion;
            } if (cantidadBodega == mayor) {
                posicion = i;
            }
        }
        if (codMayor < posicion) {
            System.out.println("EL PRODCUTO CON MAYOR CANTIDAD DE UNIDADES EN BODEGA ES: " + listaProductos[codMayor].getCodigo());
        }
    }

    // Método totalPagar
    public static void totalPagar(Productos listaProductos[], int cantidadProductos) {
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("INGRESA EL CÓDIGO DEL PRODUCTO: ");
        int codigoProducto = capturaDatos.nextInt();

        int i = 0, contador = 0;

        while ( i < cantidadProductos && contador == 0 ) {
            int codigo = listaProductos[i].getCodigo();

            if (codigo == codigoProducto) {
                System.out.print("DIGITE LA CANTIDAD A PAGAR: ");
                int cantidad = capturaDatos.nextInt();
                System.out.println("TOTAL A PAGAR: " + listaProductos[i].totalPagar(cantidad));
                contador = 1;
            }
            i++;
        }

        capturaDatos.close();
    }

}
