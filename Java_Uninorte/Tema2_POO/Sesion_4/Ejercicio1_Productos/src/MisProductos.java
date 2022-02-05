public class MisProductos {
    
    // Atributos
    int codigo;
    int precioCompra;
    int cantidadBodega;
    int cantidadMinimaBodega;

    // Constructor
    public MisProductos(int codigo, int precioCompra, int cantidadBodega, int cantidadMinimaBodega) {
        this.codigo = codigo;
        this.precioCompra = precioCompra;
        this.cantidadBodega = cantidadBodega;
        this.cantidadMinimaBodega = cantidadMinimaBodega;
    }

    // Métodos
    public boolean solicitarPedido() {
        if (this.cantidadBodega < this.cantidadMinimaBodega) {
            return true;
        } else {
            return false;
        }
    }

}
