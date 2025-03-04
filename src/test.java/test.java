import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class test {

    private Biblioteca biblioteca;
    private Libro libro1;
    private Libro libro2;
    private Libro libro3;

    @BeforeEach
    public void setUp() {
        // Crear instancias antes de cada prueba
        biblioteca = new Biblioteca();
        libro1 = new Libro("La casa de los espíritus", "Isabel Allende", 1982);
        libro2 = new Libro("Eva Luna", "Isabel Allende", 1987);
        libro3 = new Libro("Paula", "Isabel Allende", 1994);
    }

    // Test para agregar un libro a la biblioteca
    @Test
    public void testAgregarLibro() {
        assertTrue(biblioteca.agregarLibro(libro1), "El libro debe agregarse correctamente.");
        assertEquals(1, biblioteca.getLibros().size(), "La biblioteca debe tener un libro.");
    }

    // Test para eliminar un libro de la biblioteca
    @Test
    public void testEliminarLibro() {
        biblioteca.agregarLibro(libro1);
        assertTrue(biblioteca.eliminarLibro(libro1), "El libro debe eliminarse correctamente.");
        assertEquals(0, biblioteca.getLibros().size(), "La biblioteca debe estar vacía.");
    }

    // Test para encontrar un libro por su título
    @Test
    public void testEncuentraLibroPorTitulo() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("Eva Luna");
        assertNotNull(encontrado, "El libro debe encontrarse por su título.");
        assertEquals("Eva Luna", encontrado.getTitulo(), "El título debe ser 'Eva Luna'.");
    }

    // Test para buscar un libro que no existe por su título
    @Test
    public void testEncuentraLibroPorTituloNoExistente() {
        biblioteca.agregarLibro(libro1);
        Libro encontrado = biblioteca.encuentraLibroPorTitulo("El amor en los tiempos del cólera");
        assertNull(encontrado, "El libro no debe encontrarse si no existe.");
    }

    // Test para encontrar libros por autor
    @Test
    public void testEncuentraLibrosPorAutor() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        List<Libro> librosDeAutor = biblioteca.encuentraLibrosPorAutor("Isabel Allende");
        assertEquals(3, librosDeAutor.size(), "Debe devolver 3 libros para el autor 'Isabel Allende'.");
        assertEquals("La casa de los espíritus", librosDeAutor.get(0).getTitulo(), "El título del primer libro debe ser 'La casa de los espíritus'.");
    }

    // Test para encontrar libros por autor cuando no existen
    @Test
    public void testEncuentraLibrosPorAutorNoExistente() {
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);

        List<Libro> librosDeAutor = biblioteca.encuentraLibrosPorAutor("Mario Vargas Llosa");
        assertTrue(librosDeAutor.isEmpty(), "La lista debe estar vacía si no se encuentra el autor.");
    }


}
