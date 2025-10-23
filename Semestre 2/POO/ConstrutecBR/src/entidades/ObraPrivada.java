package entidades;

import enums.TipoObra;

import java.time.LocalDate;
import java.util.Objects;

public class ObraPrivada extends Obra {
	public enum Localizacao {
		URBANA, RURAL
	}

	private Localizacao localizacao;
	private double areaTotal; 
	private String endereco;

	public ObraPrivada(String numero, LocalDate dataEntrada, String descricao, Localizacao localizacao,
			double areaTotal, String endereco) {
		super(numero, dataEntrada, descricao, TipoObra.PRIVADA);
		if (areaTotal <= 0)
			throw new IllegalArgumentException("Área deve ser positiva");
		this.localizacao = Objects.requireNonNull(localizacao);
		this.areaTotal = areaTotal;
		this.endereco = endereco;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}

	public double getAreaTotal() {
		return areaTotal;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String getResumo() {
		return String.format("Empreendimento %s - %s | Local: %s | Área: %.2fm² | %s", getNumero(), getDescricao(),
				localizacao, areaTotal, endereco == null ? "" : endereco);
	}
}
