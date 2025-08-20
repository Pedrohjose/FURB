package Questao2;
public class App {
    public static void main(String[] args) {
        Livro[] livro = new Livro[3];

        livro[0] = new Livro("Dom Quixote", "Miguel de Cervantes", 1605);
        livro[1] = new Livro("Harry Potter e a Pedra Filosofal", "J. K. Rowling", 1997);
        livro[2] = new Livro(); 

        System.out.println("\nLista Completa de Livros");
        for (Livro biblioteca : livro) {
            System.out.println(biblioteca.exibirInfo());
        }

        System.out.println("\nTotal de livros: " + Livro.getTotalLivros());

        System.out.println("\nExibição Resumida ");
        System.out.println(livro[1].exibirInfo(true));
    }
}
