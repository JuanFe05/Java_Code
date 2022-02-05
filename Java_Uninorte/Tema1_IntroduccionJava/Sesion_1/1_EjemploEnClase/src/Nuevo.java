import java.util.Scanner;

public class Nuevo {
    public static void main(String[] args) {
        /* EJEMPLO DE VARIABLES */
        int numero1 = 0;
        int numero2, numero3;
        long numero4;
        float estatura = 1000;
        double temperatura = 36.5;
        boolean casado = false;
        char letra = 'P';
        String cadenaTexto = "Esto es una cadena";

        System.out.println(numero1);
        numero2 = 3;
        numero3 = 6;
        System.out.println(numero2 + numero3);
        numero4 = 1250;
        System.out.println(numero4);
        System.out.println(estatura);
        System.out.println(temperatura);
        System.out.println(casado);
        System.out.println(letra);
        System.out.println(cadenaTexto);

        /* CONVERSIÓN DE CADENAS A NÚMEROS Y VICEVERSA */
        String opcion = "5";
        int numeroEntero = Integer.parseInt(opcion);
        System.out.println(numeroEntero);

        int opcion2 = 65;
        String numString = Integer.toString(opcion2);
        System.out.println(numString);

        double estado = 34.696587;
        String opcDouble = Double.toString(estado);
        System.out.println(opcDouble);

        /* Output */
        System.out.println("Mensaje con println");
        System.out.print("Mensaje sin salto de linea");
        System.out.println("Operación: " + (7 / 2));

        System.out.println("Potencia: " + Math.pow(2, 6));
        System.out.println("Raiz: " + Math.sqrt(6));
        /* Format en Java */
        System.out.print("Raiz de 8: ");
        System.out.printf("%1.2f", Math.sqrt(8));

        /* Dependiendo de o segun - Switch */
        Scanner capturando = new Scanner(System.in);
        System.out.print("Ingresa un número de un día de la semana: ");
        int diaSemana = capturando.nextInt();

        switch (diaSemana) {
            case 1:
                System.out.println("LUNES");
                break;
            case 2:
                System.out.println("MARTES");
                break;
            default:
                System.out.println("DÍA INCORRECTO");
                break;
        }
        capturando.close();

        /* Dependiendo de o segun - Switch Ejemplo 2 */
        Scanner capturando2 = new Scanner(System.in);
        System.out.print("día semana: ");
        String nombreDia = capturando2.nextLine();

        switch (nombreDia) {
            case "Lunes":
                System.out.println("El dia es: " + nombreDia);
                break;
            default:
                System.out.println("Día no existe");
                break;
        }

        capturando2.close();
    }
}
