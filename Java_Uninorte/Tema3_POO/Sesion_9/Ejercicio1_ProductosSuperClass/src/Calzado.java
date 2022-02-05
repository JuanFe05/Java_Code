public class Calzado extends Productos {
    
    // Atributos
    private int talla;

    // Constructor
    public Calzado(int codigo, double precioCompra, double precioVenta, int cantidadBodega, int cantidadMinBodega, int cantidadMaximaBodega, String descripcionProducto, int talla) {
        
        super(codigo, precioCompra, precioVenta, cantidadBodega, cantidadMinBodega, cantidadMaximaBodega, descripcionProducto);
        this.talla = talla;
    }

    // Get and set
    public int getTalla() {
        return this.talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

}
