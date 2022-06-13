public class Prueba {
    public static void main(String[] args) {

        //Crea la biblioteca.
        Biblioteca biblioteca1 = new Biblioteca("Biblioteca Nacional");

        //Crea el libro.
        Libro libro1 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, "Sudamericana", "858.67/M566");
        Libro libro2 = new Libro("Rayuela", "Julio Cortázar", 1963, "Sudamericana", "863.55/J667\n");
        Libro libro3 = new Libro("La tía Julia y el escribidor", "Mario Vargas Llosa", 1977, "Seix Barral", "868.23/L567");

        //Agg libro a la biblioteca.
        biblioteca1.aregarLibros(libro1);
        biblioteca1.aregarLibros(libro2);
        biblioteca1.aregarLibros(libro3);

        //Muestra la colección de libros de la biblioteca.
        biblioteca1.mostrarLibros();
    }
}
