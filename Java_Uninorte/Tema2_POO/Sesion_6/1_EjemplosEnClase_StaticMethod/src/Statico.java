public class Statico {
    
    private int codigo;
    private String nombre;
    // atributos estáticos
    private static String codigoPostal;
    private static int contadorEstaticos;

    // Constructor
    public Statico(){
        contadorEstaticos++;
    }

    public Statico(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        contadorEstaticos++;
    }

    // Set and Get
    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Metodos
    public static String codigoPostal() {
        codigoPostal = "hola";
        return codigoPostal;
    }

    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", nombre='" + getNombre() + "'" +
            "}";
    }

}
