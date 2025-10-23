package test;

import entidades.ObraPrivada;
import entidades.ObraPrivada.Localizacao;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class ObraPrivadaTest {

	@Test
	void PPRV_001_E_003_CriacaoValida_E_Resumo() {
		ObraPrivada p = new ObraPrivada("202", LocalDate.now(), "Desc Resumo", Localizacao.RURAL, 200.0, "Rua X");

		assertEquals("202", p.getNumero());
		assertEquals(200.0, p.getAreaTotal());
		assertEquals(Localizacao.RURAL, p.getLocalizacao());

		String resumo = p.getResumo(); //

		assertTrue(resumo.contains("202"), "Resumo deve conter o número 202");
		assertTrue(resumo.contains("RURAL"), "Resumo deve conter a localização RURAL");
		assertTrue(resumo.contains("Rua X"), "Resumo deve conter o endereço 'Rua X'");

		assertTrue(resumo.contains("200,00m²") || resumo.contains("200.00m²"),
				"Resumo deve conter a área formatada '200,00m²' ou '200.00m²'");

	}

	@Test
	void PPRV_002_CriacaoInvalidaArea() {

		assertThrows(IllegalArgumentException.class, () -> {
			new ObraPrivada("201-A", LocalDate.now(), "Desc Teste", Localizacao.URBANA, 0.0, "Endereco Teste");
		}, "Deveria lançar exceção para área 0");

		assertThrows(IllegalArgumentException.class, () -> {
			new ObraPrivada("201-B", LocalDate.now(), "Desc Teste", Localizacao.URBANA, -10.0, "Endereco Teste");
		}, "Deveria lançar exceção para área negativa");
	}
}