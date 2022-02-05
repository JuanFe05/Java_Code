import java.util.Scanner;

public class Ejercicio7_ForWhile {
    public static void main(String[] args) {
        Scanner capturaDatosString = new Scanner(System.in);
        Scanner capturaDatosNum = new Scanner(System.in);

        int cantidadProducto = 0, valorProducto = 0, totalVendido = 0, totalFactura = 0;
        boolean aceptado = true;
        int numPersona = 1;

        while (aceptado) {
            System.out.println("Cliente: " + numPersona);
            numPersona++;

            System.out.print("Ingresa la cantidad de tipo de productos: ");
            int numDeProductos = capturaDatosNum.nextInt();

            for (int i = 0; i < numDeProductos; i++) {
                System.out.print("Cantidad del producto " + (i + 1) + ": ");
                cantidadProducto = capturaDatosNum.nextInt();

                System.out.print("Valor del producto " + (i + 1) + ": ");
                valorProducto = capturaDatosNum.nextInt();

                totalVendido += (cantidadProducto * valorProducto);
            }

            System.out.println("Total de la factura: " + totalFactura + "\n");

            System.out.print("Continuar con otro cliente (SI/NO): ");
            String continuarOp = capturaDatosString.nextLine().toUpperCase();

            if (continuarOp.equals("NO")) {
                aceptado = false;
            }
        }

        System.out.println("Total vendido: " + totalVendido + "\n");

        capturaDatosString.close();
        capturaDatosNum.close();
    }
}
