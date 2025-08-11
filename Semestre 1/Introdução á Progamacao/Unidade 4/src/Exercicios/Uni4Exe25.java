package Exercicios;

import java.util.Scanner;

public class Uni4Exe25 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Valor 1: ");
		double valor1 = sc.nextDouble();
		
		System.out.print("Valor 2: ");
		double valor2 = sc.nextDouble();

		System.out.println("Escolha uma opção:");
		System.out.println("1 - Soma de dois números.");
		System.out.println("2 - Diferença entre dois números.");
		System.out.println("3 - Produto entre dois números.");
		System.out.println("4 - Divisão entre dois números (o denominador não pode ser zero).");
		System.out.print("Opção: ");
		
		int opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			System.out.println(valor1 + valor2);
			break;
		case 2:
			System.out.println(valor1 - valor2);
			break;
		case 3:
			System.out.println(valor1 * valor2);
			break;
		case 4:
			if (valor2 != 0) {
				System.out.println(valor1 / valor2);
			} else {
				System.out.println("Erro: Divisão por zero não permitida.");
			}
			break;
		default:
			System.out.println("Erro: Opção inválida.");
		}
	}
}
