package academia;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Aluno aluno1 = new Aluno("Pedro", "123.456.789-00", "A001", 20, 70, 1.78);
		Aluno aluno2 = new Aluno("Mariana", "987.654.321-11", "A002", 22, 60, 1.65);
		Aluno aluno3 = new Aluno("Lucas", "456.789.123-22", "A003", 25, 82, 1.80);
		Aluno aluno4 = new Aluno("Fernanda", "321.654.987-33", "A004", 19, 55, 1.62);
		Aluno aluno5 = new Aluno("João", "741.852.963-44", "A005", 28, 90, 1.85);

		Instrutor instrutor1 = new Instrutor("Gustavo", "333.333.333-33", "CREF12345", "Musculação");
		instrutor1.adicionarAluno(aluno1);
		instrutor1.adicionarAluno(aluno2);

		System.out.println("Resumo instrutor 1:");
		System.out.println(instrutor1.getResumo() + "\n");

		PlanoTreino plano1 = new PlanoTreino("Força Total", "Avançado");

		Exercicio ex1 = new Exercicio("Supino Reto", 3, 12, 40);
		Exercicio ex2 = new Exercicio("Agachamento Livre", 4, 10, 80);
		Exercicio ex3 = new Exercicio("Puxada Frontal", 3, 12, 45);
		Exercicio ex4 = new Exercicio("Leg Press", 4, 15, 120);
		Exercicio ex5 = new Exercicio("Elevação Lateral", 3, 15, 12);
		Exercicio ex6 = new Exercicio("Remada Curvada", 4, 10, 55);

		plano1.adicionarExercicio(ex1);
		plano1.adicionarExercicio(ex2);
		plano1.adicionarExercicio(ex3);
		plano1.adicionarExercicio(ex4);
		plano1.adicionarExercicio(ex5);
		plano1.adicionarExercicio(ex6);

		System.out.println("Testes de atribuição de Planos");
		aluno1.setPlanoTreino(plano1);
		aluno2.setPlanoTreino(plano1);
		System.out.println(aluno2.getPlanoTreino());
		System.out.println();

		Instrutor instrutor2 = new Instrutor("Renata", "444.444.444-44", "CREF23456", "Pilates");
		Instrutor instrutor3 = new Instrutor("Camila", "555.555.555-55", "CREF34567", "Crossfit");
		Instrutor instrutor4 = new Instrutor("Felipe", "666.666.666-66", "CREF45678", "Funcional");
		Instrutor instrutor5 = new Instrutor("Beatriz", "777.777.777-77", "CREF56789", "Yoga");

		System.out.println("Testes de mentor");
		instrutor1.setMentor(instrutor1);
		instrutor1.setMentor(instrutor2);
		instrutor2.setMentor(instrutor1);
		System.out.println();

		System.out.println(instrutor1.getResumo());
		System.out.println(instrutor2.getResumo());
		System.out.println(plano1.getResumo());

		InstrutorMusculacao im1 = new InstrutorMusculacao("André", "888.888.888-88", "CREF67890", "Musculação");
		InstrutorPilates ip1 = new InstrutorPilates("Larissa", "999.999.999-99", "CREF78901", "Pilates");

		System.out.println(instrutor1);
		System.out.println(im1);
		System.out.println(ip1);

		AlunoVip av1 = new AlunoVip("Clara", "A006", 27);

		System.out.println(aluno1);
		System.out.println(av1.getResumo());
		System.out.println(av1.getDescontoMensalidade());

		ArrayList<Pessoa> pessoas = new ArrayList<>();

		pessoas.add(aluno1);
		pessoas.add(aluno2);
		pessoas.add(aluno3);
		pessoas.add(aluno4);
		pessoas.add(aluno5);

		pessoas.add(instrutor1);
		pessoas.add(instrutor2);
		pessoas.add(instrutor3);
		pessoas.add(instrutor4);
		pessoas.add(instrutor5);

		for (Pessoa p : pessoas) {
			System.out.println(p.getResumo());
		}
	}
}
