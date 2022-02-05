import java.util.Random;

public class Persona {
	
	// Constante.
	final static char SEXOPORDEFECTO = 'H';
	public static final int PESOBAJO = -1;
	public static final int PESOIDEAL = 0;
	public static final int SOBREPESO = 1;
	
	// Atributos
	String nombre;
	int edad;
	int dni;
	char sexo;
	double peso;
	double altura;
	
	// Constructores
	// Constructor por defecto.
	public Persona(){
		this("", 0, SEXOPORDEFECTO, 0, 0);
	}
	
	public Persona(String nombre, int edad, char sexo) {
		this(nombre, edad, sexo, 0, 0);
	}
	
	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		dniAleatorio();
		this.sexo = sexo;
		verificaSexo();
		this.peso = peso;
		this.altura = altura;
	}
	
	// Metodos
	// Metodo Verfica sexo - es un metodo privado
	private void verificaSexo() {
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXOPORDEFECTO;
        }
    }
	
	// Metodo DNI - es un metodo privado
	private void dniAleatorio() {
		Random numAleatorio = new Random();
		
		this.dni = numAleatorio.nextInt(100000000 - 10000000) + 10000000;
	}
	
	// Metodo IMC
	public int calcularIMC() {
		double imcPersona = this.peso / (Math.pow(this.altura, 2));
		
		if (imcPersona < 20) {
			return PESOBAJO;
		} else if (imcPersona >= 20 && imcPersona <= 25) {
			return PESOIDEAL;
		} else {
			return SOBREPESO;
		}
	}
	
	// Metodo mayor de edad
	public boolean esMayorDeEdad() {
		boolean mayorEdad = false;
		if (edad >= 18) {
			mayorEdad = true; 
		}
		return mayorEdad;
	}
	
	// Mostrando
	public String toString() {
		return "Informacion persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexo + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " m\n";
	}
		
}
