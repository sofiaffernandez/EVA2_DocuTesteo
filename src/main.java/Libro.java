
/**
 * Esta clase representa un libro con un título, autor y año de publicación.
 */

public class Libro {

    // TODO: Documentar estos atributos
    /**
     * Título del libro.
     */
    private String titulo;
    /**
     * Autor del libro.
     */
    private String autor;
    /**
     * Año de publicación del libro.
     */
    private int anioPublicacion;


    // TODO: Documentar este método
    // TODO: Testear este método

    /**
     * Crea una nueva instancia de un libro con el título, autor y año de publicación especificados.
     * @param titulo el título del libro.
     * @param autor el autor.
     * @param anioPublicacion el año de publicación.
     */
    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        this.anioPublicacion = anioPublicacion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // TODO: Documentar este método
    /**
     * Este método es un get que obtiene el autor del libro.
     * @return el autor del libro.
     */
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // TODO: Documentar este método
    /**
     * Este metodo obtiene el año de publicación del libro.
     * @return rl año de publicación del libro.
     */
    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }
}
