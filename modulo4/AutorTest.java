import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AutorTest {

    @Test
    public void testConstrutorEGetters() {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        assertEquals("Jessica Felix", autor.getNome());
        assertEquals("Brasileira", autor.getNacionalidade());
        assertFalse(autor.isUsuario());
    }

    @Test
    public void testSetters() {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        autor.setNome("Jessica F.");
        autor.setNacionalidade("Portuguesa");
        Livro[] obras = new Livro[0];
        autor.setObrasPublicadas(obras);

        assertEquals("Jessica F.", autor.getNome());
        assertEquals("Portuguesa", autor.getNacionalidade());
        assertEquals(obras, autor.getObrasPublicadas());
    }

    @Test
    public void testIsUsuario() {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        assertFalse(autor.isUsuario());

        autor.setUsuario(true);
        assertTrue(autor.isUsuario());
    }

    @Test
    public void testGetObrasPublicadasPorGenero() {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        Livro livro1 = new Livro("Java Basico", autor, "Tecnologia", true);
        Livro livro2 = new Livro("Banco de Dados", autor, "Tecnologia", true);
        Livro livro3 = new Livro("O Amor", autor, "Romance", true);

        autor.setObrasPublicadas(new Livro[] { livro1, livro2, livro3 });

        Livro[] tecnologia = autor.getObrasPublicadasPorGenero("Tecnologia");
        assertEquals(2, tecnologia.length);
        assertEquals("Java Basico", tecnologia[0].getTitulo());
        assertEquals("Banco de Dados", tecnologia[1].getTitulo());

        Livro[] romance = autor.getObrasPublicadasPorGenero("Romance");
        assertEquals(1, romance.length);
        assertEquals("O Amor", romance[0].getTitulo());
    }
}
