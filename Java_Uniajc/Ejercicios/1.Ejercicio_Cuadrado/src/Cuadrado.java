import java.util.Scanner;

public class Cuadrado {
    
    // Atributos
    private double lado;

    // constructor
    public Cuadrado() {
    }

    // get and set
    public double getLado() {
        return this.lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    // Métodos
    public void capturarDatos() {
        Scanner capturaDatos = new Scanner(System.in);

        System.out.print("Ingresa el lado del cuadrado: ");
        this.lado = capturaDatos.nextDouble();

        capturaDatos.close();
    }

    public void calcularArea() {
        System.out.println("El area del cuadrado es: " + this.lado * this.lado);
    }

    public void calcularPerimetro() {
        System.out.println("El perímetro del cuadrado es: " + this.lado * 4);
    }
}
