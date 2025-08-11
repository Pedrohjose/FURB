package Exercicios;

import java.util.Scanner;

public class Uni6Exe01 {
    public static void main(String[] args) {
        int[] numeros = lerNumeros();
        escreverInverso(numeros);
    }

    private static int[] lerNumeros() {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }
        return vetor;
    }

    private static void escreverInverso(int[] vetor) {
        System.out.println("Números na ordem inversa:");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
