import java.util.Scanner;

public class PrincipalMisProductos {
    public static void main(String[] args) {
        
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Ingresa el código: ");
        int codigo = capturaDatos.nextInt();

        System.out.print("Ingresa el precio de compra: ");
        int precioCompra = capturaDatos.nextInt();

        System.out.print("Ingresa la cantidad en bodega: ");
        int cantidadBodega = capturaDatos.nextInt();

        System.out.print("Ingresa la cantidad mínima requerida en bodega: ");
        int cantidadMinimaBodega = capturaDatos.nextInt();

        MisProductos metodoPrincipal = new MisProductos(codigo, precioCompra, cantidadBodega, cantidadMinimaBodega);

        if (metodoPrincipal.solicitarPedido()) {
            System.out.println("ALERTA, SE DEBE HACER PEDIDO EN " + codigo);
        } else {
            System.out.println("TODO CONTROLADO!!!");
        }

        capturaDatos.close();

    }
}
