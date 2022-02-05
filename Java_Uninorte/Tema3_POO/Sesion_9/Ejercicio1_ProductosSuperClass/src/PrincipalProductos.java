import java.util.Scanner;

public class PrincipalProductos {
    
    static String myMenu = 
        "\n" + "----------------------" + "\n" +
        "1. Verificar Productos a pedir" + "\n" +
        "2. Producto con mayor cantidad de unidades" + "\n" +
        "3. Total a pagar por pedido a realizar" + "\n" +
        "4. Modificar cantidad mínima requerida en bodega" + "\n" +
        "5. Vender producto" + "\n" +
        "6. Salir";

    public static void main(String[] args) {
        
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("CANTIDAD DE PRODUCTOS DE CALZADO A INGRESAR: ");
        int numProductosCalzado = capturaDatos.nextInt();

        System.out.print("CANTIDAD DE PRODUCTOS DE PRENDAS A INGRESAR: ");
        int numProductosPrendas = capturaDatos.nextInt();

        // arrays
        Productos arrayProductosCalzado[] = new Productos[numProductosCalzado];
        Productos arrayProductosPrendas[] = new Productos[numProductosPrendas];

        for (int i = 0; i < numProductosCalzado; i++) {
            System.out.print("CÓDIGO PRODUCTO CALZADO: ");
            int codigoProducto = capturaDatos.nextInt();
            System.out.print("PRECIO DE COMPRA CALZADO: ");
            Double precioDeCompra = capturaDatos.nextDouble();
            System.out.print("PRECIO DE VENTA CALZADO: ");
            Double precioDeVenta = capturaDatos.nextDouble();
            System.out.print("CANTIDAD EN BODEGA CALZADO: ");
            int cantidadEnBodega = capturaDatos.nextInt();
            System.out.print("CANTIDAD MÍNIMA EN BODEGA CALZADO: ");
            int catidadMinBodega = capturaDatos.nextInt();
            System.out.print("CANTIDAD MÁXIMA EN BODEGA CALZADO: ");
            int catidadMaxBodega = capturaDatos.nextInt();
            System.out.print("DESCRIPCIÓN PRODUCTO CALZADO: ");
            String descripcionProducto = capturaDatos.nextLine();
            System.out.println();

            // Asignación de objetos al vector de Productos
            arrayProductosCalzado[i] = new Productos(codigoProducto, precioDeCompra, precioDeVenta, cantidadEnBodega, catidadMinBodega, 
                    catidadMaxBodega, descripcionProducto);
        }

        for (int i = 0; i < numProductosPrendas; i++) {
            System.out.print("CÓDIGO PRODUCTO CALZADO: ");
            int codigoProducto = capturaDatos.nextInt();
            System.out.print("PRECIO DE COMPRA CALZADO: ");
            Double precioDeCompra = capturaDatos.nextDouble();
            System.out.print("PRECIO DE VENTA CALZADO: ");
            Double precioDeVenta = capturaDatos.nextDouble();
            System.out.print("CANTIDAD EN BODEGA CALZADO: ");
            int cantidadEnBodega = capturaDatos.nextInt();
            System.out.print("CANTIDAD MÍNIMA EN BODEGA CALZADO: ");
            int catidadMinBodega = capturaDatos.nextInt();
            System.out.print("CANTIDAD MÁXIMA EN BODEGA CALZADO: ");
            int catidadMaxBodega = capturaDatos.nextInt();
            System.out.print("DESCRIPCIÓN PRODUCTO CALZADO: ");
            String descripcionProducto = capturaDatos.nextLine();
            System.out.println();

            // 
            arrayProductosPrendas[i] = new Productos(codigoProducto, precioDeCompra, precioDeVenta, cantidadEnBodega, catidadMinBodega, 
                    catidadMaxBodega, descripcionProducto);
        }

        System.out.println(myMenu);
        int opcion = Integer.parseInt(capturaDatos.nextLine());

        switch (opcion) {
            // Verificar productos a pedir: recorrer los vectores de productos 
            // y arrojar una alerta en caso tal se deba solicitar el pedido al proveedor.
            case 1:
                for (int i = 0; i < numProductosCalzado; i++) {
                    if (arrayProductosCalzado[i].solicitarPedido()) {
                        System.out.println("ALERTA GENERADA EN CÍDIGO DE CALZADO N° " + arrayProductosCalzado[i].getCodigo());
                    } else {
                        System.out.println("NO SE SOLICITA PRODUCTO N° " + arrayProductosCalzado[i].getCodigo());
                    }
                }

                for (int i = 0; i < numProductosPrendas; i++) {
                    if (arrayProductosPrendas[i].solicitarPedido()) {
                        System.out.println("ALERTA GENERADA EN CÍDIGO DE CALZADO N° " + arrayProductosPrendas[i].getCodigo());
                    } else {
                        System.out.println("NO SE SOLICITA PRODUCTO N° " + arrayProductosPrendas[i].getCodigo());
                    }
                }
            break;

            // Calzado con mayor cantidad de unidades: indicar cuál es el código del
            // producto que tiene mayor cantidad de unidades en bodega, si hay varios que
            // cumplen con la condición, indicar el primero de ellos
            case 2:
                int mayorCantidadCalzado = -1;
                Productos productoCalzado = arrayProductosCalzado[0];

                for (int i = 0; i < numProductosCalzado; i++) {
                    if (arrayProductosCalzado[i].getCantidadBodega() > mayorCantidadCalzado) {
                        mayorCantidadCalzado = arrayProductosCalzado[i].getCantidadBodega();
                        productoCalzado = arrayProductosCalzado[i];
                    }
                }
                System.out.println("CÓDIGO PRODUCTO CON MAYOR CANTIDAD EN BODEGA: " + productoCalzado.getCodigo());
            break;
            
            // Prenda con mayor cantidad de unidades: indicar cuál es el código del
            // producto que tiene mayor cantidad de unidades en bodega, si hay varios que
            // cumplen con la condición, indicar el primero de ellos.
            case 3:
                int mayorCantidadPrenda = -1;
                Productos productoPrenda = arrayProductosPrendas[0];

                for (int i = 0; i < numProductosPrendas; i++) {
                    if (arrayProductosPrendas[i].getCantidadBodega() > mayorCantidadPrenda) {
                        mayorCantidadPrenda = arrayProductosPrendas[i].getCantidadBodega();
                        productoPrenda = arrayProductosPrendas[i];
                    }
                }
                System.out.println("CÓDIGO PRODUCTO CON MAYOR CANTIDAD EN BODEGA: " + productoPrenda.getCodigo());
            break;

            // Modificar cantidad mínima requerida en bodega: leer código de producto, el
            // tipo (calzado o prenda) y el nuevo valor para la cantidad de unidades mínimas
            // requeridas, validar en el método set de la variable correspondiente que la
            // nueva cantidad no sea menor a 0, en caso de serlo establecer la cantidad
            // mínima como 0.
            case 4:
                System.out.print("INGRESAR CÓDIGO DEL PRODUCTO: ");
                int codProducto = Integer.parseInt(capturaDatos.nextLine());

                System.out.print("INGRESAR TIPO DE PRENDA (P: Prenda, C: Calzado): ");
                String tipoPrenda = capturaDatos.nextLine().toLowerCase();

                System.out.print("INGRESAR NUEVA CANTIDAD MINIMA REQUERIDA EN BODEGA: ");
                int cantidadMinimaNueva = Integer.parseInt(capturaDatos.nextLine());

                if (tipoPrenda.equalsIgnoreCase("p")) {
                    for (int i = 0; i < numProductosPrendas; i++) {
                        if (arrayProductosPrendas[i].getCodigo() == codProducto) {
                            arrayProductosPrendas[i].setCantidadMinBodega(cantidadMinimaNueva);
                        }
                    }
                }
                else {
                    for (int i = 0; i < numProductosCalzado; i++) {
                        if (arrayProductosCalzado[i].getCodigo() == codProducto) {
                            arrayProductosCalzado[i].setCantidadMinBodega(cantidadMinimaNueva);
                        }
                    }
                }
            break;
        
            // Vender producto: solicite el código de un producto a vender, el tipo
            // (calzado o prenda), y las unidades correspondientes, calcule el valor de la
            // factura con descuento y sin descuento. Validar que existan las unidades
            // necesarias para la venta y modificar las unidades existentes después de la
            // venta utilizando el método set de la variable correspondiente.
            case 5:
                System.out.print("INGRESAR CÓDIGO DEL PRODUCTO: ");
                codProducto = Integer.parseInt(capturaDatos.nextLine());

                System.out.print("INGRESAR TIPO DE PRENDA (P: Prenda, C: Calzado): ");
                tipoPrenda = capturaDatos.nextLine().toLowerCase();

                System.out.println("INGRESAR CANTIDAD DE UNIDADES A VENDER: ");
                int unidadesVenta = Integer.parseInt(capturaDatos.nextLine());

                if (tipoPrenda.equalsIgnoreCase("p")) {
                    for (int i = 0; i < numProductosPrendas; i++) {
                        if (codProducto == arrayProductosPrendas[i].getCodigo() && unidadesVenta <= arrayProductosPrendas[i].getCantidadBodega()) {
                            double totalVentaSD = unidadesVenta * arrayProductosPrendas[i].getPrecioVenta();
                            double totalVentaCD = unidadesVenta * (arrayProductosPrendas[i].getPrecioVenta() * Productos.porcentajeDescuento);

                            System.out.println("VALOR FACTURA CON DESCUENTO: " + totalVentaCD);
                            System.out.println("VALOR FACTURA SIN DESCUENTO: " + totalVentaSD);
                            arrayProductosPrendas[i].setCantidadBodega(arrayProductosPrendas[i].getCantidadBodega() - unidadesVenta);
                        }
                    }
                }
                else {
                    for (int i = 0; i < numProductosCalzado; i++) {
                        if (codProducto == arrayProductosCalzado[i].getCodigo() && unidadesVenta <= arrayProductosCalzado[i].getCantidadBodega()) {
                            double totalVentaSD = unidadesVenta * arrayProductosCalzado[i].getPrecioVenta();
                            double totalVentaCD = unidadesVenta * (arrayProductosCalzado[i].getPrecioVenta() * Productos.porcentajeDescuento);

                            System.out.println("VALOR FACTURA CON DESCUENTO: " + totalVentaCD);
                            System.out.println("VALOR FACTURA SIN DESCUENTO: " + totalVentaSD);
                            arrayProductosCalzado[i].setCantidadBodega(arrayProductosCalzado[i].getCantidadBodega() - unidadesVenta);
                        }
                    }
                }
            break;

            default:
                System.out.println("HAS SALIDO!!!");
            break;
        }

        capturaDatos.close();

    }

}
