package excecoes;

public class EntidadeExistenteException extends RuntimeException {
   
	private static final long serialVersionUID = 1L;

	public EntidadeExistenteException(String msg) { super(msg); }
}
