public class VectorNumeros {
    public static void main(String[] args) {

        int numeros[] = { 727, 47, 479, 741, 843, 871, 63, 747, 749, 7453 }; //3 primos
        int n = 10;

        // Números primos
        int contadorPrimos = 0;
        boolean esPirmo = true;

        // Números con tres diígitos.
        int contadorDigitos = 0;

        // Números primos
        for (int x = 0; x < n; x++) {

            int numeroSolo = numeros[x]; // Pone cada número en la varible

            if (numeroSolo == 0 || numeroSolo == 1 || numeroSolo == 4) {
                esPirmo = false;
            }

            for (int j = 2; j < numeroSolo / 2; j++) {
                // Si es divisible por cualquiera de estos números, no es primo
                if (numeroSolo % j == 0)
                    esPirmo = false;
            }

            if (esPirmo == true) {
                contadorPrimos ++;
            }
        }
        // Fin números primos

        // Tres digitos
        for (int i = 0; i < n; i++) {

            int numeroSolo = numeros[i]; // Pone cada número en la varible

            String numeroString = Integer.toString(numeroSolo); // Pasamos el numero a string para saber cuantos dígitos tiene.

            if (numeroString.length() == 3) {
                contadorDigitos ++;
            }
        }
        // fin tres digitos

        System.out.println("Numeros primos: " + contadorPrimos);
        System.out.println("Numeros con 3 digitos: " + contadorDigitos);

    }
}
