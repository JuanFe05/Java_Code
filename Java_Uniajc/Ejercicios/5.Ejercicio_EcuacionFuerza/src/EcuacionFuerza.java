import java.util.Scanner;

public class EcuacionFuerza {
    
    // Atributos
    private double masa;
    private double aceleracion;

    // Constructor
    public EcuacionFuerza() {
    }

    // get and set
    public double getMasa() {
        return this.masa;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public double getAceleracion() {
        return this.aceleracion;
    }

    public void setAceleracion(double aceleracion) {
        this.aceleracion = aceleracion;
    }

    // Metodos
    public void capturarDatos() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la masa (Kg): ");
        this.masa = sc.nextDouble();

        System.out.print("Ingresa la aceleración (S): ");
        this.aceleracion = sc.nextDouble();

        sc.close();
    }

    public void ecuacionDeLaFuerza() {
        double fuerza = this.masa * this.aceleracion;

        System.out.println("El resultado de la ecuación de la fuerza donde, la masa es: " + this.masa + " y la aceleración es: " + this.aceleracion + " da como resultado una fuerza de: " + fuerza);
    }

}
