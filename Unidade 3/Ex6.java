package Exercicios;

import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		double valorQuilo=25.00;
		double prato = 0.75;
		
		System.out.println("Informe o peso do prato montado em quilos:");
		double pesoPratoMontado = sc.nextDouble();
		
		double valorFinal = valorQuilo * (pesoPratoMontado-prato);
		
		System.out.println("O valor do prato do cliente é R$"+valorFinal);
		
		
		
		
	}
}
