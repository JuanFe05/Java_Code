public class Vehiculo {
    
    // Atributos
    protected String matricula;
    protected int modelo;
    protected String fabricante;
    private int codigoEmpresaFabricante;

    // Constructores
    public Vehiculo() {

    }

    public Vehiculo(String matricula, String fabricante) {
        this.matricula = matricula;
        this.fabricante = fabricante;
    }

    public Vehiculo(String matricula, int modelo, String fabricante) {
        this.matricula = matricula;
        this.modelo = modelo;
        this.fabricante = fabricante;
    }
    
    // Get and set
    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getModelo() {
        return this.modelo;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getCodigoEmpresaFabricante() {
        return this.codigoEmpresaFabricante;
    }

    public void setCodigoEmpresaFabricante(int codigoEmpresaFabricante) {
        this.codigoEmpresaFabricante = codigoEmpresaFabricante;
    }
    
    // toString
    @Override
    public String toString() {
        return "{" +
            " matricula ='" + getMatricula() + "'" +
            ", modelo ='" + getModelo() + "'" +
            ", fabricante ='" + getFabricante() + "'" +
            ", codigoEmpresaFabricante ='" + getCodigoEmpresaFabricante() + "'" +
            "}";
    }

}
