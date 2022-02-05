import java.util.Scanner;

public class BucleDoWhile {
    public static void main(String[] args) {
        /* Do While */
        Scanner capturaDatos = new Scanner(System.in);

        int contador = 0;
        boolean condition = true;

        do {
            contador ++;
            System.out.println("El contador: " + contador);
            System.out.println("Continuar ?");
            String continuar = capturaDatos.nextLine();

            if (continuar.equals("No")) {
                condition = false;
            }

        } while (condition == false);

        capturaDatos.close();
    }
}
