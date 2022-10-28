
public class Conta {
	String numero;
	Agencia agencia;
	double saldo = 0;
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
}
