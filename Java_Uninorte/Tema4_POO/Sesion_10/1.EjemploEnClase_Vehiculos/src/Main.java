public class Main {
    public static void main(String[] args) {
        
        // Objeto número 1
        Vehiculo vehiculo1 = new Vehiculo("1998");
        System.out.println("EL MODELO DEL VEHICULO 1 ES: " + vehiculo1.getModeloVehiculo());

        vehiculo1.calcular();
        vehiculo1.calcular(60000);

        // Objeto número 2
        Vehiculo vehiculo2 = new Vehiculo();
        vehiculo2.setModeloVehiculo("1980");
        vehiculo2.setFabricanteVehiculo("Ford");
        vehiculo2.setValorVehiculo(90000);

        System.out.println("MODELO: " + vehiculo2.getModeloVehiculo());
        System.out.println("FABRICANTE: " + vehiculo2.getFabricanteVehiculo());
        System.out.println("VALOR: " + vehiculo2.getValorVehiculo());

        // Objeto 1 desde la clase Hija
        ClaseHija vehiculoHijo1 = new ClaseHija();
        vehiculoHijo1.mostrarPrecio();
        System.out.println(vehiculoHijo1);

        // Objeto 2 desde la clase Hija
        ClaseHija vehiculoHijo2 = new ClaseHija("2020", "MAZDA", 25000, 30000, true);
        System.err.println(vehiculoHijo2.toString());

        // Objeto Vehiculo_2 y Taxi
        Taxi objTaxi1 = new Taxi("WAS-658", 4);
        System.out.println(objTaxi1);

        Taxi objTaxi2 = new Taxi();
        objTaxi2.resistencia = 23.4;
        objTaxi2.setMatricula("REF-123");
        System.out.println(objTaxi2);

    }
}
