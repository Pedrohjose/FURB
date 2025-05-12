package Exercicios;

import java.util.Scanner;

public class Uni6Exe02 {
    public static void main(String[] args) {
        double[] valores = lerValores();
        double media = calcularMedia(valores);
        imprimirMaioresQueMedia(valores, media);
    }

    private static double[] lerValores() {
        Scanner sc = new Scanner(System.in);
        double[] vetor = new double[12];
        for (int i = 0; i < 12; i++) {
            System.out.print("Digite o " + (i + 1) + "º valor: ");
            vetor[i] = sc.nextDouble();
        }
        return vetor;
    }

    private static double calcularMedia(double[] vetor) {
        double soma = 0;
        for (double v : vetor) {
            soma += v;
        }
        return soma / vetor.length;
    }

    private static void imprimirMaioresQueMedia(double[] vetor, double media) {
        System.out.println("Valores maiores que a média (" + media + "):");
        for (double v : vetor) {
            if (v > media) {
                System.out.print(v + " ");
            }
        }
    }
}
