import java.util.Random;
import java.util.Scanner;

public class SumaMatrices {
    public static void main(String[] args) {
        
        Scanner capturaDatosInt = new Scanner(System.in);

        System.out.print("Filas: ");
        int filas = capturaDatosInt.nextInt();
        System.out.print("Columnas: ");
        int columnas = capturaDatosInt.nextInt();
        System.out.println();

        // Matrices
        int matrizNumeros1[][] = new int[filas][columnas];
        int matrizNumeros2[][] = new int[filas][columnas];
        int resultados[][] = new int[filas][columnas];

        // número aleatorios para las matrices.
        Random rnd = new Random();
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizNumeros1[i][j] = rnd.nextInt(10) + 1;
                matrizNumeros2[i][j] = rnd.nextInt(10) + 1;
            }
        }

        // Matriz que contiene los resultados.
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultados[i][j] = matrizNumeros1[i][j] + matrizNumeros2[i][j];
            }
        }

        // Imprimiendo las matrices
        System.out.println("MATRIZ NÚMEROS 1");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizNumeros1[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("MATRIZ NÚMEROS 2");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(matrizNumeros2[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("MATRIZ RESULTADO SUMA");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(resultados[i][j] + "\t");
            }
            System.out.println();
        }

        capturaDatosInt.close();

    }
}
