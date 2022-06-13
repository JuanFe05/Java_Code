import java.util.Scanner;

public class ClimaCiudades {

    // Atributos
    private String ciudades[] = new String[5];
    private String temperaturas[] = new String[5];

    // constructor
    public ClimaCiudades() {
    }


    // Mis metodos
    public void capturarDatos() {
        Scanner capturaDatos = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("Ingresa el nombre de la Ciudad " + (i + 1) + ": ");
            ciudades[i] = capturaDatos.nextLine();

            System.out.print("Ingresa la temperatura de la Ciudad " + (i + 1) + ": ");
            temperaturas[i] = capturaDatos.nextLine();
        }

        capturaDatos.close();
    }

    public void promedioTemperaturas(){
        // Pasar de arrayString a arrayDouble
        double temperaturasDouble[] = new double[5];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturasDouble[i] = Double.parseDouble(temperaturas[i]);
        }

        //Calcular promedio de las temperaturas
        double sumaTemperaturas = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            sumaTemperaturas += temperaturasDouble[i];
        }

        double promedioTemperaturas = (sumaTemperaturas / 5);

        System.out.println("El promedio de las temperaturas es de: " + promedioTemperaturas);
    }

    public void menorTemperatura() {
        // Pasar de arrayString a arrayDouble
        double temperaturasDouble[] = new double[5];
        for (int i = 0; i < temperaturas.length; i++) {
            temperaturasDouble[i] = Double.parseDouble(temperaturas[i]);
        }

        //Encontrar la temperatura menor.
        int posicion = -1;
        String ciudad = ciudades[0];
        double temperaturaMenor = temperaturasDouble[0];
        
        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturasDouble[i] < temperaturaMenor) {
                temperaturaMenor = temperaturasDouble[i];
                posicion = i; 
            }
            if (posicion == i) {
                ciudad = ciudades[i];
            }
        }

        System.out.println("la ciudad con la menor temperatura es: " + ciudad + " con " + temperaturaMenor + " grados");

    }

}
