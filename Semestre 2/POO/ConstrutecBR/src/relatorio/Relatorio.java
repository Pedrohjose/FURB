package relatorio;

import java.util.List;

import entidades.Obra;

public interface Relatorio {
    
	String gerar(List<Obra> p_obras);
}
