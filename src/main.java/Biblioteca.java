import java.util.ArrayList;
import java.util.List;

/**
 * La clase biblioteca representa una biblioteca que contiene una lista de libros.
 * Permite agregar, eliminar y buscar libros por título o autor.
 */
public class Biblioteca {

    // TODO: Documentar estos atributos
    /**
     * Lista que contiene los libros de la biblioteca.
     */
    private final List<Libro> libros;

    /**
     * Crea una nueva instancia de la biblioteca con una nueva lista de libros.
     */
    // TODO: Documentar este método
    public Biblioteca() {
        libros = new ArrayList<>();
    }

    // TODO: Documentar este método.
    //  Test: NO HAY QUE TESTEAR ESTE METODO

    /**
     * Crea una nueva instancia de la biblioteca con la lista de libros dada.
     * @param libros una lista de libros que pasan a biblioteca.
     */
    public Biblioteca(List<Libro> libros) {
        this.libros = libros;
    }

    // TODO: Testear este metodo.
    //  Test: Comprobar si se ha agregado
    public boolean agregarLibro(Libro libro) {
        return libros.add(libro);
    }

    // TODO: Testear este metodo.
    //  Test: comprobar si se ha eliminado
    public boolean eliminarLibro(Libro libro) {
        return libros.remove(libro);
    }

    // TODO: Documentar este método
    public List<Libro> getLibros() {
        return libros;
    }

    // TODO: Documentar este método.
    //  Test 01: buscar libro existente y comprobar que lo localiza.
    //  Test 02: buscar libro NO existente y comprobar que no lo localiza.

    /**
     * Busca un libro por titulo en la biblioteca.
     * @param titulo el título del libro a buscar.
     * @return el libro si se encuentra, null si no se encuentra.
     */
    public Libro encuentraLibroPorTitulo(String titulo) {
        for (Libro libro : libros) {
            if (libro.getTitulo().equals(titulo)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo.
    //  No testearlo
    // Este metodo está obsoleto. Hay que documentarlo como tal.
    //  Recuerda: las anotaciones @deprecated y @link a la nueva
    //  versión mejorada encuentraLibrosPorAutor(...)
    //  En esta ocasión, NO TESTEAREMOS este metodo

    /**
     * Método obsoleto. Este método ha sido reemplazado por {@link #encuentraLibrosPorAutor(String)}.
     * Busca un libro por su autor.
     * @param autor el autor del libro a buscar.
     * @return el primer libro encontrado de ese autor, o null si no se encuentra.
     * @deprecated Este método está obsoleto y debe evitarse.
     */
    @Deprecated
    public Libro encuentaLibroPorAutor(String autor) {
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                return libro;
            }
        }
        return null;
    }

    // TODO: Documentar este metodo
    // Este metodo sustituye al metodo anterior. Está disponible desde la
    //  versión 2.0. Hay que documentarlo teniéndolo en cuenta.
    // TODO: Testear este metodo.
    //  Test: Comprobar la lista de libros que devuelve para un autor existentes.
    //  Test: Comprobar la lista de libros que devuelve para un autor No existente

    /**
     * Busca todos los libros de un autor dado.
     * @param autor el autor de los libros a buscar.
     * @return lista de libros del autor. Si no se encuentran libros, devuelve una lista vacía.
     */
    public List<Libro> encuentraLibrosPorAutor(String autor) {
        List<Libro> listaLibros = null;
        for (Libro libro : libros) {
            if (libro.getAutor().equals(autor)) {
                if (listaLibros == null) {
                    listaLibros = new ArrayList<>();
                }
                listaLibros.add(libro);
            }
        }
        return listaLibros;
    }
}
