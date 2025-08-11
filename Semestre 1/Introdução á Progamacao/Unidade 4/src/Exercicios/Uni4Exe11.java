package Exercicios;

import java.util.Scanner;

public class Uni4Exe11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int filho1 = sc.nextInt();
		int filho2 = sc.nextInt();
		int filho3 = sc.nextInt();
		
		if (filho1==filho2 &&filho1==filho3) {
			System.out.println("TRIGÊMEOS");
			
			
		
		}else if (filho1==filho2 ||filho1==filho3 || filho2==filho3) {
			System.out.println("GÊMEOS");
		}


		else {
			System.out.println("Apenas Irmaos");
		}

	}
}
