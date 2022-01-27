import javax.swing.JOptionPane;

public class Empleado {
    
    // Atributos
    private String nombreEmpleado;
    private int numCedula;
    private double salarioBruto;
    private int anioVinculacion;

    // constructores
    public Empleado() {
    }

    public Empleado(String nombreEmpleado, int numCedula, double salarioBruto, int anioVinculacion) {
        this.nombreEmpleado = nombreEmpleado;
        this.numCedula = numCedula;
        this.salarioBruto = salarioBruto;
        this.anioVinculacion = anioVinculacion;
    }

    // Get and set
    public String getNombreEmpleado() {
        return this.nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public int getNumCedula() {
        return this.numCedula;
    }

    public void setNumCedula(int numCedula) {
        this.numCedula = numCedula;
    }

    public double getSalarioBruto() {
        return this.salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public int getAnioVinculacion() {
        return this.anioVinculacion;
    }

    public void setAnioVinculacion(int anioVinculacion) {
        this.anioVinculacion = anioVinculacion;
    }

    // Mi metodo
    public double calcularSalarioNeto(){
        double salarioNeto;

        if ((salarioBruto > 1200000) && (anioVinculacion > 1990)) {
            salarioNeto = salarioBruto - (0.10 * salarioBruto);

        } else if ((salarioBruto < 550000) || (anioVinculacion == 1990)) {
            salarioNeto = salarioBruto - (0.02 * salarioBruto);

        } else {
            salarioNeto = salarioBruto;
        }

        return salarioNeto;
    }

}

