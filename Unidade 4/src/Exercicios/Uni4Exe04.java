package Exercicios;

import java.util.Scanner;

public class Uni4Exe04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
	
		System.out.print("Digite um número maior que 0: ");
        double numero = sc.nextDouble();
        
        if (numero % 1 == 0) {
            System.out.println("Casas decimais não foram digitadas.");
        } else {
            System.out.println("Casas decimais foram digitadas.");
        }

		
	}
	
}
