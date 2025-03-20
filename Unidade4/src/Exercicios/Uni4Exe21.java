package Exercicios;

import java.util.Scanner;

public class Uni4Exe21 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Altura (m): ");
        double altura = sc.nextDouble();
        System.out.print("Massa (kg): ");
        double massa = sc.nextDouble();
        
        double imc = massa / (altura * altura);
        String classificacao;
        
        if (imc < 18.5) {
            classificacao = "Magreza";
        } else if (imc < 24.9) {
            classificacao = "Saudável";
        } else if (imc < 29.9) {
            classificacao = "Sobrepeso";
        } else if (imc < 34.9) {
            classificacao = "Obesidade Grau I";
        } else if (imc < 39.9) {
            classificacao = "Obesidade Grau II (severa)";
        } else {
            classificacao = "Obesidade Grau III (mórbida)";
        }
        
        System.out.println(classificacao);
    }
}
