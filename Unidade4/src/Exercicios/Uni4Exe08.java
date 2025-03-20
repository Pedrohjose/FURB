package Exercicios;

import java.util.Scanner;

public class Uni4Exe08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		char letra = sc.next().charAt(0);
		letra = Character.toLowerCase(letra);
		if (letra == 'a'||letra =='e'||letra =='i'||letra =='o'||letra =='u') {
			System.out.println("E vogal");
		}else {
			System.out.println("Não é vogal");
		}
	}
}
