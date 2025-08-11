package Questao3;

import java.util.Scanner;

public class AppQuestao3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa[] pessoas = new Pessoa[3];

		for (int i = 0; i < pessoas.length; i++) {
			pessoas[i] = new Pessoa();

			System.out.println("Pessoa " + (i + 1));
			System.out.print("Informe seu peso (kg): ");
			pessoas[i].peso = sc.nextDouble();

			System.out.print("Informe sua altura (m): ");
			pessoas[i].altura = sc.nextDouble();

			
			System.out.println(pessoas[i].calcularIMC());
		}

	}
}
