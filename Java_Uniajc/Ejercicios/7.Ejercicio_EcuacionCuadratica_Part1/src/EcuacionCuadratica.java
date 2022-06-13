import java.util.Scanner;

public class EcuacionCuadratica {
    // Atributos
    private double a;
    private double b;
    private double c;

    // Constructor
    public EcuacionCuadratica() {
    }

    // Get and Set
    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    // Mis Métodos
    public void capturarDatos(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        a = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        b = sc.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        c = sc.nextDouble();

        sc.close();
    }

    public void resolverEcuacionCuadratica(){

        double discriminante, x, x1, x2, numeroReal, numeroImaginario;

        discriminante = Math.pow(b, 2) - 4 * a * c;

        if (discriminante == 0) {
            x = -b / (2 * a);
            System.out.println("Existe solo una raíz única o real: " + x);
        } else {
            if (discriminante > 0) {
                x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
                x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
                System.out.println("\nEl discriminante no es un número imaginario: " + discriminante);
                System.out.println("La raíz real de x1 es: " + x1);
                System.out.println("La raíz real de x2 es: " + x2);
            } else {
                numeroReal = -b / (2 * a);
                numeroImaginario = Math.sqrt(-discriminante) / (2 * a);
                System.out.printf("\nEl discriminante es un número imaginario: %.2fi" , numeroImaginario);
                System.out.printf("\nLa raíz real x1 es %.2f + %.2fi%n", numeroReal, numeroImaginario);
                System.out.printf("La raíz real x2 es %.2f - %.2fi%n", numeroReal, numeroImaginario);
            }
        }
    }
}
