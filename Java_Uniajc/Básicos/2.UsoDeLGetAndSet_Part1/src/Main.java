public class Main {
    public static void main(String[] args) {
        // Instancia
        Persona ObjPersona1 = new Persona();

        // Set, para modificar el valor de un atributo.
        ObjPersona1.setNombres("PEPITO PEPE");
        ObjPersona1.setApellidos("PEREZ PEREZ");
        ObjPersona1.setEdad(25);

        // Get, para mostrar u obtener.
        String nombrePersona = ObjPersona1.getNombres();
        String apellidoPersona = ObjPersona1.getApellidos();
        int edadPersona = ObjPersona1.getEdad();

        // Imprimir los datos.
        System.out.println("LA PERSONA SE LLAMA: " + nombrePersona + " " +
                "SUS APELLIDOS SON: " + apellidoPersona + " " +
                "Y SU EDAD ES: " + edadPersona + " AÑOS.");
    }
}
