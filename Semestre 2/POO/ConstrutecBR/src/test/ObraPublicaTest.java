package test; // ou o nome do seu pacote de testes

import entidades.ObraPublica;
import entidades.Profissional;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ObraPublicaTest {

	@Test
	void PPUB_001_CriacaoValidaEDuracao() {
		ObraPublica p = new ObraPublica("101", LocalDate.of(2023, 1, 1), "Descricao Teste", "Prefeitura");

		LocalDate inicio = LocalDate.of(2023, 1, 1);
		LocalDate fim = LocalDate.of(2023, 1, 31);

		p.setDataInicio(inicio);
		p.setDataFim(fim);

		assertEquals(30L, p.calcularDuracaoDias());

		String resumo = p.getResumo();

		assertTrue(resumo.contains("30 dias"),
				"O resumo da ObraPublica (" + resumo + ") deve conter a duração '30 dias'");
	}

	@Test
	void PPUB_002_AdicionarResponsavelDuplicadoExcecao() {
		ObraPublica p = new ObraPublica("102", LocalDate.now(), "Descricao Teste 2", "Estado");
		Profissional prof1 = new Profissional(1, "111", "Profissional Um");

		p.adicionarResponsavel(prof1);

		assertThrows(IllegalArgumentException.class, () -> {
			p.adicionarResponsavel(prof1);
		}, "O código deveria ter lançado IllegalArgumentException ao adicionar duplicado.");
	}
}