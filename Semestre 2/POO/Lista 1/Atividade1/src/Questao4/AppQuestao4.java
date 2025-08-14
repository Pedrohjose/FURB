package Questao4;

import java.util.Scanner;

public class AppQuestao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int nmrPessoas = 3;
        
        Pessoa[] pessoas = new Pessoa[nmrPessoas];

        for (int i = 0; i < pessoas.length; i++) {
            pessoas[i] = new Pessoa();

            System.out.println("Pessoa " + (i + 1));
            System.out.print("Informe o nome: ");
            pessoas[i].nome = sc.next();

            System.out.print("Informe o peso (kg): ");
            pessoas[i].peso = sc.nextDouble();

            System.out.print("Informe a altura (m): ");
            pessoas[i].altura = sc.nextDouble();
        }

        System.out.println("\nDados informados em ordem inversa\n");
        for (int i = pessoas.length - 1; i >= 0; i--) {
            System.out.println("Nome: " + pessoas[i].nome);
            System.out.println("Peso: " + pessoas[i].peso + " kg");
            System.out.println("Altura: " + pessoas[i].altura + " m");
            System.out.println("IMC: " + pessoas[i].calcularIMC());
            System.out.println();
        }
    }
}
