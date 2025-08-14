package Questao1;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		
		System.out.print("Peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Altura: ");
		double altura = sc.nextDouble();
		
		Pessoa p = new Pessoa(nome, peso, altura);
		double imc = p.calcularIMC();
		System.out.println("IMC de " + p.getNome() + ": " + imc);

	}
}
