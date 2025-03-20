package Exercicios;

import java.util.Scanner;

public class Uni4Exe12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int comprimentoL1 = sc.nextInt();
		int comprimentoL2 = sc.nextInt();
		int comprimentoL3 = sc.nextInt();

		if (comprimentoL1 < (comprimentoL2 + comprimentoL3) && comprimentoL2 < (comprimentoL1 + comprimentoL3)
				&& comprimentoL3 < (comprimentoL1 + comprimentoL2)) {
			if (comprimentoL1 == comprimentoL2 && comprimentoL1 == comprimentoL3) {
				System.out.println("Equilatero");

			} else {
				if (comprimentoL1 == comprimentoL2 || comprimentoL3 == comprimentoL2
						|| comprimentoL1 == comprimentoL3) {
					System.out.println("Isoceles");
				} else {
					System.out.println("escaleno");
				}
			}
		} else {
			System.out.println("nao e triangulo");
		}

	}
}
