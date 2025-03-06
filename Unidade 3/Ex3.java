package Exercicios;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Informe o preço da gasolina:");
		double precoGasolina = sc.nextDouble();
		
		System.out.println("Informe o valor do pagamento:");
		double pagamento = sc.nextDouble();
		
		double litros = pagamento/precoGasolina;
		
		System.out.println("A quantidade de litros de gasolina é de:"+litros);
		
		
	}
}
