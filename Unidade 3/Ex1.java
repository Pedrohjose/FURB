package Exercicios;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double altura, largura;
		
		System.out.println("Informe a altura:");
		altura = sc.nextDouble();
		
		System.out.println("Informe a largura:");
		largura = sc.nextDouble();
		
		double area = altura*largura;
		
		System.out.println("A area do terreno é de:"+area);
	}

}
