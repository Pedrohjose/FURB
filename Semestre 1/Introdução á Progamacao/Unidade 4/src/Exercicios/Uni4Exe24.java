package Exercicios;

import java.util.Scanner;

public class Uni4Exe24 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Numero 1:");
		int num1 = sc.nextInt();
		System.out.println("Numero 2:");
		int num2 = sc.nextInt();
		System.out.println("Numero 3:");
		int num3 = sc.nextInt();
		System.out.println("Opcao:");
		int opcao = sc.nextInt();

		int menor=0, meio=0, maior=0;
		//Numero 1
		if (num1 > num2 && num1 > num3) {
			maior = num1;
		} else if (num1 < num2 && num1 < num3) {
			menor = num1;
		} else {
			meio = num1;
		}
		//Numero 2
		if (num2 > num1 && num2 > num3) {
			maior = num2;
		} else if (num2 < num1 && num2 < num3) {
			menor = num2;
		} else {
			meio = num2;
		}
		//Numero 3
		if (num3 > num2 && num3 > num1) {
			maior = num3;
		} else if (num3 < num2 && num3 < num1) {
			menor = num3;
		} else {
			meio = num3;
		}

		switch (opcao) {
		case 1:
			System.out.println(menor+" "+meio+" "+maior);

			break;

		case 2:
			System.out.println(maior+" "+meio+" "+menor);
			break;
		case 3:
			System.out.println(meio+" "+maior+" "+menor);
			break;
		}
	}

}
