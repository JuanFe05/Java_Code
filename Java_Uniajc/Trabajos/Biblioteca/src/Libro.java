public class Libro {

    String titulo, autor, editorial, referenciaBibliografica;
    int anioPublicacion;

    //Constructor
    public Libro() {
    }

    public Libro(String titulo, String autor, int anioPublicacion, String editorial, String referenciaBibliografica) {
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.referenciaBibliografica = referenciaBibliografica;
        this.anioPublicacion = anioPublicacion;
    }

    //Mis métodos
    public void imprimirLibros(){
        System.out.println("Título del libro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Editorial: " + editorial);
        System.out.println("Referencia bibliográfica: " + referenciaBibliografica);
        System.out.println("Año de publicación: " + anioPublicacion);
        System.out.println();
    }

}
