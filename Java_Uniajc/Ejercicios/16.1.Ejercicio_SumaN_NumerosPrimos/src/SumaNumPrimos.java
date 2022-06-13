import java.util.Scanner;

public class SumaNumPrimos {
    public static void main(String[] args) throws Exception {
        
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de números primos que deseas sumar: ");
        int n_numeros = capturaDatos.nextInt();

        capturaDatos.close();

        int contador, numero;
        int i = 1;
        int numeroPrimos = 2;
        int sumaPrimos = 0;

        while(i <= n_numeros){
            numero = 1;

            for(contador = 2; contador <= numeroPrimos-1; contador++){
                if(numeroPrimos % contador == 0) { //Será cierto si "numerosPrimos" no es primo 
                    numero = 0;
                    break;      //El bucle terminará si el número no es primo
                } 
            }

            if(numero == 1){
                System.out.print(numeroPrimos + " ");
                sumaPrimos += numeroPrimos;
                i++;
            }

            numeroPrimos ++;
        }

        System.out.println("\nLa suma es: " + sumaPrimos);
    }
}

