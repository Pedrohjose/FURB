package academia;
public class InstrutorPilates extends Instrutor {

	public InstrutorPilates(String nome,String cpf, String cref, String especialidade) {
		super(nome, cpf, cref, especialidade);

	}

	@Override
	public String getResumo() {
		
		return "Instrutor especializado em pilates" + super.getResumo();
	}
	
	
}
