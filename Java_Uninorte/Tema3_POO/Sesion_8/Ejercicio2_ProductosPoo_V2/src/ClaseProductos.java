public class ClaseProductos {
    
    // Atributos
    private int codigo;
    private double precioCompra;
    private double precioVenta;
    private int cantidadBodega;
    private int cantidadMinBodega;
    private int cantidadMaximaBodega;
    public static final double porcentajeDescuento = 0.01;

    // Constructores
    public ClaseProductos() {
    }

    public ClaseProductos(int codigo, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinBodega, int cantidadMaximaBodega) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
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
    public double calcularTotalPagar(int cantidadUnidades) {
        return (this.precioCompra * cantidadUnidades);
    }

    public double calcularTotalVenta(int cantidadUnidades) {
        this.cantidadBodega -= cantidadUnidades;
        return (this.precioVenta * cantidadUnidades);
    }

    public boolean solicitarPedido() {
        if (this.cantidadBodega < this.cantidadMinBodega) {
            return true;
        } else {
            return false;
        }
    }

    // toString
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
