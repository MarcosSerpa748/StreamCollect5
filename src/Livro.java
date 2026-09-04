import java.util.Objects;

public class Livro {
    private String nome;
    private String autor;
    private double preco;
    private int anoLancamento;

    public Livro(String nome,String autor,double preco,int anoLancamento){
        this.nome = nome;
        this.autor = autor;
        this.preco = preco;
        this.anoLancamento = anoLancamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Livro livro)) return false;
        return Objects.equals(autor, livro.autor);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(autor);
    }

    @Override
    public String toString() {
        return  "Nome:"+this.nome+"\n"+
                "Autor:"+this.autor+"\n"+
                "Preço:R$"+this.preco+"\n"+
                "Ano de lançamento:"+this.anoLancamento;
    }
}
