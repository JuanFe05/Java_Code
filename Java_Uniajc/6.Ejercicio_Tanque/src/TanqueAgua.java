import java.util.*;

public class TanqueAgua {
    
    // Atributos
    private double radio;
    private double altura;
    private double velocidad;

    // Constructor
    public TanqueAgua() {
    }
    
    // get and set
    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return this.velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    // Métodos
    public void capturarDatos() {
        Scanner captura = new Scanner(System.in);

        System.out.print("Ingresa el radio del tanque: ");
        this.radio = Double.parseDouble(captura.nextLine());

        System.out.print("Ingresa la altura del tanque: ");
        this.altura = Double.parseDouble(captura.nextLine());

        System.out.print("Ingresa la velocidad de llenado del tanque: ");
        this.velocidad = Double.parseDouble(captura.nextLine());

        captura.close();
    }

    public void calcularTiempo() {
        
        double volumen, tiempo;
        volumen = Math.PI * Math.pow(radio, 2) * this.altura;
        tiempo = volumen / this.velocidad;

        System.out.print("El tiempo que tarde en llenar el tanque es de:  " + tiempo);

    }

}
