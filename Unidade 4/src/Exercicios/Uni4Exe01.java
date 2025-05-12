package Exercicios;

import java.util.Scanner;

public class Uni4Exe01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Digite o número de horas trabalhadas no mês: ");
        int hrsTrabalhadas = sc.nextInt();

        System.out.println("Digite o valor pago por hora: ");
        double vlrPagoHr = sc.nextDouble();
        
		double valorTotal = hrsTrabalhadas*vlrPagoHr;
		
		if (hrsTrabalhadas>160) {
			double salarioExtra = (hrsTrabalhadas-160) * (vlrPagoHr/2);
			valorTotal = salarioExtra + valorTotal;
		}
		System.out.println("O salário total do funcionário é: R$"+valorTotal);
	}
}
