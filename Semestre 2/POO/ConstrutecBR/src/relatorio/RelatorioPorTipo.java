package relatorio;

import java.util.List;
import java.util.Map;
import java.util.EnumMap;
import entidades.Obra;
import enums.TipoObra;

public class RelatorioPorTipo implements Relatorio {

    @Override
    public String gerar(List<Obra> obras) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO DE OBRAS POR TIPO ===\n");

        Map<TipoObra, List<Obra>> agrupadas = new EnumMap<>(TipoObra.class);
        for (TipoObra tipo : TipoObra.values()) {
            agrupadas.put(tipo, obras.stream()
                    .filter(o -> o.getTipo() == tipo)
                    .toList());
        }

        for (TipoObra tipo : TipoObra.values()) {
            sb.append("\n--- Tipo: ").append(tipo).append(" ---\n");
            List<Obra> lista = agrupadas.get(tipo);
            if (lista.isEmpty()) {
                sb.append("Nenhuma obra cadastrada.\n");
            } else {
                for (Obra o : lista) {
                    sb.append(o.getResumo()).append("\n");
                }
            }
        }

        return sb.toString();
    }
}
