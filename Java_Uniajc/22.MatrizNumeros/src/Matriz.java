public class Matriz {
    public static void main(String[] args) throws Exception {
        
        int numeros [][] = {{ 1, 5, 15, 25, 6 },
                            {22, 30, 60, 80, 3},
                            {7, 11, 99, 54, 9},
                            {18, 2, 38, 44, 78},
                            {32, 91, 17, 4, 62}};

        System.out.println("Matriz normal: ");                   
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

        int cambio;
        for (int i = 0; i < numeros.length; i++) {
            cambio = numeros[i][0];
            numeros[i][0] = numeros[i][4];
            numeros[i][4] = cambio;
        }

        System.out.println("\nMatriz con cambio de columnas: ");
        for (int i = 0; i < numeros.length; i++) {
            for (int j = 0; j < numeros[i].length; j++) {
                System.out.print(numeros[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
