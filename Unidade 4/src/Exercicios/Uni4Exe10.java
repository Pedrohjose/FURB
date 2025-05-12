package Exercicios;

import java.util.Scanner;

public class Uni4Exe10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int idadeMarquinhos = sc.nextInt();
		int idadeZezinho = sc.nextInt();

		int idadeLuluzinha = sc.nextInt();
				
		
		if (idadeMarquinhos<idadeZezinho && idadeMarquinhos<idadeLuluzinha) {
			System.out.println("Marquinhos caçula");
		}
		if (idadeZezinho<idadeMarquinhos && idadeZezinho<idadeLuluzinha) {
			System.out.println("Zezinho caçula");
		}else {
			System.out.println("Luluzinha Caçula");
		}
	}
}
