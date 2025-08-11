package Exercicios;

import java.util.Scanner;

public class Ex9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Raio: ");
		double raio = sc.nextDouble();
		
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		double volume = Math.PI * Math.pow(raio, 2) * altura;
		
		System.out.printf("O volume da lata de óleo é: "+volume);
	}
}
