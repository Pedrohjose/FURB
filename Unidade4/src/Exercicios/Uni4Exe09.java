package Exercicios;

import java.util.Scanner;

public class Uni4Exe09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escreva um valor :");
		int valor1 = sc.nextInt();
		
		System.out.println("Escreva um valor :");
		int valor2 = sc.nextInt();

		if (valor1%valor2==0) {
			System.out.println("É multiplo ");
		} else {
			System.out.println("Não É multiplo ");

		}
	}
}
