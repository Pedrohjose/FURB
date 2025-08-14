package Questao3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ContaBancaria c1 = new ContaBancaria();
        ContaBancaria c2 = new ContaBancaria();
        
        System.out.print("Número da 1ª conta: ");
        c1.setNumero(sc.next());
        sc.nextLine();
        
        System.out.print("Titular da 1ª conta: ");
        c1.setTitular(sc.nextLine());
        
        System.out.print("Número da 2ª conta: ");
        c2.setNumero(sc.next());
        sc.nextLine();
        
        System.out.print("Titular da 2ª conta: ");
        c2.setTitular(sc.nextLine());
        
        c1.depositar(1000);
        c1.depositar(700);
        c2.depositar(5000);
        c2.sacar(3000);
        c2.transferir(c1, 1800);
        
        System.out.println(c1.getTitular() + " - Saldo: " + c1.getSaldo());
        System.out.println(c2.getTitular() + " - Saldo: " + c2.getSaldo());
    }
}
