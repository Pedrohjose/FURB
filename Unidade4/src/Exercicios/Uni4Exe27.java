package Exercicios;

import java.util.Scanner;

public class Uni4Exe27 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Hora de chegada: ");
		int horaChegada = sc.nextInt();
		
		System.out.print("Minuto de chegada: ");
		int minChegada = sc.nextInt();
		
		System.out.print("Hora de saída: ");
		int horaSaida = sc.nextInt();
		
		System.out.print("Minuto de saída: ");
		int minSaida = sc.nextInt();

		if (horaChegada < 0 || horaChegada > 23 || minChegada < 0 || minChegada > 59 || horaSaida < 0 || horaSaida > 23
				|| minSaida < 0 || minSaida > 59
				|| (horaSaida < horaChegada || (horaSaida == horaChegada && minSaida < minChegada))) {
			System.out.println("Horário inválido!");
			return;
		}

		int totalMinChegada = horaChegada * 60 + minChegada;
		int totalMinSaida = horaSaida * 60 + minSaida;
		int tempoTotalMinutos = totalMinSaida - totalMinChegada;

		int horas = tempoTotalMinutos / 60;
		int minutos = tempoTotalMinutos % 60;
		if (minutos > 29)
			horas++;
		else if (horas == 0)
			horas = 1;

		double preco = 0;
		if (horas <= 2) {
			preco = horas * 5.0;
		} else if (horas <= 4) {
			preco = 2 * 5.0 + (horas - 2) * 7.5;
		} else {
			preco = 2 * 5.0 + 2 * 7.5 + (horas - 4) * 10.0;
		}
		System.out.printf("Preço cobrado = R$%.2f\n", preco);
	}
}
