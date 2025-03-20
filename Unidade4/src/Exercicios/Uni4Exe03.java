package Exercicios;

import java.util.Scanner;

public class Uni4Exe03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	
		System.out.println("Escreva um valor :");
		int valor1 = sc.nextInt();
		
		System.out.println("Escreva um valor :");
		int valor2 = sc.nextInt();
		
		if (valor1>valor2) {
			System.out.println("O valor "+valor1+" é maior do que o valor "+valor2);
		}else {
			System.out.println("O valor "+valor2+" é maior do que o valor "+valor1);
		}
		
	}
}
