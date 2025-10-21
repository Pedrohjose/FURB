package entidades;

import enums.TipoObra;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public abstract class Obra {
	private final String numero; 
	private final LocalDate dataEntrada;
	private String descricao;
	private LocalDate dataInicio;
	private LocalDate dataFim;
	private final TipoObra tipo;
	private final List<Profissional> responsaveis = new ArrayList<>();

	public Obra(String numero, LocalDate dataEntrada, String descricao, TipoObra tipo) {
		if (numero == null || numero.isBlank())
			throw new IllegalArgumentException("Número obrigatório");
		this.numero = numero;
		this.dataEntrada = Objects.requireNonNull(dataEntrada);
		this.descricao = descricao;
		this.tipo = Objects.requireNonNull(tipo);
	}

	public String getNumero() {
		return numero;
	}

	public LocalDate getDataEntrada() {
		return dataEntrada;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public LocalDate getDataFim() {
		return dataFim;
	}

	public void setDataFim(LocalDate dataFim) {
		this.dataFim = dataFim;
	}

	public TipoObra getTipo() {
		return tipo;
	}

	public List<Profissional> getResponsaveis() {
		return Collections.unmodifiableList(responsaveis);
	}

	public void adicionarResponsavel(Profissional p) {
		if (p == null)
			throw new IllegalArgumentException("Profissional nulo");
		if (!responsaveis.contains(p))
			responsaveis.add(p);
	}

	public long calcularDuracaoDias() {
		if (dataInicio == null)
			throw new IllegalStateException("Data de início não informada");
		LocalDate fim = (dataFim != null) ? dataFim : LocalDate.now();
		return ChronoUnit.DAYS.between(dataInicio, fim);
	}

	public abstract String getResumo();

	@Override
	public String toString() {
		return String.format("[%s] %s - entrada: %s - tipo: %s", numero, descricao, dataEntrada, tipo);
	}
}
