package academia;

import java.util.ArrayList;

public class Instrutor extends Pessoa {

	private String cref;
	private String especialidade;
	private ArrayList<Aluno> alunos;
	private Instrutor mentor;

	public Instrutor(String nome, String cpf, String cref, String especialidade) {
		super(nome, cpf);
		this.cref = cref;
		this.especialidade = especialidade;
		alunos = new ArrayList<>();
	}

	public Instrutor() {
		super(null, null);
		alunos = new ArrayList<>();
	}

	public String getCref() {
		return cref;
	}

	public void setCref(String cref) {
		this.cref = cref;
	}

	public String getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}

	public ArrayList<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(ArrayList<Aluno> alunos) {
		this.alunos = alunos;
	}

	public Instrutor getMentor() {
		return mentor;
	}

	public void setMentor(Instrutor mentor) {
		if (mentor.equals(this)) {
			System.out.println("Mentor invalido");
		} else {
			this.mentor = mentor;
		}
	}

	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
		aluno.setInstrutor(this);
	}

	public void removerAluno(Aluno aluno) {
		alunos.remove(aluno);
		aluno.setInstrutor(null);
	}

	@Override
	public String toString() {
		return getResumo();
	}

	@Override
	public String getResumo() {
		// Exibe os alunos de forma mais limpa
		System.out.print("Alunos: ");
		if (alunos.isEmpty()) {
			System.out.println("Nenhum aluno cadastrado.");
		} else {
			for (Aluno a : alunos) {
				System.out.print(a.getNome() + ", ");
			}
			System.out.println(); // pula linha no final
		}

		// Monta o resumo do instrutor
		String mentorNome = (mentor != null) ? mentor.getNome() : "Sem mentor";
		return "Instrutor: " + getNome() + "\n" + "CREF: " + cref + "\n" + "Especialidade: " + especialidade + "\n"
				+ "Mentor: " + mentorNome+"\n";
	}
	
}
