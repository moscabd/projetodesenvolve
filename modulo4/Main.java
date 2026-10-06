import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", "Brasileira", false);
        Livro livro = new Livro("Java for Beginners", autor, "Tecnologia", false);
        Usuario usuario = new Usuario("Lucas Rafael", 25);
        Emprestimo emprestimo = new Emprestimo(new Date(), new Date(), livro, usuario);
        Artigo artigo = new Artigo("Entendendo Compiladores", autor, "tecnologia", true);

        livro.validarDisponibilidade();
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo.getDataDevolucao());
    }
}
