public class PrincipalVehiculo {
    public static void main(String[] args) {
        
        Vehiculo myCar_1 = new Vehiculo("XE123", 1998, "FORD");
        System.out.println("CARRO 1");
        System.out.println("MODELO: " + myCar_1.getModelo() + " MATRICULA: " + myCar_1.getMatricula() + " FABRICANTE: " + myCar_1.getFabricante());

        //
        Vehiculo myCar_2 = new Vehiculo();
        myCar_2.setMatricula("GR982");
        myCar_2.setModelo(2020);
        myCar_2.setFabricante("MAZDA");
        
        System.out.println("CARRO 2");
        System.out.println("FABRICANTE DE AUTO: " + myCar_2.getFabricante());
        System.out.println("MODELO DE AUTO: " + myCar_2.getModelo());
        System.out.println("MATRICULA AUTO" + myCar_2.getMatricula());

        // 
        Taxi myTaxi_1 = new Taxi();
        System.out.println(myTaxi_1);

        myTaxi_1.setNumeroLicencia(10000);
        System.out.println(myTaxi_1.getNumeroLicencia());

        Taxi myTaxi_2 = new Taxi(3820, "FR120", 2010, "AUDI");
        System.out.println(myTaxi_2);

        Taxi myTaxi_3 = new Taxi(1452, "BB104", 2018, "SUZUKI", 109);
        System.out.println(myTaxi_3);
    }
}
