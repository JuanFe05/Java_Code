import java.util.Scanner;

public class App {

    // Atributos para la clase
    static Scanner capturaDatos;
    static String menu = 
        "\n" + "----------------------" + "\n" +
        "1. Verificar Productos a pedir" + "\n" +
        "2. Producto con mayor cantidad de unidades" + "\n" +
        "3. Total a pagar por pedido a realizar" + "\n" +
        "4. Modificar cantidad mínima requerida en bodega" + "\n" +
        "5. Vender producto" + "\n" +
        "6. Salir";

    public static void main(String[] args) {
        
        capturaDatos = new Scanner(System.in);

        // LECTURA DE DATOS
        System.out.print("CANTIDAD DE PRODUCTOS A INGRESAR: ");
        int cantidadProductos = Integer.parseInt(capturaDatos.nextLine());

        ClaseProductos arrayDeDatos[] = new ClaseProductos[cantidadProductos];

        for (int i = 0; i < arrayDeDatos.length; i++) {

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
            arrayDeDatos[i] = new ClaseProductos(codigoProducto, precioDeCompra, precioDeVenta, cantidadEnBodega, catidadMinBodega, catidadMaxBodega);
        }

        // PROCESOS
        while (true) {
            System.out.println(menu);
            System.out.print("DIGITA UNA OPCIÓN: ");
            int opcion = capturaDatos.nextInt();

            if (opcion == 6) {
                break;
            }

            switch (opcion) {
                case 1:
                    verificarProductos(arrayDeDatos);
                    break;

                case 2:
                    productoMayorCantidad(arrayDeDatos);
                    break;

                case 3:
                    totalPagarPedido(arrayDeDatos);
                    break;

                case 4:
                    modificarCantidadMinima(arrayDeDatos);
                    break;

                case 5:
                    venderProducto(arrayDeDatos);
                    break;
            
                default:
                    System.out.println("OPCIÓN NO VALIDA");
                    break;
            }

        }

        capturaDatos.close();
    
    }

    // Método verificarProductos
    public static void verificarProductos(ClaseProductos arrayListaProductos[]) {
        for (ClaseProductos productos : arrayListaProductos) {
            if (productos.solicitarPedido()) {
                System.out.println("ALERTA, PEDIDO EN EL CÓDIGO: " + productos.getCodigo());
            }
        }
    }

    // Método productoMayorCantidad
    public static void productoMayorCantidad(ClaseProductos arrayListaProductos[]) {
        int mayor = 0;
        for (int i = 0; i < arrayListaProductos.length; i++) {
            if (arrayListaProductos[i].getCantidadBodega() > arrayListaProductos[mayor].getCantidadBodega()) {
                mayor = i;
            }
        }
        System.out.println("EL MAYOR ES EL CÓDIGO: " + arrayListaProductos[mayor].getCodigo() + " CON " + arrayListaProductos[mayor].getCantidadBodega() + " UNIDADES EN BODEGA");
    }

    // Método totalPagarPedido
    public static void totalPagarPedido(ClaseProductos arrayListaProductos[]) {

        System.out.print("INGRESAR CÓDIGO DEL PRODUCTO: ");
        int codigoProducto = capturaDatos.nextInt();

        for (ClaseProductos claseProductos : arrayListaProductos) {
            if (claseProductos.getCodigo() == codigoProducto) {
                
                System.out.print("INGRESA EL NÚMERO DE UNIDADES A COMPRAR: ");
                int cantidadUnidades = capturaDatos.nextInt();

                if (claseProductos.getCantidadBodega() + cantidadUnidades > claseProductos.getCantidadMaximaBodega()) {
                    System.out.println("NO SE PUEDE REALIZAR COMPRA, SUPERA LA CANTIDAD MÁXIMA EN BODEGA.");
                    return;
                }

                System.out.println("EL TOTAL A PAGAR ES: " + claseProductos.calcularTotalPagar(cantidadUnidades));
                return;

            }
        }

        System.out.println("PRODUCTO NO ENCONTRADO");
    }

    // Método modificarCantidadMinima
    public static void modificarCantidadMinima(ClaseProductos arrayListaProductos[]) {
        
        System.out.print("INGRESAR CÓDIGO DEL PRODUCTO: ");
        int codigoProducto = capturaDatos.nextInt();

        for (ClaseProductos claseProductos : arrayListaProductos) {
            if (claseProductos.getCodigo() == codigoProducto) {

                System.out.println("La cantidad minima actual es " + claseProductos.getCantidadMinBodega()
                        + " ¿Seguro que quiere cambiarlo y/n?");
                String dato = capturaDatos.nextLine().toLowerCase();

                if (dato.equals("y")) {
                    System.out.print("\nIngrese la nueva cantidad minima del producto: ");
                    claseProductos.setCantidadMaximaBodega(capturaDatos.nextInt());;
                }

                return;
            }
        }

        System.out.println("PRODUCTO NO ENCONTRADO");
    }

    // Método venderProducto
    public static void venderProducto(ClaseProductos arrayListaProductos[]) {
        
        System.out.print("INGRESAR CÓDIGO DEL PRODUCTO: ");
        int codigoProducto = capturaDatos.nextInt();

        for (ClaseProductos claseProductos : arrayListaProductos) {
            if (claseProductos.getCodigo() == codigoProducto) {
                System.out.print("INGRESA EL NÚMERO DE UNIDADES A VENDER: ");
                int cantidadUnidades = capturaDatos.nextInt();

                if (cantidadUnidades > claseProductos.getCantidadBodega()) {
                    System.out.println("NO HAY SUFICIENTE CANTIDAD EN BODEGA PARA VENDER.");
                    return;
                }

                double valorFactura = claseProductos.calcularTotalVenta(cantidadUnidades);

                System.out.println("Factura sin decuento" + "\t\t" + (valorFactura));
                System.out.println("Factura con decuento" + "\t\t" + (valorFactura - valorFactura * (claseProductos.porcentajeDescuento)));
                
                return;
            }
        }

        System.out.println("PRODUCTO NO ENCONTRADO");
    }

}
