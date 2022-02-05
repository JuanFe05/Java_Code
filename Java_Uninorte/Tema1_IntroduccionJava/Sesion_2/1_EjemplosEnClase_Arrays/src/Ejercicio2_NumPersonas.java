import java.util.Scanner;

public class Ejercicio2_NumPersonas {

	public static void main(String[] args) {
		
		Scanner capturaDatos = new Scanner(System.in);
		
		int numeroPersonas, alturaInferior = 0, alturaSuperior = 0;
		double estaturaMedia = 0;
		
		do {
			System.out.print("Ingresa el número de personas: ");
			numeroPersonas = capturaDatos.nextInt();
		} while (numeroPersonas <= 0);
		
		// Ingresando la estatura de las personas:
		double alto[] = new double[numeroPersonas];
		
		for (int i = 0; i < numeroPersonas; i++) {
			System.out.print("La estatura de la persona " + (i + 1) + " en (cm) es: ");
			alto[i] = capturaDatos.nextDouble();
			estaturaMedia = estaturaMedia + alto[i];
		}
		
		// Calculando los más bajos y altos de la media:
		estaturaMedia = estaturaMedia / numeroPersonas;
		
		for (int i = 0; i < alto.length; i++) {
			if (alto[i] >= estaturaMedia) {
				alturaSuperior ++;
			}
			else if (alto[i] < estaturaMedia) {
				alturaInferior ++;
			}
			
		}
		
		System.out.println("Estatura media: " + estaturaMedia);
		System.out.println("Persona más altas de la estatura media: " + alturaSuperior);
		System.out.println("Persona más bajas de la estatura media: " + alturaInferior);
		
		capturaDatos.close();

	}

}
