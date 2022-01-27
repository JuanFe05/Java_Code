import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Instancia
        Persona ObjPersona = new Persona();

        // Set, para modificar el valor de un atributo, en este caso, capturamos los datos (Objeto persona).
        System.out.print("¿CUALES SON TUS NOMBRES?: ");
        ObjPersona.setNombres(sc.nextLine());

        System.out.print("¿CUALES SON TUS APELLIDOS?: ");
        ObjPersona.setApellidos(sc.nextLine());

        System.out.print("¿CUAL ES TU EDAD?: ");
        ObjPersona.setEdad(sc.nextInt());

        // Imprimir los datos junto con el metodo get. (Obtenemos esos datos, Objeto persona)
        System.out.println("LA PERSONA SE LLAMA: " + ObjPersona.getNombres() + " " +
                "SUS APELLIDOS SON: " + ObjPersona.getApellidos() + " " +
                "Y SU EDAD ES: " + ObjPersona.getEdad() + " AÑOS.");

        sc.close();
    }
}
