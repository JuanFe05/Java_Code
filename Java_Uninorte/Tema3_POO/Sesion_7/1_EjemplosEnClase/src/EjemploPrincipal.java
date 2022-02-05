public class EjemploPrincipal {
    public static void main(String[] args) {
        // TIPOS DE DATOS PRIMITIVOS

        // Conversión implícita - Widening Casting (Estrecha)
        int a = 45;
        double b = a;
        System.out.println(b);

        // Conversión explícita - Narrowing Casting (Amplia)
        double c = Math.PI;
        System.out.println(c);

        int d = (int) c;
        System.out.println(d);

        // CONVERSION CON CLASES ENVOLVENTES
        /*
         * Clases envolventes - Wrappers String - caso especial 
         * boolean = Boolean 
         * int = Integer 
         * float = Float 
         * double = Double
         */

        String cadena = "52";
        int e = Integer.parseInt(cadena);
        System.out.println(e);

        double f = Double.parseDouble(cadena);
        System.out.println(f);

        // 
        int matrizDatos[][] = { { 1, 2 }, { 3, 4 } };
        System.out.println("Matriz");

        Datos enviaDatos = new Datos(356, "Felipe", matrizDatos);
        int matrizDatos_2[][] = new int[2][2];

        matrizDatos_2 = enviaDatos.getMatriz();

        // Imprimiendo la matriz
        for (int i = 0; i < matrizDatos_2.length; i++) {
            for (int j = 0; j < matrizDatos_2[i].length; j++) {
                System.out.print(matrizDatos_2[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
