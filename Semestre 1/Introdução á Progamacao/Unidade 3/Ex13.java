package Exercicios;

import java.util.Scanner;

public class Ex13 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Altura: ");
        double altura = sc.nextDouble();
        
        System.out.print("Comprimento: ");
        double comprimento = sc.nextDouble();
        
        double metrosQuadrados = altura * comprimento;
        
        double quantidadeAzulejos = metrosQuadrados * 9;
        
        double custoTotal = quantidadeAzulejos * 12.50;
        
        System.out.printf("O valor final é R$"+custoTotal);
    }
}
