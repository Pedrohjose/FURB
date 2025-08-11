package Exercicios;

import java.util.Scanner;

public class Uni4Exe26 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Opção (T/Q/R/C): ");

		char opcao = sc.next().toUpperCase().charAt(0);

		double area = 0;

		switch (opcao) {
		case 'T':
			System.out.print("Base: ");
			double baseT = sc.nextDouble();
			System.out.print("Altura: ");
			double alturaT = sc.nextDouble();
			area = (baseT * alturaT) / 2;
			break;
		case 'Q':
			System.out.print("Lado: ");
			double lado = sc.nextDouble();
			area = lado * lado;
			break;
		case 'R':
			System.out.print("Base: ");
			double baseR = sc.nextDouble();
			System.out.print("Altura: ");
			double alturaR = sc.nextDouble();
			area = baseR * alturaR;
			break;
		case 'C':
			System.out.print("Raio: ");
			double raio = sc.nextDouble();
			area = Math.PI * Math.pow(raio, 2);
			break;
		default:
			System.out.println("Opção invalida");
			return;
		}
		System.out.printf("Área calculada: %.2f\n", area);
	}
}
