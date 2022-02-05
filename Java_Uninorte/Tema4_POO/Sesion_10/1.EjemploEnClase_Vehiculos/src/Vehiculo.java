public class Vehiculo {

    // Atributos
    private String modeloVehiculo;
    private String fabricanteVehiculo;
    private int valorVehiculo;
    protected double precioDeVenta;

    // Constructores
    public Vehiculo() {
    }

    public Vehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public Vehiculo(String modeloVehiculo, String fabricanteVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
        this.fabricanteVehiculo = fabricanteVehiculo;
    }

    public Vehiculo(String modeloVehiculo, String fabricanteVehiculo, int valorVehiculo, double precioDeVenta) {
        this.modeloVehiculo = modeloVehiculo;
        this.fabricanteVehiculo = fabricanteVehiculo;
        this.valorVehiculo = valorVehiculo;
        this.precioDeVenta = precioDeVenta;
    }

    // Get and Set
    public String getModeloVehiculo() {
        return this.modeloVehiculo;
    }

    public void setModeloVehiculo(String modeloVehiculo) {
        this.modeloVehiculo = modeloVehiculo;
    }

    public String getFabricanteVehiculo() {
        return this.fabricanteVehiculo;
    }

    public void setFabricanteVehiculo(String fabricanteVehiculo) {
        this.fabricanteVehiculo = fabricanteVehiculo;
    }

    public int getValorVehiculo() {
        return this.valorVehiculo;
    }

    public void setValorVehiculo(int valorVehiculo) {
        this.valorVehiculo = valorVehiculo;
    }

    // Método propios u otros métodos
    public void calcular() {
        System.out.println(this.valorVehiculo);
    }

    public void calcular(int otroValor) {
        this.valorVehiculo = 2000;
        System.out.println(valorVehiculo - otroValor);
    }
    
}
