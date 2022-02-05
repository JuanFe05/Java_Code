public class Suma {

    // El uso de la recursividad es muy parecido a los ciclos (for, while, do while).
     public static int sumaNumero(int numero){
        int resultado;

        if (numero == 1) {
            return 1;
        } else {
            resultado = numero + sumaNumero(numero - 1);
        }
        return resultado;
    }

    public static int factorial(int numero){
        int resultado;

        if (numero == 1) {
            return 1;
        } else {
            resultado = numero * factorial(numero - 1);
        }
        return resultado;
    }

}
