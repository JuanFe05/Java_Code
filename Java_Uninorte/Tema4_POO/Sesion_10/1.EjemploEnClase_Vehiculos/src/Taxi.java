public class Taxi extends Vehiculo_2{
    
    // Atributos
    private int numeroDeSillas;

    // Constructor
    public Taxi() {
        super();
    }
    
    public Taxi(String matricula, int numeroDeSillas) {
        super(matricula);
        this.numeroDeSillas = numeroDeSillas;
    }

    public Taxi(double resistencia, int numeroDeSillas) {
        super(resistencia);
        this.numeroDeSillas = numeroDeSillas;
    }
    
    // Get and Set
    public int getNumeroDeSillas() {
        return this.numeroDeSillas;
    }

    public void setNumeroDeSillas(int numeroDeSillas) {
        this.numeroDeSillas = numeroDeSillas;
    }

    // toString
    @Override
    public String toString() {
        return "{" + super.toString() + " numsillas='" + getNumeroDeSillas() + "}";
    }


}
