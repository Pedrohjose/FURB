package Questao2;

import java.util.Scanner;


public class AppQuestao2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Pessoa pedro;
		pedro = new Pessoa();
		
		System.out.println("Informe seu peso:");
		pedro.peso = sc.nextDouble();
		
		System.out.println("Informe seu altura:");
		pedro.altura = sc.nextDouble();

		
		System.out.println(pedro.calcularIMC());
	}

}
