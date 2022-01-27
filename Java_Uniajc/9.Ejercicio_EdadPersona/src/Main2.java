import javax.swing.JOptionPane;

public class Main2 {
    public static void main(String[] args) {
        
        String nombre = JOptionPane.showInputDialog(null, "POR FAVOR, INGRESA EL NOMBRE");
        String edad = JOptionPane.showInputDialog(null, "POR FAVOR, INGRESA TU EDAD");

        Persona objPersona = new Persona(nombre, Integer.parseInt(edad));
        objPersona.calcularEdad();

        Persona objPersona2 = new Persona();
        objPersona2.setNombrePersona(nombre);
        objPersona2.setEdadPersona(Integer.parseInt(edad));
        objPersona2.calcularEdad();
    }
}
