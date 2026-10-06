import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testConstrutorEGetters() {
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        assertEquals("Lucas Rafael", usuario.getNome());
        assertEquals(25, usuario.getIdade());
    }

    @Test
    public void testSetters() {
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        usuario.setNome("Lucas");
        usuario.setIdade(30);

        assertEquals("Lucas", usuario.getNome());
        assertEquals(30, usuario.getIdade());
    }

    @Test
    public void testHistoricoEmprestimos() {
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        Emprestimo[] historico = new Emprestimo[0];
        usuario.setHistoricoEmprestimos(historico);

        assertNotNull(usuario.getHistoricoEmprestimos());
        assertEquals(0, usuario.getHistoricoEmprestimos().length);
    }
}
