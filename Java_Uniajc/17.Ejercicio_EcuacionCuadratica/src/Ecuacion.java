import java.util.Scanner;

public class Ecuacion {
    public static void main(String[] args)  {
        
        /* Inicio captura de datos */
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Ingresa el número a: ");
        double a = capturaDatos.nextDouble();

        while (a == 0) {
            System.out.print("Ingresa el número a: ");
            a = capturaDatos.nextDouble();
        }

        System.out.print("Ingresa el número b: ");
        double b = capturaDatos.nextDouble();

        System.out.print("Ingresa el número c: ");
        double c = capturaDatos.nextDouble();

        capturaDatos.close();
        /* Fin captura de datos */

        /* Evaluando el discriminante */
        double discriminante = (Math.pow(b, 2) - (4 * a * c));

        /* Evalua si el discriminante es igual a cero */
        if (discriminante == 0) {
            double x = ((-b) - (4 * a * c)) / (2 * a);
            System.out.println("X: " + x);
        }

        /* Evalua si el discriminante es mayor a cero */
        else if (discriminante > 0) {
            double x1 = ((-b) + Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            double x2 = ((-b) - Math.sqrt(Math.pow(b, 2) - (4 * a * c))) / (2 * a);
            System.out.println("X1: " + x1 + " , X2:" + x2);
        }

        /* Evalua si el discriminante es menor a cero */
        else {
            System.out.println("Solución compleja, 'No tiene Solución'");
        }

    }
}
