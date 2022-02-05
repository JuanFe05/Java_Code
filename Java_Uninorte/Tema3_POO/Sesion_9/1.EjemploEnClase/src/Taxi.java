import java.lang.StringBuilder;

public class Taxi extends Vehiculo {
    
    // Atributos
    private int numeroLicencia;

    // Constructores
    public Taxi() {

    }

    public Taxi(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    public Taxi(int numeroLicencia, String matricula, int modelo, String fabricante, int codigoEmpresaFabricante) {
        super(matricula, modelo, fabricante);
        super.setCodigoEmpresaFabricante(codigoEmpresaFabricante);
        this.numeroLicencia = numeroLicencia;
    }

    public Taxi(int numeroLicencia, String matricula, int modelo, String fabricante) {
        super(matricula, modelo, fabricante);
        this.numeroLicencia = numeroLicencia;
    }

    // get and set
    public int getNumeroLicencia() {
        return this.numeroLicencia;
    }

    public void setNumeroLicencia(int numeroLicencia) {
        this.numeroLicencia = numeroLicencia;
    }

    // toString - StringBuilder

    @Override
    public String toString() {
        StringBuilder stb = new StringBuilder();

        stb.append("{ numeroLicencia : ").append(getNumeroLicencia());
        stb.append(", ").append(super.toString()).append(" }");

        return stb.toString();
    }

}
