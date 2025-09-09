package academia;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um instrutor da academia, com nome, CREF, especialidade, alunos
 * orientados e um possível mentor (associação reflexiva).
 *
 * - Um Instrutor pode orientar vários alunos. - Um Instrutor pode ter outro
 * Instrutor como mentor.
 * @PedroHenriqueJose
 */
public class Instrutor {

	private String nome;
	private String cref;
	private String especialidade;
	private List<Aluno> alunos = new ArrayList<>();
	private Instrutor mentor; // associação reflexiva

	public Instrutor(String nome, String cref, String especialidade) {
		this.nome = nome;
		this.cref = cref;
		this.especialidade = especialidade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

	public Instrutor getMentor() {
		return mentor;
	}


	public void setMentor(Instrutor mentor) {
		if (mentor == this) {
			throw new IllegalArgumentException("Um instrutor não pode ser mentor de si mesmo.");
		}
		this.mentor = mentor;
	}

	public List<Aluno> getAlunos() {
		return new ArrayList<>(alunos);
	}

	/**
	 * Associa um aluno a este instrutor, mantendo a ligação nos dois lados.
	 */
	public void adicionarAluno(Aluno aluno) {
		if (aluno == null)
			return;
		aluno.setInstrutor(this); 
	}

	/**
	 * Remove a associação com um aluno, mantendo a ligação nos dois lados.
	 */
	public void removerAluno(Aluno aluno) {
		if (aluno == null)
			return;
		if (alunos.contains(aluno)) {
			aluno.setInstrutor(null);
		}
	}
	public String getResumo() {
	    String resumo = "Instrutor: " + nome + " | CREF: " + cref + " | Especialidade: " + especialidade;
	    if (mentor != null) resumo += " | Mentor: " + mentor.getNome();

	    resumo += "\n  Alunos: ";
	    if (alunos.isEmpty()) {
	        resumo += "Nenhum";
	    } else {
	        for (int i = 0; i < alunos.size(); i++) {
	            resumo += alunos.get(i).getNome();
	            if (i < alunos.size() - 1) resumo += ", ";
	        }
	    }

	    return resumo;
	}

}