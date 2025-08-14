package Questao2;

public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        if (preco > 0) this.preco = preco;
        if (estoque >= 0) this.estoque = estoque;
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
        if (preco > 0) this.preco = preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void vender(int quantidade) {
        if (quantidade > 0 && quantidade <= estoque) estoque -= quantidade;
    }

    public void repor(int quantidade) {
        if (quantidade > 0) estoque += quantidade;
    }
}
