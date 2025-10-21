package main;

import entidades.*;
import entidades.ObraPrivada.Localizacao;
import relatorio.*;
import excecoes.EntidadeExistenteException;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Sistema sistema = new Sistema();
		Scanner sc = new Scanner(System.in);

		Profissional p1 = new Profissional(1, "Ana Silva", "123.456.789-00");
		Profissional p2 = new Profissional(2, "João Souza", "987.654.321-00");

		sistema.cadastrarProfissional(p1);
		sistema.cadastrarProfissional(p2);

		ObraPublica op = new ObraPublica("PUB-001", LocalDate.now().minusDays(60), "Pavimentação de via arterial",
				"Prefeitura Municipal");
		op.setDataInicio(LocalDate.now().minusDays(50));
		op.setDataFim(LocalDate.now().minusDays(10));
		op.adicionarResponsavel(p1);

		ObraPrivada ov = new ObraPrivada("PRV-001", LocalDate.now().minusDays(30), "Condomínio Residencial",
				Localizacao.URBANA, 12000.0, "Rua A, 123");
		ov.setDataInicio(LocalDate.now().minusDays(20));
		ov.adicionarResponsavel(p1);
		ov.adicionarResponsavel(p2);

		sistema.cadastrarObra(op);
		sistema.cadastrarObra(ov);

		boolean sair = false;

		while (!sair) {
			System.out.println("\n=== MENU DE TESTES ===");
			System.out.println("1 - Listar profissionais");
			System.out.println("2 - Listar obras");
			System.out.println("3 - Filtrar obras por profissional");
			System.out.println("4 - Gerar relatório completo");
			System.out.println("5 - Gerar relatório resumido");
			System.out.println("6 - Gerar relatório por tipo");
			System.out.println("7 - Gerar relatório por profissional");
			System.out.println("8 - Testar exceção de CPF duplicado");
			System.out.println("9 - Sair");
			System.out.print("Escolha uma opção: ");

			int opcao = sc.nextInt();
			sc.nextLine();

			try {
				switch (opcao) {
				case 1 -> {
					System.out.println("Profissionais cadastrados:");
					for (Profissional p : sistema.listarProfissionais()) {
						System.out.println(
								"ID: " + p.getId() + ", Nome: " + p.getNomeCompleto() + ", CPF: " + p.getCpf());
					}
				}

				case 2 -> {
					System.out.println("Obras cadastradas:");
					for (Obra o : sistema.listarObras()) {
						System.out.println(o.getResumo());
					}
				}

				case 3 -> {
					System.out.println("Escolha o ID do profissional para filtrar:");
					for (Profissional p : sistema.listarProfissionais()) {
						System.out.println(p.getId() + " - " + p.getNomeCompleto());
					}
					int id = sc.nextInt();
					sc.nextLine();

					List<Obra> filtradas = sistema.filtrarPorProfissional(id);
					System.out.println("Obras do profissional ID " + id + ":");
					for (Obra o : filtradas) {
						System.out.println(o.getResumo());
					}
				}

				case 4 -> {
					Relatorio completo = new RelatorioCompleto();
					System.out.println(completo.gerar(sistema.listarObras()));
				}

				case 5 -> {
					Relatorio resumido = new RelatorioResumido();
					System.out.println(resumido.gerar(sistema.listarObras()));
				}

				case 6 -> {
					System.out.println("Tipos disponíveis: PUBLICA, PRIVADA");
					System.out.print("Escolha um tipo: ");

					RelatorioPorTipo porTipo = new RelatorioPorTipo();
					System.out.println(porTipo.gerar(sistema.listarObras()));
				}

				case 7 -> {

					Relatorio porProf = new RelatorioPorProfissional(sistema.listarProfissionais());
					System.out.println(porProf.gerar(sistema.listarObras()));
				}

				case 8 -> {
					System.out.println("Tentando cadastrar profissional com CPF duplicado...");
					Profissional duplicado = new Profissional(99, "Ana Silva", "123.456.789-00"); // mesmo CPF
					try {
						sistema.cadastrarProfissional(duplicado);
					} catch (EntidadeExistenteException e) {
						System.out.println("Exceção capturada: " + e.getMessage());
					}
				}
				case 9 -> {
					sair = true;
					System.out.println("Saindo...");
				}

				default -> System.out.println("Opção inválida!");
				}
			} catch (Exception e) {
				System.out.println("ERRO: " + e.getMessage());
			}
		}

		sc.close();
	}
}
