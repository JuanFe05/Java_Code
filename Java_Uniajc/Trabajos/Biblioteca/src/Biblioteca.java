import java.util.ArrayList;

public class Biblioteca {

    String nombreBiblioteca;
    ArrayList<Libro> coleccionLibros;

    //Constructor
    public Biblioteca() {
    }

    public Biblioteca(String nombreBiblioteca) {
        this.nombreBiblioteca = nombreBiblioteca;
        this.coleccionLibros = new ArrayList<Libro>();
    }

    //Mis métodos
    public void aregarLibros(Libro libro) {
        this.coleccionLibros.add(libro);
    }

    public void mostrarLibros(){
        /*for(int i = 0; i < coleccionLibros.size(); i++) {
            System.out.println("Título del libro: " + coleccionLibros.get(i).getTitulo());
            System.out.println("Autor: " + coleccionLibros.get(i).getAutor());
            System.out.println("Año de publicación: " + coleccionLibros.get(i).getAnioPublicacion());
            System.out.println("Referencia bibliográfica: " + coleccionLibros.get(i).getReferenciaBibliografica());
            System.out.println("Editorial: " + coleccionLibros.get(i).getEditorial());
            System.out.println();
        }*/

        for (int i = 0; i < coleccionLibros.size(); i++) {
            Libro libro = (Libro) coleccionLibros.get(i);
            libro.imprimirLibros();
        }
    }

}
