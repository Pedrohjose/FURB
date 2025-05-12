package Exercicios;

import java.util.Scanner;

public class Uni4Exe16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe a idade do 1º homem");
		int idadeHomem1 = sc.nextInt();
		System.out.println("Informe a idade do 2º homem");
		int idadeHomem2 = sc.nextInt();
		System.out.println("Informe a idade do 1º mulher");
		int idadeMulher1 = sc.nextInt();
		System.out.println("Informe a idade do 1º mulher");
		int idadeMulher2 = sc.nextInt();

		int idadeMaiorHomem, idadeMenorMulher, idadeMaiorMulher, idadeMenorHomem;

		if (idadeHomem1 > idadeHomem2) {
			idadeMaiorHomem = idadeHomem1;
			idadeMenorHomem = idadeHomem2;
		} else {
			idadeMaiorHomem = idadeHomem2;
			idadeMenorHomem = idadeHomem1;
		}
		if (idadeMulher1 > idadeMulher2) {
			idadeMenorMulher = idadeMulher2;
			idadeMaiorMulher = idadeMulher1;
		} else {
			idadeMenorMulher = idadeMulher1;
			idadeMaiorMulher = idadeHomem2;
		}
		int soma = idadeMaiorHomem+idadeMenorMulher;
		int produto = idadeMenorHomem*idadeMaiorMulher;
		
		System.out.println(soma);
		System.out.println(produto);

	}
}
