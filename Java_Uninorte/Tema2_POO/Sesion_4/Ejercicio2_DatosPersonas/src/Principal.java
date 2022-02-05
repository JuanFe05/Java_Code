import java.util.Locale;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner capturaDatosNum = new Scanner(System.in);
		Scanner capturaDatosString = new Scanner(System.in);
		capturaDatosNum.useLocale(Locale.US);
		
		System.out.print("Introduce nombre: ");
		String nombre = capturaDatosString.nextLine();
		
		System.out.print("Intriduce edad: ");
		int edad = capturaDatosNum.nextInt();
		
		// toUpperCase() = pasa a may�sculas.
		// charAt(0) = posici�n 0.
		System.out.print("Introduce g�nero (H/M): ");
		//String sexo = capturaDatosString.nextLine().toUpperCase();
		char sexo = capturaDatosString.next().toUpperCase().charAt(0); 
		
		System.out.print("Introduce peso (kg): ");
		Double peso = capturaDatosNum.nextDouble();
		
		System.out.print("Introduce altura (m): ");
		Double altura = capturaDatosNum.nextDouble();
		
		System.out.println();
		
		Persona persona_1 = new Persona();
		System.out.println("PERSONA 1");
		mensajePesoDePersona(persona_1);
		mensajeEdad(persona_1);
		System.out.println(persona_1.toString());
		
		Persona persona_2 = new Persona(nombre, edad, sexo);
		System.out.println("PERSONA 2");
		mensajePesoDePersona(persona_2);
		mensajeEdad(persona_2);
		System.out.println(persona_2.toString());
		
		Persona persona_3 = new Persona(nombre, edad, sexo, peso, altura);
		System.out.println("PERSONA 3");
		mensajePesoDePersona(persona_3);
		mensajeEdad(persona_3);
		System.out.println(persona_3.toString());
		
		capturaDatosNum.close();
		capturaDatosString.close();

	}
	
	public static void mensajePesoDePersona(Persona personas) {
		int imc = personas.calcularIMC();
		
		switch (imc) {
		case Persona.PESOBAJO: // -1
			System.out.println("PERSONA CON PESO BAJO");
			break;

		case Persona.PESOIDEAL: // 0
			System.out.println("PERSONA CON PESO IDEAL");
			break;
			
		case Persona.SOBREPESO: // 1
			System.out.println("PERSONA CON SOBREPESO");
			break;
		}
	}
	
	public static void mensajeEdad(Persona personas) {
		if (personas.esMayorDeEdad()) {
			System.out.println("MAYOR DE EDAD");
		}else {
			System.out.println("MENOR DE EDAD");
		}
	}

}
