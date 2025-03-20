package Exercicios;

import java.util.Scanner;

public class Uni4Exe18 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Dia do vencimento: ");
		int diaVencimento = sc.nextInt();

		System.out.print("Dia do pagamento: ");
		int diaPagamento = sc.nextInt();

		System.out.print("Valor da prestação: ");
		double valorPrestacao = sc.nextDouble();

		double valorFinal = valorPrestacao;

		if (diaPagamento <= diaVencimento) {
			valorFinal *= 0.9;
			System.out.println("O pagamento está em dia.");
		} else if (diaPagamento <= diaVencimento + 5) {
			System.out.println("O pagamento está atrasado, mas sem multa.");
		} else {
			int diasAtraso = diaPagamento - diaVencimento;
			double multa = valorPrestacao * 0.02 * diasAtraso;
			valorFinal += multa;
			System.out.println("O pagamento está atrasado. Multa de 2% por dia de atraso.");
		}

		System.out.printf("Valor da prestação = R$ %.2f\n", valorFinal);

	}
}
