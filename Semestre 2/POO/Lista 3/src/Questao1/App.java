package Questao1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Funcionario[] funcionarios = new Funcionario[5];

        for (int i = 0; i < funcionarios.length; i++) {
            System.out.print("Digite o nome do funcionário: ");
            String nome = sc.nextLine();

            System.out.print("Digite o salário: ");
            double salario = sc.nextDouble();
            sc.nextLine(); 

            funcionarios[i] = new Funcionario(nome, salario);
        }

        System.out.println("\n        Lista de Funcionários     ");
        for (Funcionario funcionario : funcionarios) {
        	System.out.println("Nome: " + funcionario.getNome() 
            + " | Salário: R$ " + funcionario.getSalario() 
            + " | IRPF: R$ " + funcionario.calcularIrpf());

        }

        
    }
}
