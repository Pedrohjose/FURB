package Desafio;

import java.util.Scanner;

public class Desafio {
	public static void main(String[] args) {
		int nmrAlunos = 2;
		int[] matriculas = new int[nmrAlunos];
		double[] notas = new double[nmrAlunos];
		int[] frequencias = new int[nmrAlunos];
		int totalAlunos = 0;

		Scanner sc = new Scanner(System.in);
		int opcao;

		do {
			System.out.println("===== SISTEMA DE ANÁLISE DE NOTAS =====");
			System.out.println("1. Cadastrar aluno");
			System.out.println("2. Exibir dados de todos os alunos");
			System.out.println("3. Calcular estatísticas da turma");
			System.out.println("4. Verificar situação de um aluno específico");
			System.out.println("5. Sair");
			System.out.print("Escolha uma opção: ");
			opcao = sc.nextInt();

			switch (opcao) {
			case 1:
				if (totalAlunos >= nmrAlunos) {
					System.out.println("Limite de alunos atingido!");
					break;
				}

				System.out.print("Digite o número da matrícula: ");
				int novaMatricula = sc.nextInt();

				boolean matriculaIgual = false;
				for (int i = 0; i < totalAlunos; i++) {
					if (matriculas[i] == novaMatricula) {
						matriculaIgual = true;
						break;
					}
				}

				if (matriculaIgual) {
					System.out.println("Erro: Matrícula já cadastrada.");
					break;
				}

				System.out.print("Digite a nota do aluno (0 a 10): ");
				double nota = sc.nextDouble();
				if (nota < 0 || nota > 10) {
					System.out.println("Nota inválida.");
					break;
				}

				System.out.print("Digite a frequência do aluno (0 a 20): ");
				int frequencia = sc.nextInt();
				if (frequencia < 0 || frequencia > 20) {
					System.out.println("Frequência inválida.");
					break;
				}

				matriculas[totalAlunos] = novaMatricula;
				notas[totalAlunos] = nota;
				frequencias[totalAlunos] = frequencia;
				totalAlunos++;
				System.out.println("Aluno cadastrado com sucesso!");
				break;

			case 2:
				if (totalAlunos == 0) {
					System.out.println("Nenhum aluno cadastrado.");
				} else {
					System.out.println("Lista de alunos:");
					for (int i = 0; i < totalAlunos; i++) {
						String situacao = verificarSituacao(notas[i], frequencias[i]);
						System.out.printf("Matrícula: %d | Nota: %.1f | Frequência: %d | Situação: %s\n", matriculas[i],
								notas[i], frequencias[i], situacao);
					}
				}
				break;

			case 3:

				break;

			case 4:

				break;

			case 5:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("Opção inválida. Tente novamente.");
			}

		} while (opcao != 5);

	}
	
	public static String verificarSituacao(double nota, int frequencia) {
        if (frequencia < 15) {
            return "Reprovado por frequência";
        } else if (nota >= 7.0) {
            return "Aprovado";
        } else if (nota >= 5.0) {
            return "Recuperação";
        } else {
            return "Reprovado por nota";
        }
    }


}
