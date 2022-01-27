import javax.swing.JOptionPane;

public class Persona {
    
    // Atributos
    private String nombrePersona;
    private int edadPersona;

    // constructores
    public Persona() {
    }

    public Persona(String nombrePersona, int edadPersona) {
        this.nombrePersona = nombrePersona;
        this.edadPersona = edadPersona;
    }

    // get and set
    public String getNombrePersona() {
        return this.nombrePersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public int getEdadPersona() {
        return this.edadPersona;
    }

    public void setEdadPersona(int edadPersona) {
        this.edadPersona = edadPersona;
    }

    // Mis metodos
    public void calcularEdad(){
        if ((edadPersona >= 18) && (edadPersona <= 120)) {
            JOptionPane.showMessageDialog(null,
                    nombrePersona + " Tiene una edad de " + 
                    edadPersona + " Años, y es mayor de edad!!" );
        } 
        
        else if (edadPersona >= 70){
            JOptionPane.showMessageDialog(null,
                    nombrePersona + " Tiene una edad de " + 
                    edadPersona + " Años, es adulto mayor!!" );
        } 
        
        else if ((edadPersona < 18) && (edadPersona > 0)) {
            JOptionPane.showMessageDialog(null,
                    nombrePersona + " Tiene una edad de: " + 
                    edadPersona + " Años, y es menor de edad!!");
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Edad incorrecta");
        }
    }
}
