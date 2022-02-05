public class Productos {
    
    // Atributos
    private int codigo;
    private double precioCompra;
    private double precioVenta;
    private int cantidadBodega;
    private int cantidadMinBodega;
    private int cantidadMaximaBodega;
    private String descripcionProducto;
    static double porcentajeDescuento = 0.01;

    // Constructor
    public Productos(int codigo, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinBodega, int cantidadMaximaBodega, String descripcionProducto) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinBodega = cantidadMinBodega;
        this.cantidadMaximaBodega = cantidadMaximaBodega;
        this.descripcionProducto = descripcionProducto;
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

    public String getDescripcionProducto() {
        return this.descripcionProducto;
    }

    public void setDescripcionProducto(String descripcionProducto) {
        this.descripcionProducto = descripcionProducto;
    }

    // Metodos
    public boolean solicitarPedido() {
        if (this.cantidadBodega < this.cantidadMinBodega) {
            return true;
        } else {
            return false;
        }
    }

    public double totalPagar(int cantidadUnidades){
        return cantidadUnidades * precioCompra;
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
            ", descripcionProducto='" + getDescripcionProducto() + "'" +
            "}";
    }


}
