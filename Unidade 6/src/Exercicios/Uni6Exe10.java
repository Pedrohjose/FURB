package Exercicios;

import java.util.Scanner;

public class Uni6Exe10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vet1 = new int[10];
        int[] vet2 = new int[10];
        int[] vet3 = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para vet1[" + i + "]: ");
            vet1[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            System.out.print("Digite o valor para vet2[" + i + "]: ");
            vet2[i] = sc.nextInt();
        }

        for (int i = 0; i < 10; i++) {
            vet3[i] = vet1[i] - vet2[9 - i];
        }

        System.out.println("Resultado (vet3):");
        for (int i = 0; i < 10; i++) {
            System.out.println("vet3[" + i + "] = " + vet3[i]);
        }
    }
}
