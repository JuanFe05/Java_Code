import java.util.InputMismatchException;
import java.util.Scanner;

public class TipoEmpleo {

    // Atributos
    private int opcionTipoEmpleo;
    private double salarioMensual, promedioSalarioInformal, promedioSalarioFormal;
    private double porcentajeEmpleoFormal, porcentajeEmpleoInformal;

    public int personasEmpleoFormal = 0, personasEmpleoInformal = 0, personasSinEmpleo = 0;
    public double sumaSalarioFormal = 0, sumaSalarioInformal = 0, cantidadPersonas = 0;

    // Constructor


    // Get and set


    // Mis métodos
    public void capturarDatos(){
        Scanner sc = new Scanner(System.in);

        boolean salir = false;

        while (!salir) {
            System.out.println("¿Cual es tu tipo de empleo? \n"
                    + "EMPLEO FORMAL -> pulsa 1 \n"
                    + "EMPLEO INFORMAL -> pulsa 2 \n"
                    + "SIN EMPLEO -> pulsa 3 \n"
                    + "MOSTRAR DATOS -> pulsa 4 \n"
                    + "SALIR -> pulsa 5 \n");

            try {
                System.out.print("Introduce una opción: ");
                opcionTipoEmpleo = sc.nextInt();

                switch(opcionTipoEmpleo) {
                    case 1:
                        personasEmpleoFormal += 1;
                        System.out.print("Ingresa tu salario mensual: ");
                        salarioMensual = Double.parseDouble(sc.next());
                        calcularPromedioSalarioMensual(salarioMensual);
                        break;

                    case 2:
                        personasEmpleoInformal += 1;
                        System.out.print("Ingresa tu salario mensual: ");
                        salarioMensual = Double.parseDouble(sc.next());
                        calcularPromedioSalarioMensual(salarioMensual);
                        break;

                    case 3:
                        personasSinEmpleo += 1;
                        break;

                    case 4:
                        calcularPorcentaje();
                        mostrarDatos();
                        break;

                    case 5:
                        salir = true;
                        break;

                    default:
                        System.out.println("Debes ingresar una opción correcta\n");
                }
            }

            catch (InputMismatchException e) {
                System.out.println("Debes introducir una opción númerica");
                sc.next();
            }
        }
        sc.close();
    }

    public void calcularPromedioSalarioMensual(double salarioMensual){
        if (opcionTipoEmpleo == 1) {
            sumaSalarioFormal += salarioMensual;
        } else if (opcionTipoEmpleo == 2) {
            sumaSalarioInformal += salarioMensual;
        }

        promedioSalarioInformal = sumaSalarioInformal / personasEmpleoInformal;
        promedioSalarioFormal = sumaSalarioFormal / personasEmpleoFormal;
    }

    public void calcularPorcentaje(){
        cantidadPersonas = personasEmpleoFormal + personasEmpleoInformal + personasSinEmpleo;

        porcentajeEmpleoFormal = (personasEmpleoFormal * 100) / cantidadPersonas;
        porcentajeEmpleoInformal = (personasEmpleoInformal * 100) / cantidadPersonas;
    }

    public void mostrarDatos(){
        if (porcentajeEmpleoFormal == 0 && porcentajeEmpleoInformal == 0 && promedioSalarioFormal == 0 && promedioSalarioInformal == 0) {
            System.out.println("AÚN NO HAY DATOS PARA MOSTRAR");
        } else {
            double promedioSalarioFormalRound = Math.floor(promedioSalarioFormal);
            double promedioSalarioInformalRound = Math.floor(promedioSalarioInformal);

            System.out.println("El porcentaje de población con empleo formal es del: " + porcentajeEmpleoFormal + "%");
            System.out.println("El porcentaje de población con empleo informal es del: " + porcentajeEmpleoInformal + "%");
            System.out.println("Promedio salario mensual personas con empleo formal: " + promedioSalarioFormalRound);
            System.out.println("Promedio salario mensual personas con empleo informal: " + promedioSalarioInformalRound);
        }
    }

}
