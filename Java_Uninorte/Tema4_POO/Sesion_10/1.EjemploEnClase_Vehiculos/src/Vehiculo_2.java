public class Vehiculo_2 {
    
    // Atributos
    private String matricula;
    protected double resistencia;

    //  Constructores
    public Vehiculo_2() {
    }

    public Vehiculo_2(String matricula) {
        this.matricula = matricula;
    }

    public Vehiculo_2(double resistencia) {
        this.resistencia = resistencia;
    }

    // Get and Set
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    // toString
    @Override
    public String toString() {
        return "{" +
            " matricula='" + getMatricula() + "'" +
            "}";
    }

}
