import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class LivroTest {

    @Test
    public void testConstrutor() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        assertEquals("Java Basico", livro1.getTitulo());
        assertEquals(autor, livro1.getAutor());
        assertEquals("tecnologia", livro1.getGenero());
        assertTrue(livro1.isDisponivel());
    }

    @Test
    public void testGettersESetters() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        livro1.setTitulo("Java Intermediario");
        livro1.setGenero("programacao");
        livro1.setDisponivel(false);
        livro1.setAutor(new Autor("Outro", "Portuguesa"));

        assertEquals("Java Intermediario", livro1.getTitulo());
        assertEquals("programacao", livro1.getGenero());
        assertFalse(livro1.isDisponivel());
        assertEquals("Outro", livro1.getAutor().getNome());

        assertEquals("Java Avançado", livro2.getTitulo());
        assertEquals("tecnologia", livro2.getGenero());
        assertFalse(livro2.isDisponivel());
    }

    @Test
    public void testValidarDisponibilidade() {
        Autor autor = new Autor("Jess", "Brasileira");
        Livro livro1 = new Livro("Java Basico", autor, "tecnologia", true);
        Livro livro2 = new Livro("Java Avançado", autor, "tecnologia", false);

        ByteArrayOutputStream saida = new ByteArrayOutputStream();
        PrintStream original = System.out;
        System.setOut(new PrintStream(saida));

        livro1.validarDisponibilidade();
        assertEquals("O livro está disponível" + System.lineSeparator(), saida.toString());

        saida.reset();
        livro2.validarDisponibilidade();
        assertEquals("O livro não está disponível" + System.lineSeparator(), saida.toString());

        System.setOut(original);
    }
}
