package Exercicios;

import java.util.Scanner;

public class Uni6Exe06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[50];
        int quantidade = 0;

        while (quantidade < 50) {
            System.out.print("Digite um número positivo (ou negativo para parar): ");
            int numero = sc.nextInt();
            if (numero < 0) break;

            boolean duplicado = false;
            for (int i = 0; i < quantidade; i++) {
                if (vetor[i] == numero) {
                    duplicado = true;
                    break;
                }
            }

            if (!duplicado) {
                vetor[quantidade] = numero;
                quantidade++;
            } else {
                System.out.println("Número já inserido!");
            }
        }

        System.out.println("Valores inseridos:");
        for (int i = 0; i < quantidade; i++) {
            System.out.print(vetor[i] + " ");
        }
    }
}
