package Questao3;

public class ContaBancaria {
	private String numero;
	private String titular;
	private double saldo;

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void depositar(double valor) {
		if (valor > 0)
			saldo += valor;
	}

	public void sacar(double valor) {
		if (valor > 0 && valor <= saldo)
			saldo -= valor;
	}

	public void transferir(ContaBancaria destino, double valor) {
		if (valor > 0 && valor <= saldo) {
			saldo -= valor;
			destino.depositar(valor);
		}
	}
}
