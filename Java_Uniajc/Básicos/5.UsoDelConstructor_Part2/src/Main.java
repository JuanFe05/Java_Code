import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia
        Persona ObjPersona = new Persona();

        System.out.print("INGRESA EL NOMBRE DE LA PERSONA: ");
        String nombrePersona = sc.nextLine();

        System.out.print("INGRESA EL APELLIDO DE LA PERSONA: ");
        String apellidoPersona = sc.nextLine();

        System.out.print("INGRESA LA EDAD DE LA PERSONA: ");
        int edadPersona = sc.nextInt();

        // Paso de parámetros.
        ObjPersona = new Persona(nombrePersona, apellidoPersona, edadPersona);

        // Imprimir los datos.
        System.out.println("LA PERSONA SE LLAMA: " + ObjPersona.getNombres() + " " +
                "SUS APELLIDOS SON: " + ObjPersona.getApellidos() + " " +
                "Y SU EDAD ES: " + ObjPersona.getEdad() + " AÑOS.");

        sc.close();
    }
}
