package Exercicios;

import java.util.Scanner;

public class Uni4Exe02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		
		System.out.println("Escreva um valo maior que 0:");
		int valor = sc.nextInt();
		
		if (valor%2==0) {
			System.out.println("O numero é par");
		}
		else {
		System.out.println("O numero é impar");
		}
				
		
	}
}
