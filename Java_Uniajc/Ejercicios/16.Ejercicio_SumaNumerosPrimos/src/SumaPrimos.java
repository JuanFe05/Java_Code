import java.util.Scanner;

public class SumaPrimos {
    public static void main(String[] args) throws Exception {
        
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números primos que deseas sumar: ");
        int n_numeros = capturaDatos.nextInt();

        capturaDatos.close();

        int i = 0;
        int numero = 0;

        int sumaPrimos = 0;

        String numerosPrimos = "";

        for (i = 1; i <= n_numeros; i++) {
            int contador = 0;

            for (numero = i; numero >= 1; numero--) {
                if (i % numero == 0) {
                    contador = contador + 1;
                }
            }

            if (contador == 2) {
                numerosPrimos = numerosPrimos + i + " ";
                sumaPrimos += i;
            }
        }

        System.out.println("Los numeros primos son: " + numerosPrimos);
        System.out.println(sumaPrimos);
    }
}
