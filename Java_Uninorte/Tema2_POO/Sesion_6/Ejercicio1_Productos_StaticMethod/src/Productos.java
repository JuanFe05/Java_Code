public class Productos {
    
    private int codigo;
    private double precioCompra;
    private int cantidadBodega;
    private int cantidadMinBodega;
    private int cantidadMaximaBodega;
    private static double porcentajeDescuento = 0.01;

    // Constructores
    public Productos(){

    }

    public Productos(int codigo, double precioCompra, int cantidadBodega, int cantidadMinBodega, int cantidadMaximaBodega) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinBodega = cantidadMinBodega;
        this.cantidadMaximaBodega = cantidadMaximaBodega;
    }

    // Get and Set
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecioCompra() {
        return this.precioCompra;
    }

    public void setPrecioCompra(double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public int getCantidadBodega() {
        return this.cantidadBodega;
    }

    public void setCantidadBodega(int cantidadBodega) {
        this.cantidadBodega = cantidadBodega;
    }

    public int getCantidadMinBodega() {
        return this.cantidadMinBodega;
    }

    public void setCantidadMinBodega(int cantidadMinBodega) {
        this.cantidadMinBodega = cantidadMinBodega;
    }

    public int getCantidadMaximaBodega() {
        return this.cantidadMaximaBodega;
    }

    public void setCantidadMaximaBodega(int cantidadMaximaBodega) {
        this.cantidadMaximaBodega = cantidadMaximaBodega;
    }

    // Metodo
    public boolean solicitarPedido() {
        if (this.cantidadBodega < this.cantidadMinBodega) { return true; } 
        else { return false; }
    }

    public double totalPagar(double precio, int cantidadUnidades) {
        return (precio * cantidadUnidades) - ((precio * cantidadUnidades) * porcentajeDescuento);
    }

    // toString
    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", precioCompra='" + getPrecioCompra() + "'" +
            ", cantidadBodega='" + getCantidadBodega() + "'" +
            ", cantidadMinBodega='" + getCantidadMinBodega() + "'" +
            ", cantidadMaximaBodega='" + getCantidadMaximaBodega() + "'" +
            "}";
    }

}
