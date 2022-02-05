import java.util.Random;
import java.util.Scanner;

public class EjemploMatrices {
    public static void main(String[] args) {
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Rows: ");
        int filas = capturaDatos.nextInt();
        System.out.print("Cols: ");
        int columnas = capturaDatos.nextInt();

        int miMatriz[][] = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                Random rnd = new Random();
                miMatriz[i][j] = rnd.nextInt(100) + 1;
            }
        }

        System.out.println("FILAS");
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print(miMatriz[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("COLUMNAS");
        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(miMatriz[j][i] + "\t");
            }
            System.out.println();
        }

        capturaDatos.close();
    }
}
