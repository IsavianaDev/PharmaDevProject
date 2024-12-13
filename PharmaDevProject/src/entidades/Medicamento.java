package entidades;

public class Medicamento {
    private String nome;
    private double preco;
    private String classificacao; // "V" para tarja vermelha, "P" para tarja preta

    public Medicamento(String nome, double preco, String classificacao) {
        this.nome = nome;
        this.preco = preco;
        this.classificacao = classificacao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    @Override
    public String toString() {
        return "Medicamento: " + nome + ", Preço: R$" + preco + ", Classificação: " + classificacao;
    }
}
