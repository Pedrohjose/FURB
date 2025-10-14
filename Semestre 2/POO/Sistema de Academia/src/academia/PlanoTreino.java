package academia;

import java.util.ArrayList;

public class PlanoTreino {

	private String descicao;

	private String nivel;

	private boolean ativo;

	private ArrayList<Exercicio> exercicios;

	public PlanoTreino(String descicao, String nivel) {
		if (descicao.length() <= 4) {
			System.out.println("Descrição insuficiente, valor padrão definido");
			this.descicao = "Treino Desconhecido";
		} else {
			this.descicao = descicao;
		}

		if (nivel.length() <= 4) {
			System.out.println("Nivel insuficiente, valor padrão definido");
			this.descicao = "Nivel Desconhecido";
		} else {
			this.descicao = descicao;
		}
		this.ativo = true;

		exercicios = new ArrayList<>();
	}

	public PlanoTreino(String descicao) {
		if (descicao.length() <= 4) {
			System.out.println("Necessario descrição, valor padrão definido");
			this.descicao = "Treino Desconhecido";
		} else {
			this.descicao = descicao;
		}
		this.descicao = "Nivel Desconhecido";
		this.ativo = true;

		exercicios = new ArrayList<>();
	}

	public PlanoTreino() {
		exercicios = new ArrayList<>();
	}

	public void ativar() {
		this.ativo = true;
	}

	public void desativar() {
		this.ativo = false;
	}

	public String getDescicao() {
		return descicao;
	}

	public void setDescicao(String descicao) {
		if (descicao.length() <= 4) {
			System.out.println("Descrição insuficiente, valor padrão definido");
			this.descicao = "Treino Desconhecido";
		} else {
			this.descicao = descicao;
		}
	}

	public String getNivel() {
		return nivel;
	}

	public void setNivel(String nivel) {
		if (nivel.length() <= 4) {
			System.out.println("Nivel insuficiente, valor padrão definido");
			this.nivel = "Nivel Desconhecido";
		} else {
			this.nivel = nivel;
		}

	}

	public boolean isAtivo() {
		return ativo;
	}

	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}

	public ArrayList<Exercicio> getExercicios() {
		return exercicios;
	}

	public void adicionarExercicio(Exercicio exercicio) {
		exercicios.add(exercicio);
	}

	public void removerExercicio(Exercicio exercicio) {
		exercicios.remove(exercicio);
	}

	public String getResumo() {
		System.out.print("Exercícios: ");
		if (exercicios == null || exercicios.isEmpty()) {
			System.out.println("Nenhum exercício cadastrado.");
		} else {
			for (Exercicio ex : exercicios) {
				System.out.print(ex.getNome() + ", ");
			}
			System.out.println();
		}

		return "Plano de Treino: " + descicao + "\n" + "Nível: " + nivel + "\n" + "Ativo: " + (ativo ? "Sim" : "Não");
	}

}
