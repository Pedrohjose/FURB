package Exercicios;

import java.util.Scanner;

public class Uni6Exe04 {
    public static void main(String[] args) {
        int[] vetor1 = new int[10];
        int[] vetor2 = new int[10];
        int[] vetor3 = new int[10];

        lerVetores(vetor1, vetor2);
        somarVetores(vetor1, vetor2, vetor3);
        escreverVetores(vetor1, vetor2, vetor3);
    }

    private static void lerVetores(int[] v1, int[] v2) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor1[" + i + "]: ");
            v1[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            System.out.print("Vetor2[" + i + "]: ");
            v2[i] = sc.nextInt();
        }
    }

    private static void somarVetores(int[] v1, int[] v2, int[] v3) {
        for (int i = 0; i < 10; i++) {
            v3[i] = v1[i] + v2[i];
        }
    }

    private static void escreverVetores(int[] v1, int[] v2, int[] v3) {
        System.out.println("Vetor 1: ");
        for (int v : v1) System.out.print(v + " ");
        System.out.println("\nVetor 2: ");
        for (int v : v2) System.out.print(v + " ");
        System.out.println("\nVetor 3 (soma): ");
        for (int v : v3) System.out.print(v + " ");
    }
}
