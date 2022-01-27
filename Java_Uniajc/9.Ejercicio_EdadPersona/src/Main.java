import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        
        String nombrePersona = JOptionPane.showInputDialog(null, "Ingresa tu nombre");
        String edadPersona = JOptionPane.showInputDialog(null, "Ingresa tu edad");

        while (!validaEdad(edadPersona)) {
            edadPersona = JOptionPane.showInputDialog(null, "Ingresa tu edad");
        }

        Persona objPersona = new Persona(nombrePersona, Integer.parseInt(edadPersona));
        objPersona.calcularEdad();
    }

    // método estático paara validar que la edad sea un número
    private static boolean validaEdad(String edad) {
        try {
            Integer.parseInt(edad);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

}
