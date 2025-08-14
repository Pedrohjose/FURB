package Questao2;

public class App {
    public static void main(String[] args) {
        Produto p = new Produto("Notebook", 3000, 10);
        p.vender(2);
        p.repor(5);
        p.setPreco(-50);
        p.vender(15);
        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço: " + p.getPreco());
        System.out.println("Estoque: " + p.getEstoque());
    }
}