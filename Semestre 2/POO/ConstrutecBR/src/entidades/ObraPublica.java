package entidades;

import enums.TipoObra;

import java.time.LocalDate;
import java.util.Objects;

public class ObraPublica extends Obra {
	private String orgaoResponsavel;

	public ObraPublica(String numero, LocalDate dataEntrada, String descricao, String orgaoResponsavel) {
		super(numero, dataEntrada, descricao, TipoObra.PUBLICA);
		this.orgaoResponsavel = Objects.requireNonNull(orgaoResponsavel);
	}

	public String getOrgaoResponsavel() {
		return orgaoResponsavel;
	}

	public void setOrgaoResponsavel(String orgaoResponsavel) {
		this.orgaoResponsavel = orgaoResponsavel;
	}

	@Override
	public String getResumo() {
		String duracaoStr;
		try {
			long duracao = calcularDuracaoDias();
			duracaoStr = duracao + " dias";
		} catch (Exception e) {
			duracaoStr = "N/A";
		}

		return String.format("Obra Pública %s - %s (Órgão: %s) | Duração: %s", getNumero(), getDescricao(),
				orgaoResponsavel, duracaoStr);
	}
}