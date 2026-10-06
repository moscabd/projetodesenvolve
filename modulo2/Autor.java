public class Autor extends Pessoa {
    private String nacionalidade;
    private Livro[] obrasPublicadas;

    public Autor(String nome, String nacionalidade) {
        super(nome);
        this.nacionalidade = nacionalidade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public Livro[] getObrasPublicadas() {
        return obrasPublicadas;
    }

    public void setObrasPublicadas(Livro[] obrasPublicadas) {
        this.obrasPublicadas = obrasPublicadas;
    }

    public Livro[] getObrasPublicadasPorGenero(String genero) {
        if (obrasPublicadas == null) {
            return new Livro[0];
        }
        int quantidade = 0;
        for (Livro livro : obrasPublicadas) {
            if (livro != null && livro.getGenero() != null && livro.getGenero().equals(genero)) {
                quantidade++;
            }
        }
        Livro[] resultado = new Livro[quantidade];
        int indice = 0;
        for (Livro livro : obrasPublicadas) {
            if (livro != null && livro.getGenero() != null && livro.getGenero().equals(genero)) {
                resultado[indice] = livro;
                indice++;
            }
        }
        return resultado;
    }
}
