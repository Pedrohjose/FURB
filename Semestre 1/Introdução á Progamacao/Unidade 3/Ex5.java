package Exercicios;

import java.util.Scanner;

public class Ex5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		System.out.println("Informe quantas galinhas tem:");
		int qntGalinhas = sc.nextInt();
		
		double valorFinal = qntGalinhas*(4 + 3.5*2);
		
		System.out.println("O gasto total para marcar "+qntGalinhas+" galinhas é de :"+valorFinal);
		
		
		
	}
}
