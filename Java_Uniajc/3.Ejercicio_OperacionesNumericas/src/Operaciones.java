
import java.lang.reflect.Method;
import java.util.Scanner;


public class Operaciones {
    
    private double number1, number2;
    
    // Constructor
    public Operaciones() {
    }
    
    // Get and set
    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }
    
    public void CapturarDatos(){
        Scanner capturaDatos = new Scanner(System.in);
        
        System.out.print("Ingresa un número: ");
        this.number1 = capturaDatos.nextDouble();
        
        System.out.print("Ingresa otro número: ");
        this.number2 = capturaDatos.nextDouble();
    }
    
    // Métodos
    public void Sumar(){
        System.out.println("El resultado de la suma es: " + (this.number1 + this.number2) + "\n");
    }
    
    public void Restar(){
        System.out.println("El resultado de la resta es: " + (this.number1 - this.number2) + "\n");
    }
    
    public void Multiplicar(){
        System.out.println("El resultado de la multiplicar es: " + (this.number1 * this.number2) + "\n");
    }
    
    public void Dividir(){
        System.out.println("El resultado de la dividir es: " + (this.number1 / this.number2) + "\n");
    }
    
}
