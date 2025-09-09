package academia;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa um plano de treino da academia.
 *
 * Regras:
 * - Um PlanoTreino pertence a 1 aluno (1..1).
 * - Um Aluno pode ter 0 ou 1 PlanoTreino ativo.
 * - Composição: o PlanoTreino é composto por Exercicios.
 *   (Se o plano "deixar de existir", seus exercícios deixam também.)
 *   @PedroHenriqueJose
 */
public class PlanoTreino {

    private String descricao;
    private boolean ativo;
    private final List<Exercicio> exercicios = new ArrayList<>();
    private final Aluno aluno; // pertence a 1 aluno

    /**
     * Constrói um plano de treino para um aluno.
     */
    public PlanoTreino(String descricao, Aluno aluno, boolean ativo) {
        setDescricao(descricao);
        if (aluno == null) throw new IllegalArgumentException("Aluno não pode ser nulo no PlanoTreino.");
        this.aluno = aluno;
        this.ativo = ativo;
        // Vincula no aluno (0..1)
        aluno.setPlanoTreino(this);
    }

    /**
     * Constrói um plano de treino inicialmente inativo para um aluno.
     */
    public PlanoTreino(String descricao, Aluno aluno) {
        this(descricao, aluno, false);
    }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição do plano não pode ser vazia.");
        }
        this.descricao = descricao;
    }

    public boolean isAtivo() { return ativo; }
    public void ativar() { this.ativo = true; }
    public void desativar() { this.ativo = false; }

    public Aluno getAluno() { return aluno; }
    public List<Exercicio> getExercicios() { return new ArrayList<>(exercicios); }

    // Composição: métodos para gerenciar exercícios
    public void adicionarExercicio(Exercicio e) {
        if (e != null) exercicios.add(e);
    }

    public void removerExercicio(Exercicio e) {
        exercicios.remove(e);
    }

    public String getResumo() {
        StringBuilder sb = new StringBuilder();
        sb.append("Plano: ").append(descricao)
          .append(" | Ativo: ").append(ativo ? "Sim" : "Não")
          .append(" | Aluno: ").append(aluno.getNome())
          .append("\nExercícios:\n");
        for (Exercicio ex : exercicios) {
            sb.append(" - ").append(ex.getResumo()).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String toString() {
        return "PlanoTreino: " + descricao + " (Ativo: " + ativo + ")";
    }
}
