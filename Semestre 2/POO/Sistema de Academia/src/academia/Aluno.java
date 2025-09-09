package academia;

/**
 * Representa um aluno de uma academia, armazenando informações pessoais como
 * nome, matrícula, idade, peso e altura. Também mantém o vínculo com um
 * instrutor e (opcionalmente) um plano de treino ativo.
 *
 * Regras: - Um Aluno pode ter 0 ou 1 PlanoTreino ativo. - Um Aluno deve estar
 * vinculado a um Instrutor (recomendado).
 *
 * Obs.: A manutenção da relação bidirecional Aluno <-> Instrutor é tratada em
 * ambos os lados com cuidado para evitar loops.
 *
 * @author
 */
public class Aluno {

	private String nome;
	private String matricula;
	private int idade;
	private double peso;
	private double altura;

	// Relacionamentos
	private Instrutor instrutor; // associação N..1 (muitos alunos para 1 instrutor)
	private PlanoTreino planoTreino; // 0..1 (um aluno pode ter 0 ou 1 plano ativo)

	/**
	 * Constrói um aluno com todas as informações fornecidas.
	 */
	public Aluno(String nome, String matricula, int idade, double peso, double altura) {
		this.nome = nome;
		this.matricula = matricula;
		setIdade(idade);
		this.peso = peso;
		this.altura = altura;
	}

	/**
	 * Constrói um aluno apenas com nome e matrícula.
	 */
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}

	// Getters/Setters básicos
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if (idade < 0)
			throw new IllegalArgumentException("Idade não pode ser negativa.");
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// Relacionamentos
	public Instrutor getInstrutor() {
		return instrutor;
	}

	/**
	 * Define o instrutor do aluno e mantém a consistência com a lista de alunos do
	 * instrutor.
	 */
	public void setInstrutor(Instrutor novoInstrutor) {
		if (this.instrutor == novoInstrutor)
			return;

		// Remove do instrutor anterior
		if (this.instrutor != null) {
			this.instrutor.removerAluno(this);
		}
		this.instrutor = novoInstrutor;

		// Adiciona ao novo instrutor
		if (novoInstrutor != null) {
			novoInstrutor.adicionarAluno(this);
		}
	}

	public PlanoTreino getPlanoTreino() {
		return planoTreino;
	}

	/**
	 * Define o plano de treino do aluno (0..1). Regra: o PlanoTreino deve pertencer
	 * a este aluno.
	 */
	public void setPlanoTreino(PlanoTreino planoTreino) {
		if (planoTreino != null && planoTreino.getAluno() != this) {
			throw new IllegalArgumentException("O PlanoTreino informado pertence a outro aluno.");
		}
		this.planoTreino = planoTreino;
	}

	/**
	 * Retorna um resumo textual do aluno.
	 */
	public String getResumo() {
		return "Aluno: " + nome + " | Matrícula: " + matricula + " | Instrutor: "
				+ (instrutor != null ? instrutor.getNome() : "Sem instrutor") + " | Plano ativo: "
				+ (planoTreino != null ? planoTreino.getDescricao() : "Nenhum");
	}

	@Override
	public String toString() {
		return "Aluno: " + nome + " (Matrícula: " + matricula + "), idade: " + idade + ", peso: " + peso + ", altura: "
				+ altura;
	}
}
