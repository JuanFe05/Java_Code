import java.util.Scanner;

public class UsoScanner_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Valor de la cadena
        System.out.println("INGRESA TUS NOMBRES: ");
        String nombres = sc.nextLine();

        System.out.println("INGRESA TUS APELLIDOS: ");
        String apellidos = sc.next();

        // Ahora vamos a imprimir el valor que ingresamos.
        System.out.println("HOLA!!! " + nombres + " " + apellidos + " ¿COMO ESTA TODO?");

        sc.close();
    }
}
