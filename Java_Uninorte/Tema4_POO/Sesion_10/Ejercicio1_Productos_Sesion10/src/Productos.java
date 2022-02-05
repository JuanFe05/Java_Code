public class Productos {
    
    // Atributos
    protected int codigo;
    protected String descripcionProducto;
    protected double precioCompra;
    protected double precioVenta;
    protected int cantidadBodega;
    protected int cantidadMinimaBodega;
    protected int cantidadMaximaBodega;
    protected final static double DESCUENTO = 0.01;

    // Constructores
    public Productos() {
    }

    public Productos(int codigo, String descripcionProducto, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinimaBodega, int cantidadMaximaBodega) {
        this.codigo = codigo;
        this.descripcionProducto = descripcionProducto;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinimaBodega = cantidadMinimaBodega;
        this.cantidadMaximaBodega = cantidadMaximaBodega;
    }

    // Métodos Propios
    public boolean solicitarPedido() {
        if (this.cantidadBodega < this.cantidadBodega) {
            return true;
        } else {
            return false;
        }
    }

    public double calcularPagar(int unidades) {
        return (this.precioVenta * unidades) - ((this.precioVenta * unidades) * DESCUENTO);
    }

    // toString
    @Override
    public String toString() {
        return "{" +
            " codigo='" + this.codigo + "'" +
            ", descripcionProducto='" + this.descripcionProducto + "'" +
            ", precioCompra='" + this.precioCompra + "'" +
            ", precioVenta='" + this.precioVenta + "'" +
            ", cantidadBodega='" + this.cantidadBodega + "'" +
            ", cantidadMinimaBodega='" + this.cantidadMinimaBodega + "'" +
            ", cantidadMaximaBodega='" + this.cantidadMaximaBodega + "'" +
            "}";
    }


}
