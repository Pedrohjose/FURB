package entidades;

// IMPORTES ADICIONADOS
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Profissional {
    private static int contador = 0;
    private int id;
    private final String cpf;
    private String nomeCompleto;
    private String telefone;
    private String email;

    private final List<Obra> obras = new ArrayList<>();

    public Profissional(int id, String cpf, String nomeCompleto) {
        if (cpf == null || cpf.isBlank()) throw new IllegalArgumentException("CPF obrigatório");
        if (nomeCompleto == null || nomeCompleto.isBlank()) throw new IllegalArgumentException("Nome obrigatório");
        this.id = ++contador;
        this.cpf = cpf;
        this.nomeCompleto = nomeCompleto;
    }

    public int getId() {
        return id;
    }

    public String getCpf() { return cpf; }
    public String getNomeCompleto() { return nomeCompleto; }
    public void setNomeCompleto(String nomeCompleto) { this.nomeCompleto = nomeCompleto; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }


    public void adicionaProjeto(Obra obra) {
        if (obra != null && !obras.contains(obra)) {
            obras.add(obra);
        }
    }

    public List<Obra> getProjetos() {
        return Collections.unmodifiableList(obras);
    }

    @Override
    public String toString() {
        return String.format("Profissional{id=%s, cpf=%s, nome=%s}", id, cpf, nomeCompleto);
    }
}