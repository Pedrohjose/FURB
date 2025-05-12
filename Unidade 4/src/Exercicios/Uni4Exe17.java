package Exercicios;

import java.util.Scanner;

public class Uni4Exe17 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Renda anual: ");
        double rendaAnual = sc.nextDouble();
        System.out.print("Qtde de dependentes: ");
        int dependentes = sc.nextInt();
        
        double rendaLiquida = rendaAnual * (1 - (dependentes * 0.02));
        double imposto = 0;
        int percentual = 0;
        
        if (rendaLiquida > 10000) {
            percentual = 15;
            imposto = rendaLiquida * 0.15;
        } else if (rendaLiquida > 5000) {
            percentual = 10;
            imposto = rendaLiquida * 0.10;
        } else if (rendaLiquida > 2000) {
            percentual = 5;
            imposto = rendaLiquida * 0.05;
        }
        
        System.out.printf("O imposto é de %d%%: R$ %.2f\n", percentual, imposto);
    }
}
