import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String nombreEmpledo = JOptionPane.showInputDialog(null, "POR FAVOR, INGRESA EL NOMBRE");
        String numCedula = JOptionPane.showInputDialog(null, "POR FAVOR, INGRESA TU NÚMERO DE CÉDULA");
        String salarioBruto = JOptionPane.showInputDialog(null, "POR FAVOR, El SALARIO BRUTO");
        String anioVinculacion = JOptionPane.showInputDialog(null, "POR FAVOR, EL AÑO DE VINCULACIÓN EN LA EMPRESA");

        Empleado objEmpleado = new Empleado(nombreEmpledo, Integer.parseInt(numCedula), Double.parseDouble(salarioBruto), Integer.parseInt(anioVinculacion));

        JOptionPane.showMessageDialog(null,
                nombreEmpledo 
                + " con un numero de c.c " + numCedula 
                + " con un salario bruto de " + salarioBruto 
                + " y el año de vinculación en la empresa es " + anioVinculacion 
                + " tiene un salario neto de " + objEmpleado.calcularSalarioNeto());
    }
}
