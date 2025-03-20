package Exercicios;

import java.util.Scanner;

public class Uni4Exe20 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.print("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.print("Nota 3: ");
        double nota3 = sc.nextDouble();
        System.out.print("Nota dos Exercícios: ");
        double notaExercicios = sc.nextDouble();
        
        double media = (nota1 + nota2 * 2 + nota3 * 3 + notaExercicios) / 7;
        char conceito;
        String status;
        
        if (media >= 9.0) {
            conceito = 'A';
            status = "Aprovado";
        } else if (media >= 7.5) {
            conceito = 'B';
            status = "Aprovado";
        } else if (media >= 6.0) {
            conceito = 'C';
            status = "Aprovado";
        } else if (media >= 4.0) {
            conceito = 'D';
            status = "Reprovado";
        } else {
            conceito = 'E';
            status = "Reprovado";
        }
        
        System.out.printf("A média de aproveitamento foi: %.2f. Conceito: %c. %s\n", media, conceito, status);
    }
}
