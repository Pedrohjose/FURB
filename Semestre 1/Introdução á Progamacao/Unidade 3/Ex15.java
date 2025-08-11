package Exercicios;

import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Número inteiro (até 3 dígitos): ");
		
		int numero = sc.nextInt();
		
		int centenas = numero / 100;
		
		int dezenas = (numero % 100) / 10;
		
		int unidades = numero % 10;
		
		System.out.printf(+centenas+" centena(s) "+dezenas+" dezena(s) "+unidades+" unidade(s)\n");
	}
}
