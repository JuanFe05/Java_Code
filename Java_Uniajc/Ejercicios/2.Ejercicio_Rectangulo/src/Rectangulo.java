import java.util.Scanner;

public class Rectangulo {
    
    // Atributos
    private double base, altura;

    // Constructor
    public Rectangulo() {
    }

    // Get and set
    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    // Métodos
    public void capturarDatos() {
        Scanner capturaDatos = new Scanner(System.in);
        
        System.out.print("Ingresa la base del rectangulo: ");
        this.base = capturaDatos.nextDouble();

        System.out.print("Ingresa la altura del rectangulo: ");
        this.altura = capturaDatos.nextDouble();

        capturaDatos.close();
    }

    public void calcularArea() {
        System.out.println("El area del cuadrado es: " + this.base * this.altura);
    }
}
