import java.util.Scanner;

public class UsoScanner_FloatAndDouble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //float
        //Es un tipo dato para almacenar números en coma flotante con precisión simple de 32 bits.
        // Valor float
        System.out.println("INGRESA UN NÚMERO: ");
        float numeroFloat = sc.nextFloat();

        //double
        //Es un tipo de dato para almacenar números en coma flotante con doble precisión de 64 bits.
        // Valor double
        System.out.println("INGRESA OTRO NÚMERO: ");
        double numeroDouble = sc.nextDouble();

        System.out.println("EL RESULTADO DE SUMAR: " + numeroFloat + " + " + numeroDouble + " ES: " + (numeroFloat + numeroDouble));

        sc.close();
    }
}
