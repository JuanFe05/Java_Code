public class Calzado extends Productos {
    
    // Atributos
    private int talla;

    // Constructor
    public Calzado() {
    }

    public Calzado(int codigo, String descripcionProducto, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinimaBodega, int cantidadMaximaBodega, int talla) {
        super(codigo, descripcionProducto, precioCompra, precioVenta, cantidadBodega, cantidadMinimaBodega, cantidadMaximaBodega);
        this.talla = talla;
    }

    // Get and Set
    public int getTalla() {
        return this.talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    // toString
    @Override
    public String toString() {
        StringBuilder strb = new StringBuilder();

        strb.append(" Código: ").append(codigo);
        strb.append(" Descripcion: ").append(descripcionProducto);
        strb.append(" Precio de compra: ").append(precioCompra);
        strb.append(" Precio de venta: ").append(precioVenta);
        strb.append(" Cantidad Bodega: ").append(cantidadBodega);
        strb.append(" Cantidad Mínima: ").append(cantidadMinimaBodega);
        strb.append(" Cantidad Máxima: ").append(cantidadMaximaBodega);
        strb.append(" Talla: ").append(this.talla);

        return strb.toString();
    }

}