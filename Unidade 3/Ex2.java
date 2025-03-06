package Exercicios;

import java.util.Scanner;

public class Ex2 {
	
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	double produto;
	double desconto;
	double produtoFinal;
	
	
	System.out.println("Indorme o preco do produto:");
	produto = sc.nextDouble();
	
	 desconto = produto * 0.12;
	 
	 
	produtoFinal = produto - desconto;
	
	System.out.println("O valor do desconto é de R$"+desconto+" e o preço do par de sapatos com desconto é R$"+produtoFinal);

	
	}
}
