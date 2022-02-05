public class Productos {
    
    // Atributos
    private int codigo;
    private double precioCompra;
    private double precioVenta;
    private int cantidadBodega;
    private int cantidadMinBodega;
    private int cantidadMaximaBodega;
    private static double porcentajeDescuento = 0.01;

    // Constructor
    public Productos(int codigo, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinBodega, int cantidadMaximaBodega) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinBodega = cantidadMinBodega;
        this.cantidadMaximaBodega = cantidadMaximaBodega;
    }
    
    // Get and set
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

    public double getPrecioVenta() {
        return this.precioVenta;
    }

    public void setPrecioVenta(double precioVenta) {
        this.precioVenta = precioVenta;
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

    // Metodos
    public boolean solicitarPedido() {
        if (this.cantidadBodega < this.cantidadMinBodega) {
            return true;
        } else {
            return false;
        }
    }

    public double totalPagar(int cantidadUnidades) {
        return (precio * cantidadUnidades) - ((precio * cantidadUnidades) * porcentajeDescuento);
    }

    //
    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", precioCompra='" + getPrecioCompra() + "'" +
            ", precioVenta='" + getPrecioVenta() + "'" +
            ", cantidadBodega='" + getCantidadBodega() + "'" +
            ", cantidadMinBodega='" + getCantidadMinBodega() + "'" +
            ", cantidadMaximaBodega='" + getCantidadMaximaBodega() + "'" +
            "}";
    }

}
