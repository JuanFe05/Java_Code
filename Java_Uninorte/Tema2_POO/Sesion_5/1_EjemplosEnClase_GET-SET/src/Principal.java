import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		// Animal 1.
		Animal animalNumero1 = new Animal();
		animalNumero1.setIdAnimal(1234);
		animalNumero1.setNombreAnimal("León");
		animalNumero1.setFechaIngreso(2016);
		animalNumero1.setSaludAnimal(true);
		
		System.out.println(animalNumero1.retornarIngreso());
		System.out.println(animalNumero1.toString());
		
		
		// Animal 2.
		Scanner capturaDatos = new Scanner(System.in);
		
		System.out.println("Código: ");
        int codigoAnimal = capturaDatos.nextInt();
        
        capturaDatos.nextLine();
        System.out.println("Nombre: ");
        String nombreAnimal = capturaDatos.nextLine();
        
        System.out.println("Ingreso: ");
        int fechaIngreso = capturaDatos.nextInt();
        
        System.out.println("Salud Animal: ");
        boolean saludAnimal = capturaDatos.nextBoolean();
        
        Animal animalNumero2 = new Animal(codigoAnimal, nombreAnimal, fechaIngreso, saludAnimal);
        
        System.out.println(animalNumero2.toString());
		
		capturaDatos.close();
		
	}

}
