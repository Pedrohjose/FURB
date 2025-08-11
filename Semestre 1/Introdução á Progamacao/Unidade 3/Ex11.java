package Exercicios;

import java.util.Scanner;

public class Ex11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Temperatura em °C: ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (9.0 / 5) * celsius + 32;
		
		System.out.print("Fahrenheit = "+fahrenheit);
	}
}
