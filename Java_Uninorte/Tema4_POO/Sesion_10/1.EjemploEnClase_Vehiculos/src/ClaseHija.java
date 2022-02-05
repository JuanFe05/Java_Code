public class ClaseHija extends Vehiculo {
    
    // Atributos
    private boolean frenosABS;

    // Constructor
    public ClaseHija() {
    }

    public ClaseHija(String modeloVehiculo, String fabricanteVehiculo, int valorVehiculo, double precioDeVenta, boolean tieneFrenosABS) {
        super(modeloVehiculo, fabricanteVehiculo, valorVehiculo, precioDeVenta);
        this.frenosABS = tieneFrenosABS;
    }

    // Get and Set
    public boolean isFrenosABS() {
        return this.frenosABS;
    }

    public boolean getFrenosABS() {
        return this.frenosABS;
    }

    public void setFrenosABS(boolean frenosABS) {
        this.frenosABS = frenosABS;
    }

    // Métodos
    public void mostrarPrecio() {
        System.out.println("EL VALOR DEL PRECIO DE VENTA DESDE EL HIJO: " + this.precioDeVenta);
    }

    // toString

    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();
        
        strb.append(" Modelo: ").append(super.getModeloVehiculo());
        strb.append(" Fabricante: ").append(super.getFabricanteVehiculo());
        strb.append(" Valor: ").append(this.getValorVehiculo());
        strb.append(" Precio venta: ").append(this.precioDeVenta);
        strb.append(" Tiene frenos ABS: ").append(this.frenosABS);
        
        return strb.toString();
    }


}
