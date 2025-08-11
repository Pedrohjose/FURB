
package Exercicios;

import java.util.Scanner;

public class Uni4Exe14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite o dia: ");
		int dia = sc.nextInt();

		System.out.print("Digite o mês: ");
		int mes = sc.nextInt();

		System.out.print("Digite o ano: ");
		int ano = sc.nextInt();

		if (dia > 0 && dia < 32 && mes > 0 && mes < 13 && ano > 0) {
			boolean valida = false;

			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
				valida = dia <= 31;
			} else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
				valida = dia <= 30;
			} else if (mes == 2) {
				if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
					valida = dia <= 29;
				} else {
					valida = dia <= 28;
				}
			}

			if (valida) {
				System.out.println("Data válida");
			} else {
				System.out.println("Data inválida");
			}
		} else {
			System.out.println("Data inválida");
		}
	}
}
