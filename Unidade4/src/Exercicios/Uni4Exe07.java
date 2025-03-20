package Exercicios;

import java.util.Scanner;

public class Uni4Exe07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Peso de Cartas: ");
		int pesoCarta = sc.nextInt();

		double valorPagar = 0;

		if (pesoCarta > 50) {
			double pesoExtra = pesoCarta - 50;
			double valorAdicional = (pesoExtra / 20) + 1;
			valorPagar = 0.45f + 0.45f * valorAdicional;

		} else {
			valorPagar = 0.45;
		}
		System.out.printf("%.4f%n",valorPagar);
	}
}
