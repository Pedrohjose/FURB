package Exercicios;

import java.util.Scanner;

public class Uni6Exe07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números que aparecem mais de uma vez:");
        for (int i = 0; i < vetor.length; i++) {
            boolean repetidoAntes = false;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    repetidoAntes = true;
                    break;
                }
            }

            if (!repetidoAntes) {
                int contagem = 0;
                for (int j = 0; j < vetor.length; j++) {
                    if (vetor[i] == vetor[j]) contagem++;
                }

                if (contagem > 1) {
                    System.out.println(vetor[i] + " aparece " + contagem + " vezes.");
                }
            }
        }
    }
}
