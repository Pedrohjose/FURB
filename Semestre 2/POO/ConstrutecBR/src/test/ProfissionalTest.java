package test; 

import entidades.Obra; 
import entidades.ObraPublica; 
import entidades.Profissional;
import org.junit.jupiter.api.Test;
import java.time.LocalDate; 
import static org.junit.jupiter.api.Assertions.*;

class ProfissionalTest {

	@Test
	void PROF_001_AtribuicaoValidaDados() {
		Profissional p1 = new Profissional(1, "12345678900", "João Silva");

		assertEquals("12345678900", p1.getCpf());
		assertEquals("João Silva", p1.getNomeCompleto());
	}

	@Test
	void PROF_002_AtribuicaoDadosNulosVazios() {
		Profissional p1 = new Profissional(1, "12345678900", "Nome Inicial");

		p1.setNomeCompleto("");

		assertEquals("", p1.getNomeCompleto());
	}

	@Test
	void PROF_003_AdicionarProjeto() {
		Profissional p1 = new Profissional(2, "111222333", "Arquiteto Teste");
		Obra prj = new ObraPublica("TESTE-001", LocalDate.now(), "Obra de Teste", "Teste");

		p1.adicionaProjeto(prj);

		assertEquals(1, p1.getProjetos().size());
		assertTrue(p1.getProjetos().contains(prj));
	}
}