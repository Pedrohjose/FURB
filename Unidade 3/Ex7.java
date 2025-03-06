package Exercicios;

import java.util.Scanner;

public class Ex7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int lata350ml, garrafa600ml, garrafa2L;
		
		System.out.println("Informe o numero de latas de 350:");
		lata350ml = sc.nextInt();
		
		System.out.println("Informe o numero de garrafa 600ml :");
		garrafa600ml = sc.nextInt();
		
		System.out.println("Informe o numero de garrafa 2L:");
		garrafa2L = sc.nextInt();
		
		double valorTotal = lata350ml*0.35 + garrafa600ml*0.6 + garrafa2L*2;
		
		System.out.println("O cliente comprou ao total:"+valorTotal+" Litros");
	}
}
