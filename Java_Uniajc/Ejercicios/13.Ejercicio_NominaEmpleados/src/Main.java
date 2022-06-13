import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Trabajadores> datosTrabajadores = new ArrayList<Trabajadores>();
        Trabajadores objTrabajador = new Trabajadores();

        String nombresTrabajador, apellidosTrabajador, edadTrabajador, turnoTrabajador, sueldoFijo, horasExtra;
        int numeroTrabajadores = 0;

        boolean salir = false;
        while (!salir) {
            System.out.println("====================SISTEMA DE NÓMINA====================\n"
                    + "1. Ingresar un nuevo trabajador.  \n"
                    + "2. Ver la información de los trabajadores. \n"
                    + "3. Ver la cantidad de trabajadores del turno de la Mañana. \n"
                    + "4. Ver La cantidad de trabajadores del turno de la Tarde. \n"
                    + "5. Ver la cantidad de trabajadores del turno de la Noche. \n"
                    + "6. Ver el trabajador de la mañana que mas salario devenga y las horas extras que trabajó. \n"
                    + "7. Ver el promedio del salario de los trabajadores del turno de la tarde. \n"
                    + "8. Ver el trabajador más joven de toda la nomina. \n"
                    + "9. Ver el trabajador con más edad en toda la nómina. \n"
                    + "10. Salir");

            
            System.out.print("Introduce una opción: ");
            String opcion = sc.nextLine();

            while (!Validaciones.validaOpcion(opcion)) {
                System.out.print("Introduce una opción: ");
                opcion = sc.nextLine();
            }

            switch(Integer.parseInt(opcion)) {
                case 1:
                    System.out.print("Nombres del trabajador: ");
                    nombresTrabajador = sc.nextLine();

                    while (!Validaciones.validaNombre(nombresTrabajador)) {
                        System.out.print("Nombres del trabajador: ");
                        nombresTrabajador = sc.nextLine();
                    }

                    System.out.print("Apellidos del trabajador: ");
                    apellidosTrabajador = sc.nextLine();

                    while (!Validaciones.validaApellido(apellidosTrabajador)) {
                        System.out.print("Apellidos del trabajador: ");
                        apellidosTrabajador = sc.nextLine();
                    }

                    System.out.print("Edad del trabajador: ");
                    edadTrabajador = sc.nextLine();

                    while (!Validaciones.validaEdad(edadTrabajador)) {
                        System.out.print("Edad del trabajador: ");
                        edadTrabajador = sc.nextLine();
                    }

                    System.out.print("Turno: MAÑANA - TARDE - NOCHE: ");
                    turnoTrabajador = sc.nextLine();

                    while (!Validaciones.validaTurno(turnoTrabajador)){
                        System.out.print("Turno: MAÑANA - TARDE - NOCHE: ");
                        turnoTrabajador = sc.nextLine();
                    }

                    System.out.print("Sueldo Fijo: ");
                    sueldoFijo = sc.nextLine();

                    while (!Validaciones.validaSueldo(sueldoFijo)) {
                        System.out.print("Sueldo Fijo: ");
                        sueldoFijo = sc.nextLine();
                    }

                    System.out.print("Número de Horas Extra: ");
                    horasExtra = sc.nextLine();

                    while (!Validaciones.validaHorasExtra(horasExtra)) {
                        System.out.println("Número de Horas Extra: ");
                        horasExtra = sc.nextLine();
                    }

                    datosTrabajadores.add(new Trabajadores(nombresTrabajador, apellidosTrabajador, Integer.parseInt(edadTrabajador), turnoTrabajador, Double.parseDouble(sueldoFijo), Integer.parseInt(horasExtra)));
                    numeroTrabajadores ++;
                    break;

                case 2:
                    objTrabajador.informacionTrabajadores(datosTrabajadores, numeroTrabajadores);
                    break;

                case 3:
                    objTrabajador.trabajadoresTurnoManiana(datosTrabajadores, numeroTrabajadores);
                    break;

                case 4:
                    objTrabajador.trabajadoresTurnoTarde(datosTrabajadores, numeroTrabajadores);
                    break;

                case 5:
                    objTrabajador.empleadosTurnoNoche(datosTrabajadores, numeroTrabajadores);
                    break;

                case 6:
                    objTrabajador.trabajadorSalarioDevengado(datosTrabajadores, numeroTrabajadores);
                    break;

                case 7:
                    objTrabajador.promedioSalarioTarde(datosTrabajadores, numeroTrabajadores);
                    break;

                case 8:
                    objTrabajador.trabajadorMasJoven(datosTrabajadores, numeroTrabajadores);
                    break;

                case 9:
                    objTrabajador.trabajadorMasViejo(datosTrabajadores, numeroTrabajadores);
                    break;

                case 10:
                    salir = true;
                    break;

                default:
                    System.out.println("Debes ingresar una opción correcta\n");
            }

        }
        sc.close();
    }
}
