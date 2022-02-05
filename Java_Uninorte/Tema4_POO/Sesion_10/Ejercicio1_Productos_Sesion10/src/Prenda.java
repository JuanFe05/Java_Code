public class Prenda extends Productos {
    
    // Atributos
    private String talla;
    private boolean prendaPlanchada;

    // Constructor
    public Prenda() {
    }

    public Prenda(int codigo, String descripcionProducto, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinimaBodega, int cantidadMaximaBodega, String talla, boolean prendaPlanchada) {
        super(codigo, descripcionProducto, precioCompra, precioVenta, cantidadBodega, cantidadMinimaBodega, cantidadMaximaBodega);
        this.talla = talla;
        this.prendaPlanchada = prendaPlanchada;
    }

    // Get and set
    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean isPrendaPlanchada() {
        return this.prendaPlanchada;
    }

    public boolean getPrendaPlanchada() {
        return this.prendaPlanchada;
    }

    public void setPrendaPlanchada(boolean prendaPlanchada) {
        this.prendaPlanchada = prendaPlanchada;
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
        strb.append(" Planchado: ").append(this.prendaPlanchada);

        return strb.toString();
    }


}
