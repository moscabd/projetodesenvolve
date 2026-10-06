import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Date;

public class EmprestimoTest {

    @Test
    public void testConstrutorEGetters() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        assertEquals(dataRetirada, emprestimo.getDataRetirada());
        assertEquals(dataDevolucao, emprestimo.getDataDevolucao());
        assertEquals(livro, emprestimo.getLivro());
        assertEquals(usuario, emprestimo.getUsuario());
    }

    @Test
    public void testSetters() {
        Date dataRetirada = new Date();
        Date dataDevolucao = new Date();
        Livro livro = new Livro("Java Basics", new Autor("Alan Turing", "Inglês"), "Tecnologia", true);
        Usuario usuario = new Usuario("Gabriel", 21);

        Emprestimo emprestimo = new Emprestimo(dataRetirada, dataDevolucao, livro, usuario);

        Date novaRetirada = new Date(System.currentTimeMillis() + 1000);
        Date novaDevolucao = new Date(System.currentTimeMillis() + 2000);
        Livro novoLivro = new Livro("Estruturas de Dados", new Autor("Cormen", "Americano"), "Tecnologia", true);
        Usuario novoUsuario = new Usuario("Ana", 30);

        emprestimo.setDataRetirada(novaRetirada);
        emprestimo.setDataDevolucao(novaDevolucao);
        emprestimo.setLivro(novoLivro);
        emprestimo.setUsuario(novoUsuario);

        assertEquals(novaRetirada, emprestimo.getDataRetirada());
        assertEquals(novaDevolucao, emprestimo.getDataDevolucao());
        assertEquals(novoLivro, emprestimo.getLivro());
        assertEquals(novoUsuario, emprestimo.getUsuario());
    }
}
