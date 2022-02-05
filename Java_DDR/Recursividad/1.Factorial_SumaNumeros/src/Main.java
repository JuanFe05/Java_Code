public class Main {
    public static void main(String[] args) {

        int numero = 4;

        // De esta forma se llama un método estático, el cual nos retorna un resultado
        // y lo almacenamos en una variable llamada "resultado"
        int resultadoSuma = Suma.sumaNumero(numero);
        int resultadoFactorial = Suma.factorial(numero);

        System.out.println("RESULTADO SUMA: " + resultadoSuma);
        System.out.println("RESULTADO FACTORIAL: " + resultadoFactorial);
    }
}
