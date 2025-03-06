package Exercicios;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Cateto oposto: ");
		double cateto1 = sc.nextDouble();
		
		System.out.print("Cateto adjacente: ");
		double cateto2 = sc.nextDouble();
		
		double hipotenusa = Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
		
		System.out.printf("A hipotenusa é:"+hipotenusa);
	}
}
