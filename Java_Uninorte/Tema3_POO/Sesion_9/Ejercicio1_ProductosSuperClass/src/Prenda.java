public class Prenda extends Productos {
    
    // Atributos
    private String talla;
    private boolean planchado;

    // Constructor
    public Prenda(int codigo, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinBodega, int cantidadMaximaBodega, 
    String descripcionProducto, String talla, boolean planchado) {
        super(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinBodega, cantidadMaximaBodega, descripcionProducto);
        this.talla = talla;
        this.planchado = planchado;
    }

    // get an set
    public String getTalla() {
        return this.talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public boolean getPlanchado() {
        return this.planchado;
    }

    public void setPlanchado(boolean planchado) {
        this.planchado = planchado;
    }

}
