package Exercicios;

import java.util.Scanner;

public class Uni6Exe08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[50];
        int quantidade = 0;

        while (quantidade < 50) {
            System.out.print("Digite um número positivo (ou negativo para parar): ");
            double numero = sc.nextDouble();
            if (numero < 0) break;

            vetor[quantidade] = numero;
            quantidade++;
        }

        System.out.println("Elementos na ordem reversa:");
        for (int i = quantidade - 1; i >= 0; i--) {
            System.out.println(vetor[i]);
        }
    }
}
