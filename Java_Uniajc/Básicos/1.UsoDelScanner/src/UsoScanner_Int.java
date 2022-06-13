import java.util.Scanner;

public class UsoScanner_Int {
    public static void main(String[] args) {
        /*usar el objeto Scanner y llamar a uno de los siguientes métodos.
        Cada método toma el valor de entrada de diferentes tipos de datos.*/
        Scanner sc = new Scanner(System.in);

        //int: Es un tipo de dato de 32 bits con signo para almacenar valores numéricos.
        // Cuyo valor mínimo es -231 y el valor máximo 231-1.
        System.out.println("INGRESA UN NÚMERO ENTERO: ");
        int numero = sc.nextInt(); // Valor entero

        // Ahora vamos a imprimir el valor que ingresamos.
        System.out.println("EL NÚMERO QUE INGRESO ES: " + numero);

        sc.close();
    }
}
