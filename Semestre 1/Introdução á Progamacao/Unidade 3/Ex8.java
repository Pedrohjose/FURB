package Exercicios;

import java.util.Scanner;

public class Ex8 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Valor em dólares recebido pelo cliente: ");
        double valorDolares = sc.nextDouble();
        
        System.out.print("Cotação do dólar hoje: ");
        double cotacao = sc.nextDouble();
        
        double valorReais = valorDolares * cotacao;
        
        System.out.printf("O atendente deve devolver R$"+valorReais+ " para o cliente.");
    }
}
