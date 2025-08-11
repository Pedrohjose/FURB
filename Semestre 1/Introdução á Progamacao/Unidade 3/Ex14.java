package Exercicios;

import java.util.Scanner;

public class Ex14 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Distância: ");
		double distancia = sc.nextDouble();
		
		System.out.print("Tempo: ");
		double tempo = sc.nextDouble();
		
		double velocidadeMedia = distancia / tempo;
		
		double combustivelGasto = distancia / 12;
		
		System.out.printf("A velocidade média foi de "+velocidadeMedia+" km/h e a quantidade de combustível usado foi "+combustivelGasto+" litros.");
	}
}
