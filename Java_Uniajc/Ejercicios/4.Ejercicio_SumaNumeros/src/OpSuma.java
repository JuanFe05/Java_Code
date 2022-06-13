import java.util.Arrays;
import java.util.Scanner;

public class OpSuma {

    // Atributo
    double suma = 0;

    // Constructor
    public OpSuma() {
    }

    // Métodos
    public void capturaDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa los números que deseas Sumar: ");
        String arrayDatos[] = sc.nextLine().split(" ");

        Sumar(arrayDatos);
    }

    public void Sumar(String datosArrayString[]) {

        double arrayDatosInt[] = Arrays.stream(datosArrayString).mapToDouble(Double::parseDouble).toArray();

        for (int i = 0; i < arrayDatosInt.length; i++) {
            System.out.print(arrayDatosInt[i] + " + ");
            suma += arrayDatosInt[i];
        }

        System.out.println("\b\b= " + suma);
    }
}
