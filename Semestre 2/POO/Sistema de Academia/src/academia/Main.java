package academia;

/**
 * Classe principal para testar o sistema da academia: - Criar alunos e
 * instrutores. - Associar aluno a instrutor. - Definir um plano de treino com
 * exercícios. - Testar a relação de mentor entre instrutores
 * @PedroHenriqueJose
 */
public class Main {
	public static void main(String[] args) {
		System.out.println("=== Sistema de Academia ===\n");

		// Instrutores
		Instrutor inst1 = new Instrutor("Carlos Silva", "CREF1234", "Musculação");
		Instrutor inst2 = new Instrutor("Mariana Costa", "CREF5678", "Crossfit");
		inst1.setMentor(inst2); // associação reflexiva

		// Alunos
		Aluno a1 = new Aluno("Ana", "231", 25, 62.0, 1.68);
		Aluno a2 = new Aluno("Andre", "322");

		// Associação: Instrutor orienta vários alunos
		inst1.adicionarAluno(a1);
		inst1.adicionarAluno(a2);

		// Plano de treino (1 plano pertence a 1 aluno)
		PlanoTreino planoAna = new PlanoTreino("Hipertrofia", a1, true);
		planoAna.adicionarExercicio(new Exercicio("Supino Reto", 3, 12, 30.0));
		planoAna.adicionarExercicio(new Exercicio("Agachamento Livre", 4, 10, 40.0));
		planoAna.adicionarExercicio(new Exercicio("Remada Curvada", 3, 10, 32.5));

		// Impressões / Resumos
		System.out.println(inst1.getResumo());
		System.out.println(inst2.getResumo());
		System.out.println(a1.getResumo());
		System.out.println(a2.getResumo());
		System.out.println(planoAna.getResumo());

		// Teste de consistência: trocar aluno de instrutor
		System.out.println("\n-- Trocando o instrutor do Andre para a Mariana --");
		a2.setInstrutor(inst2);
		System.out.println(inst1.getResumo());
		System.out.println(inst2.getResumo());
		System.out.println(a2.getResumo());

		// Exceções rápidas (opcional)
		System.out.println("\n-- Testando exceções --");
		try {
			inst1.setMentor(inst1); // não pode ser seu próprio mentor
		} catch (IllegalArgumentException e) {
			System.out.println("Erro esperado (mentor): " + e.getMessage());
		}
		try {
			new PlanoTreino("   ", a1);
		} catch (IllegalArgumentException e) {
			System.out.println("Erro esperado (descrição): " + e.getMessage());
		}
	}
}
