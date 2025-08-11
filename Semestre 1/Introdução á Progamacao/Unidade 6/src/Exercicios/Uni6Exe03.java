package Exercicios;

import java.util.Scanner;

public class Uni6Exe03 {
	public static void main(String[] args) {
		double[] valores = lerValores();
		ajustarValores(valores);
		escreverValores(valores);
	}

	private static double[] lerValores() {
		Scanner sc = new Scanner(System.in);
		double[] vetor = new double[12];
		for (int i = 0; i < 12; i++) {
			System.out.print("Digite o " + (i + 1) + "º valor: ");
			vetor[i] = sc.nextDouble();
		}
		return vetor;
	}

	private static void ajustarValores(double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (i % 2 == 0) {
				vetor[i] *= 1.02;
			} else {
				vetor[i] *= 1.05;
			}
		}
	}

	private static void escreverValores(double[] vetor) {
		System.out.println("Valores ajustados:");
		for (double v : vetor) {
			System.out.printf("%.2f ", v);
		}
	}
}
