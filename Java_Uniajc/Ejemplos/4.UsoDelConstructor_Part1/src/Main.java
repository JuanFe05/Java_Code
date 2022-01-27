public class Main {
    public static void main(String[] args) {

        // Intancia, paso de parametros
        Persona ObjPersona1 = new Persona("PEPE", "RAMOS", 25);

        // Imprimir los datos.
        System.out.println("LA PERSONA SE LLAMA: " + ObjPersona1.getNombres() + " " +
                "SUS APELLIDOS SON: " + ObjPersona1.getApellidos() + " " +
                "Y SU EDAD ES: " + ObjPersona1.getEdad() + " AÑOS.");

    }
}
