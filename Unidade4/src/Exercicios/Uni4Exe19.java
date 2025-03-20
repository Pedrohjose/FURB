package Exercicios;

import java.util.Scanner;

public class Uni4Exe19 {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("X: ");
        int x = sc.nextInt();
        System.out.print("Y: ");
        int y = sc.nextInt();
        
        int quadrante;
        if (x == 0 && y == 0) {
            quadrante = 0;
        } else if (x > 0 && y > 0) {
            quadrante = 1;
        } else if (x < 0 && y > 0) {
            quadrante = 2;
        } else if (x < 0 && y < 0) {
            quadrante = 3;
        } else {
            quadrante = 4;
        }
        
        System.out.println("Quadrante " + quadrante);
    }
}
