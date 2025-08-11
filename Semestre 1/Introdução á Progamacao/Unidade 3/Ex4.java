package Exercicios;

import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double nota1, nota2, nota3;
		
		System.out.println("Informe a nota 1:");
		nota1 = sc.nextDouble();
		
		System.out.println("Informe a nota 2:");
		nota2 = sc.nextDouble();
		
		System.out.println("Informe a nota 2:");
		nota3 = sc.nextDouble();
		
		double valorFinal = (nota1*5 +nota2*3 + nota3*2)/(5+3+2);
		
		
		System.out.println("A media final é de:"+valorFinal);
		
	}

}
