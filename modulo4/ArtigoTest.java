import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testConstrutorEGetters() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        assertEquals("Entendendo Compiladores", artigo.getTitulo());
        assertEquals(autor, artigo.getAutor());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }

    @Test
    public void testSetters() {
        Autor autor = new Autor("Jess", "Brasileira", false);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        artigo.setTitulo("Compiladores Modernos");
        artigo.setGenero("computacao");
        artigo.setPublicado(false);
        artigo.setAutor(new Autor("Outro", "Portuguesa", false));

        assertEquals("Compiladores Modernos", artigo.getTitulo());
        assertEquals("computacao", artigo.getGenero());
        assertFalse(artigo.isPublicado());
        assertEquals("Outro", artigo.getAutor().getNome());
    }
}
