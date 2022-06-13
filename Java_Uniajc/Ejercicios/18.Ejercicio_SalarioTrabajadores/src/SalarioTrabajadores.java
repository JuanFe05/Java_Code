import java.util.Scanner;

public class SalarioTrabajadores {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Nombre: ");
        String nombre = sc.nextLine();

        System.out.print("N° Documento: ");
        int numDocumento = Integer.parseInt(sc.nextLine());

        System.out.print("Salario Básico: ");
        Double salarioBasico = Double.parseDouble(sc.nextLine());

        System.out.print("Antiguedad en la empresa (En Años): ");
        int antiguedadEmpresa = Integer.parseInt(sc.nextLine());

        System.out.print("Auxilio de Transporte (S/N): ");
        String auxTransporte = sc.nextLine();

        System.out.print("Cantidad de Horas Extra: ");
        int cantidadHorasExtra = Integer.parseInt(sc.nextLine());

        sc.close();

        /* Cacular valor de las horas extra */
        double valorHorasExtra;

        if (cantidadHorasExtra <= 12) {
            valorHorasExtra = (cantidadHorasExtra * 20000);
        } else {
            valorHorasExtra = (cantidadHorasExtra * 25000);
        }
        /* Fin cacular valor de las horas extra */

        /* Cacular antiguedad del trabajador */
        String clasificacionAntiguedad;
        double valorComision = 0;

        if (antiguedadEmpresa >= 1 && antiguedadEmpresa < 5) {
            clasificacionAntiguedad = "Muy nuevo";
            valorComision = (5.0 / 100 * salarioBasico);
        }

        else if (antiguedadEmpresa >= 5 && antiguedadEmpresa < 10) {
            clasificacionAntiguedad = "Empleado regular";
            valorComision = (10.0 / 100 * salarioBasico);
        }

        else {
            clasificacionAntiguedad = "Empleado antigüo";
            valorComision = (15.0 / 100 * salarioBasico);
        }
        /* Fin cacular antiguedad del trabajador */

        /* deducción */
        double deduccion = (8.0 / 100 * salarioBasico);
        /* fin deducción */

        /* Salario neto */
        final int AUX_TRANSPORTE = 117172;

        double salarioNeto = (salarioBasico + valorComision + valorHorasExtra + AUX_TRANSPORTE) - deduccion;

        System.out.println(valorHorasExtra + " " + valorComision + " " + clasificacionAntiguedad + " " + deduccion + " " + salarioNeto);

    }
}
