import java.time.YearMonth;
import java.util.Scanner;

public class Empleado {

    // Atributos
    private String nombreEmpleado;
    private int salarioEmpleado;
    private int numeroIdentificacion;
    private int anioNacimientoEmpleado;
    private int antiguedadEmpresa;
    private String cargoEmpleado;
    private int numHorasTrabajadas;
    private int valorHora;
    static final int AUXILIO_TRANSPORTE = 250000;

    // Constructor
    public Empleado() {
    }

    // Get and Set
    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getSalarioEmpleado() {
        return salarioEmpleado;
    }

    public void setSalarioEmpleado(int salarioEmpleado) {
        this.salarioEmpleado = salarioEmpleado;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public int getAnioNacimientoEmpleado() {
        return anioNacimientoEmpleado;
    }

    public void setAnioNacimientoEmpleado(int anioNacimientoEmpleado) {
        this.anioNacimientoEmpleado = anioNacimientoEmpleado;
    }

    public int getAntiguedadEmpresa() {
        return antiguedadEmpresa;
    }

    public void setAntiguedadEmpresa(int antiguedadEmpresa) {
        this.antiguedadEmpresa = antiguedadEmpresa;
    }

    public String getCargoEmpleado() {
        return cargoEmpleado;
    }

    public void setCargoEmpleado(String cargoEmpleado) {
        this.cargoEmpleado = cargoEmpleado;
    }

    public int getNumHorasTrabajadas() {
        return numHorasTrabajadas;
    }

    public void setNumHorasTrabajadas(int numHorasTrabajadas) {
        this.numHorasTrabajadas = numHorasTrabajadas;
    }

    public int getValorHora() {
        return valorHora;
    }

    public void setValorHora(int valorHora) {
        this.valorHora = valorHora;
    }

    // Mis métodos
    public void capturarDatos(){
        Scanner capturarDatos = new Scanner(System.in);

        System.out.print("INGRESA EL NOMBRE DEL EMPLEADO: ");
        nombreEmpleado = capturarDatos.nextLine();

        System.out.print("INGRESA EL SALARIO DEL EMPLEADO: ");
        salarioEmpleado = Integer.parseInt(capturarDatos.nextLine());

        System.out.print("INGRESA EL NÚMERO DE IDENTIFICACIÓN DEL EMPLEADO: ");
        numeroIdentificacion = Integer.parseInt(capturarDatos.nextLine());

        System.out.print("INGRESA EL AÑO DE NACIMIENTO DEL EMPLEADO: ");
        anioNacimientoEmpleado = Integer.parseInt(capturarDatos.nextLine());

        System.out.print("INGRESA LA ANTIGUEDAD EN LA EMPRESA DEL EMPLEADO: ");
        antiguedadEmpresa = Integer.parseInt(capturarDatos.nextLine());

        System.out.print("INGRESA EL CARGO DEL EMPLEADO: ");
        cargoEmpleado = capturarDatos.nextLine();

        System.out.print("INGRESA LA HORAS TRABAJADAS DEL EMPLEADO: ");
        numHorasTrabajadas = Integer.parseInt(capturarDatos.nextLine());

        System.out.print("INGRESA EL VALOR DE LA HORA DEL EMPLEADO: ");
        valorHora = Integer.parseInt(capturarDatos.nextLine());

        capturarDatos.close();
    }

    public void salarioEmpleado(){
        double salarioFinalEmpleado = (numHorasTrabajadas * valorHora) + AUXILIO_TRANSPORTE;
        System.out.println("\nEL SALARIO DEL EMPLEADO MÁS EL AUXILIO DE TRANSPORTE ES: $" + salarioFinalEmpleado);
    }

    public void edadEmpleado(){
        int anioActual = YearMonth.now().getYear(); // Obtiene el año actual del sistema.
        System.out.println("LA EDAD DEL EMPLEADO ES: " + (anioActual - anioNacimientoEmpleado) + " AÑOS");
    }

    public void incrementoSalario(){
        double salarioConAumento = salarioEmpleado + (0.15 * salarioEmpleado);
        System.out.println("EL SALARIO DEL EMPLEADO SIN EL AUMENTO DEL 15% ES: $" + salarioEmpleado);
        System.out.println("EL SALARIO DEL EMPLEADO CON UN AUMENTO DEL 15% ES: $" + salarioConAumento);
    }

    public void mostrarDatos(){
        salarioEmpleado();
        edadEmpleado();
        incrementoSalario();
    }

}
