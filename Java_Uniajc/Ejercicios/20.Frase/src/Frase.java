public class Frase {
    public static void main(String[] args) throws Exception {
        
        String frase ="Hola perritos";

        int vocales = 0;

        for (int i = 0; i < frase.length(); i++) {

            if ((frase.charAt(i) == 'a') || (frase.charAt(i) == 'e') || (frase.charAt(i) == 'i')
                    || (frase.charAt(i) == 'o') || (frase.charAt(i) == 'u')) {
                vocales++;
            }

        }

        System.out.println("La frase " + frase + " tiene " + vocales + " vocales");

        String fraseSinEspacios = frase.replaceAll("\\s+", ""); //LE QUITA LOS ESPACIOS EN BLANCO A LA FRASE

        int noVocales = fraseSinEspacios.length() - vocales; //RESTA LA LONGITUD DE LA FRASE MENOS LAS VOCALES

        System.out.println("La frase " + frase + " tiene " + noVocales + " no vocales");

        // Invertir la frase
        StringBuilder strb = new StringBuilder(frase);
        frase = strb.reverse().toString();
        System.out.println(frase);

        //Otra forma de invertir la frase
        char[] letras = frase.toCharArray();

        int contador = 0;
        int terminado = letras.length - 1;
        char resultado;

        while (terminado > contador) {
            resultado = letras[contador];
            letras[contador] = letras[terminado];
            letras[terminado] = resultado;

            terminado--;
            contador++;
        }

        String str = new String(letras);
        System.out.println(str);

    }
}
