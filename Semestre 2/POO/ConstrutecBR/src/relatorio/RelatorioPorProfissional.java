package relatorio;

import java.util.List;
import entidades.Obra;
import entidades.Profissional;

public class RelatorioPorProfissional implements Relatorio {

    private final List<Profissional> profissionais;

    public RelatorioPorProfissional(List<Profissional> profissionais) {
        this.profissionais = profissionais;
    }

    @Override
    public String gerar(List<Obra> obras) {
        StringBuilder sb = new StringBuilder();
        sb.append("=== RELATÓRIO POR PROFISSIONAL ===\n");

        for (Profissional prof : profissionais) {
            sb.append("\n--- Profissional: ").append(prof.getNomeCompleto())
              .append(" (ID ").append(prof.getId()).append(") ---\n");

            boolean temObra = false;
            for (Obra o : obras) {
                for (Profissional p : o.getResponsaveis()) {
                    if (p.getId() == prof.getId()) {
                        sb.append(o.toString()).append("\n");
                        temObra = true;
                        break;
                    }
                }
            }

            if (!temObra) {
                sb.append("Nenhuma obra cadastrada para este profissional.\n");
            }
        }

        return sb.toString();
    }
}
