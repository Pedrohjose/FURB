package relatorio;

import java.util.List;

import entidades.Obra;

public class RelatorioResumido implements Relatorio {
    @Override
    public String gerar(List<Obra> obras) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO RESUMIDO ===\n");
        for (Obra o : obras) {
            sb.append(o.getNumero()).append(" - ").append(o.getDescricao())
              .append(" | Duração(dias): ");
            try { sb.append(o.calcularDuracaoDias()); } catch (Exception e) { sb.append("N/A"); }
            sb.append("\n");
        }
        return sb.toString();
    }
}
