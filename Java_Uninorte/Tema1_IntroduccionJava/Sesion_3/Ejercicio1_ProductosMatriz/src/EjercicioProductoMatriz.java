import java.util.*;

public class EjercicioProductoMatriz {
    public static void main(String[] args) {
        Scanner capturaDatosString = new Scanner(System.in);

        // Datos Lista de códigos.
        System.out.print("Ingresa los códigos de los productos: ");
        String arrayCodigos[] = capturaDatosString.nextLine().split("[;, ?.@]+");
        
        // Datos cantidad bodega.
        System.out.print("Ingresa los datos cantidad en bodega del producto: ");
        String arrayCantidadBodega[] = capturaDatosString.nextLine().split("[; ?.@]+");
        
        // Datos cantidad minima.
        System.out.print("Ingresa los datos cantidad mínima requerida del producto: ");
        String arrayCantidadMinima[] = capturaDatosString.nextLine().split("[; ?.@]+");
        System.out.println();

        int col = arrayCodigos.length;
        int row = arrayCantidadBodega.length / col;

        int matrizCantidadBodega[][] = new int[row][col];
        int matrizCantidadMinima[][] = new int[row][col];
        
        int contador = 0;
        
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrizCantidadBodega[i][j] = Integer.parseInt(arrayCantidadBodega[contador]);
                matrizCantidadMinima[i][j] = Integer.parseInt(arrayCantidadMinima[contador]);
                contador++;
                if (matrizCantidadBodega[i][j] < matrizCantidadMinima[i][j]) {
                    System.out.println("Se debe solicitar producto: " + arrayCodigos[j] + " en sede " + i);
                }
            }
        }
        System.out.println();

        // Suma y Promedio de productos.
        for (int i = 0; i < col; i++) {
            double sumaProductos = 0, promedioProductos = 0;
            for (int j = 0; j < col; j++) {
                sumaProductos += matrizCantidadBodega[i][j];
            }
            promedioProductos = sumaProductos / row;
            System.out.println("El promedio de productos del codigo: " + arrayCodigos[i] + " es " + promedioProductos);
        }
        System.out.println();

        // Imprimiendo el array y las matrices.
        System.out.println("LISTA DE CÓDIGOS: ");
        for (int i = 0; i < arrayCodigos.length; i++) {
            System.out.print(arrayCodigos[i] + " \t");
        }
        System.out.println("\n");

        System.out.println("TABLA CANTIDAD EN BODEGA:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrizCantidadBodega[i][j] + " \t");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("TABLA CANTIDAD MÍNIMA EN BODEGA:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(matrizCantidadMinima[i][j] + " \t");
            }
            System.out.println();
        }
        
        capturaDatosString.close();
    }
}
