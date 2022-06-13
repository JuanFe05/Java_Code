import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in, "UTF-8");

        // Array e Instancia
        ArrayList<Futbolista> arrayFutbolistas = new ArrayList<Futbolista>();
        Futbolista objetoFutbolista = new Futbolista();

        boolean salir = false;
        while (!salir) {
            System.out.println("\n====================SISTEMA DE FUTBOLISTAS====================\n"
                    + "1. Ingresar un nuevo futbolista.  \n"
                    + "2. Mostrar todos los futbolistas.  \n"
                    + "3. Mostrar futbolistas por equipo.  \n"
                    + "4. Eliminar un futbolista.  \n"
                    + "5. Salir");

            System.out.print("Introduce una opción: ");
            String opcion = sc.nextLine();

            switch(Integer.parseInt(opcion)) {
                case 1:
                    objetoFutbolista.agregarFutbolista(arrayFutbolistas);
                    break;

                case 2:
                    objetoFutbolista.mostrarFutbolistas(arrayFutbolistas);
                    break;

                case 3:
                    objetoFutbolista.mostrarFutbolistasEquipo(arrayFutbolistas);
                    break;

                case 4:
                    objetoFutbolista.eliminarFutbolista(arrayFutbolistas);
                    break;

                case 5:
                    salir = true;
                    break;
            }
        }

        sc.close();

    }
}
