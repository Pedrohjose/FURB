package Exercicios;

import java.util.Scanner;

public class Uni4Exe15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Tempo de admissao em meses");
		int mesesAdmissao = sc.nextInt();

		if (mesesAdmissao <= 12) {
			System.out.println("O funcionário irá receber 5% de reajuste");
		} else if (mesesAdmissao >= 13 && mesesAdmissao <= 48) {
			System.out.println("O funcionário irá receber 7% de reajuste");
		} else {
			System.out.println("Reajuste não informado");
		}
	}

}
