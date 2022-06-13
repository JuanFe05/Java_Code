import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el número: ");
        int numero = sc.nextInt(); 

        System.out.print("Ingresa la potencia: ");
        int potencia = sc.nextInt();

        Potencia objPotencia = new Potencia(numero, potencia);

        double resultado = objPotencia.calcular_potencia();

        System.out.println(numero + " ^ " + potencia + " = " + resultado);

        sc.close();
    }
}
