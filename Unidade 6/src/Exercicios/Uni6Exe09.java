package Exercicios;

import java.util.Scanner;

public class Uni6Exe09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] valores = new double[100];
        int quantidade = 0;

        while (quantidade < 100) {
            System.out.print("Digite um valor (ou valor negativo para parar): ");
            double valor = sc.nextDouble();
            if (valor < 0) break;

            valores[quantidade] = valor;
            quantidade++;
        }

        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            soma += valores[i];
        }
        double media = soma / quantidade;

        System.out.println("Valores maiores que a média (" + media + "):");
        for (int i = 0; i < quantidade; i++) {
            if (valores[i] > media) {
                System.out.println(valores[i]);
            }
        }
    }
}
