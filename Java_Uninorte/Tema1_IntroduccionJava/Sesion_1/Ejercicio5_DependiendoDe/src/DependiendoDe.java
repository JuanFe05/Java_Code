import java.util.Scanner;

public class DependiendoDe {

	public static void main(String[] args) {
		
		System.out.println("Ejercicio 5 - Dependiendo de");
		
		Scanner capturaDato = new Scanner(System.in);
		
		System.out.print("Ingresa el total a pagar: ");
		int totalPagar = capturaDato.nextInt();
		
		System.out.print("Ingresa el día de la semana de 1 a 7: ");
		int diaSemana = capturaDato.nextInt();
		
		switch (diaSemana) {
		case 1:
			double pagoTotal = totalPagar - (0.05 * totalPagar);
			double descuento = (totalPagar - pagoTotal);
			System.out.println("El descuento es de: $" + descuento + " y debe pagar un total de: $" + pagoTotal);
			break;
			
		case 2:
			pagoTotal = totalPagar - (0.03 * totalPagar);
			descuento = (totalPagar - pagoTotal);
			System.out.println("El descuento es de: $" + descuento + " y debe pagar un total de: $" + pagoTotal);
			break;
			
		case 3:
			pagoTotal = totalPagar - (0.10 * totalPagar);
			descuento = (totalPagar - pagoTotal);
			System.out.println("El descuento es de: $" + descuento + " y debe pagar un total de: $" + pagoTotal);
			break;
			
		case 4:
			pagoTotal = totalPagar - (0.04 * totalPagar);
			descuento = (totalPagar - pagoTotal);
			System.out.println("El descuento es de: $" + descuento + " y debe pagar un total de: $" + pagoTotal);
			break;
			
		case 5:
			pagoTotal = totalPagar - (0.06 * totalPagar);
			descuento = (totalPagar - pagoTotal);
			System.out.println("El descuento es de: $" + descuento + " y debe pagar un total de: $" + pagoTotal);
			break;
			
		case 6:
			pagoTotal = totalPagar - (0.02 * totalPagar);
			descuento = (totalPagar - pagoTotal);
			System.out.println("El descuento es de: $" + descuento + " y debe pagar un total de: $" + pagoTotal);
			break;
			
		case 7:
			pagoTotal = totalPagar - (0.01 * totalPagar);
			descuento = (totalPagar - pagoTotal);
			System.out.println("El descuento es de: $" + descuento + " y debe pagar un total de: $" + pagoTotal);
			break;

		default:
			System.out.println("Día incorrecto");
			break;
		}
		
		capturaDato.close();

	}

}
