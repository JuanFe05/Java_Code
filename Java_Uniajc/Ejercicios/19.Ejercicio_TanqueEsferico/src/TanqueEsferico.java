import java.util.Scanner;

public class TanqueEsferico {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el radio del tanque esfércio: ");
        double radio = sc.nextDouble();

        System.out.print("Ingresa la velocidad de llenado del tanque esfércio en cm3/sg: ");
        double velocidad = sc.nextDouble();

        sc.close();

        double volumen = (4.0 / 3.0) * Math.PI * (Math.pow(radio, 3));

        double tiempo = (volumen / velocidad);

        System.out.println(tiempo);

    }
}
