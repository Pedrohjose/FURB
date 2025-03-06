package Exercicios;

import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Valor total da compra: ");
		int totalCompra = sc.nextInt();
		
		System.out.print("Valor total dado pelo cliente: ");
		int totalPago = sc.nextInt();
		
		int troco = totalPago - totalCompra;
		
		int notas100 = troco / 100;
		
		troco %= 100;		
		int notas10 = troco / 10;
		
		troco %= 10;
		int notas1 = troco;
		
		int totalNotas = notas100 + notas10 + notas1;
		
		System.out.println("O número mínimo de notas de troco é: "+totalNotas);
		System.out.println("Quantidade de notas de 100 necessárias é: "+notas100);
		System.out.println("Quantidade de notas de 10 necessárias é: "+ notas10);
		System.out.println("Quantidade de notas de 1 necessárias é: "+ notas1);
	}
}
