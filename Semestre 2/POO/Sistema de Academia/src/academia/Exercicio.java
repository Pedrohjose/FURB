package academia;

/**
 * Representa um exercício dentro de um PlanoTreino. Ex.: "Supino Reto" 3x12 @
 * 30.5kg.
 */
public class Exercicio {

	private String nome;
	private int series;
	private int repeticoes;
	private double carga; // em kg

	public Exercicio(String nome, int series, int repeticoes, double carga) {
		this.nome = nome;
		this.series = series;
		this.repeticoes = repeticoes;
		this.carga = carga;
	}

	public String getNome() {
		return nome;
	}

	public int getSeries() {
		return series;
	}

	public int getRepeticoes() {
		return repeticoes;
	}

	public double getCarga() {
		return carga;
	}

	public String getResumo() {
		return nome + " - " + series + "x" + repeticoes + " " + carga + "kg";
	}

	@Override
	public String toString() {
		return getResumo();
	}
}
