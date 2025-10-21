package relatorio;

import entidades.Obra;
import entidades.Profissional;

import java.util.List;

public class RelatorioCompleto implements Relatorio {
    @Override
    public String gerar(List<Obra> obras) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO COMPLETO ===\n");
        for (Obra o : obras) {
            sb.append(o.toString()).append("\n");
            sb.append("  Início: ").append(o.getDataInicio()).append(" | Fim: ").append(o.getDataFim())
              .append(" | Duração(dias): ");
            try { sb.append(o.calcularDuracaoDias()); } catch (Exception e) { sb.append("N/A"); }
            sb.append("\n  Responsáveis: ");
            for (Profissional p : o.getResponsaveis()) {
                sb.append(p.getNomeCompleto()).append(" (CPF: ").append(p.getCpf()).append("), ");
            }
            sb.append("\n\n");
        }
        return sb.toString();
    }
}
