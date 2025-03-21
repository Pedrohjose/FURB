package Exercicios;

import java.util.Scanner;

public class Uni4Exe22 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Infome o seu curso 1 – Ciência da Computação, 2 – Licenciatura da Computação e 3 – Sistemas de Informação");
		int curso = sc.nextInt();

		switch (curso) {
		case 1:
			System.out.println("Bacharel em Ciência da Computação");

			break;

		case 2:
			System.out.println("Licenciado em Computação");
			break;
		case 3:
			System.out.println("Bacharel em Sistemas de Informação");
			break;
		default:
			System.out.println("Numero inserido errado");
			break;
		}
	}
}