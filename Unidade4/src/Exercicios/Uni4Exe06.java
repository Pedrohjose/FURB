package Exercicios;

import java.util.Scanner;

public class Uni4Exe06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		
		System.out.println("Informe uma letra:");
        char sexo = sc.next().charAt(0);
        
        sexo = Character.toUpperCase(sexo);

        
        switch (sexo) {
        case 'M':
            System.out.println("Masculino");
            break;
        case 'F':
            System.out.println("Feminino");
            break;
        case 'I':
            System.out.println("Não Informado");
            break;
        default:
            System.out.println("Entrada Incorreta");
        }

	}
}
