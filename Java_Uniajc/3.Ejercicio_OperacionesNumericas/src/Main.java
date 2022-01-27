
import java.util.InputMismatchException;
import java.util.Scanner;


public class Main {
    
    public static void main(String[] args) {
       
        Scanner capturaDatos = new Scanner(System.in);
       
        Operaciones operations = new Operaciones();

        boolean salir = false;
          
        while (!salir) {            
            
            System.out.println("¿Que operación deseas relizar? \n"
            + "para sumar pulsa 1 \n"
            + "para restar pulsa 2 \n"
            + "para multiplicar pulsa 3 \n"
            + "para dividir pulsa 4 \n"
            + "para salir pulsa 5 \n");
            
            try {
                
                System.out.print("Introduce una opción: ");
                int opcion = capturaDatos.nextInt();
                
                operations.CapturarDatos();

                switch(opcion) {

                    case 1:                      
                        operations.Sumar();
                        break;

                    case 2:
                        operations.Restar();
                        break;

                    case 3:
                        operations.Multiplicar();
                        break;

                    case 4:
                        operations.Dividir();
                        break;

                    case 5:
                        salir = true;
                        break;

                    default:
                        System.out.println("Debes ingresar un opción correcta");
                }
            } 
            
            catch (InputMismatchException e) {
                System.out.println("Debes introducir un número");
                capturaDatos.next();
            }
            
        }
        
        capturaDatos.close();
        
    }
    
}
