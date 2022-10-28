import java.util.Date;
import java.util.Scanner;

public class Banco {
	Scanner scanner = new Scanner(System.in);
	String nome;
	String endereco;
	String CNPJ;
	String FEBRABAN;
	
	void abrirConta(Cliente cliente) {
		cliente.banco = this;
		System.out.println("Digite o cpf");
		cliente.cpf = scanner.nextLine();
		System.out.println("Digite o nome");
		cliente.nome = scanner.nextLine();
		System.out.println("Digite o endereço");
		cliente.endereco = scanner.nextLine();	
		System.out.println("Digite o numero da conta");
		cliente.conta.numero = scanner.nextLine();
		cliente.conta.saldo = 0;
		System.out.println("Digite o numero da agencia");
		cliente.conta.agencia.numero = scanner.nextLine();
		System.out.println("Digite o endereço da agencia");
		cliente.conta.agencia.endereco = scanner.nextLine();
		System.out.println("Digite o nome da agencia");
		cliente.conta.agencia.nome = scanner.nextLine();
		System.out.println("Digite a cidade da agencia");
		cliente.conta.agencia.cidade = scanner.nextLine();	
		System.out.println("Digite o Estado da agencia");
		cliente.conta.agencia.estado = scanner.nextLine();
		
		
	}
	
	void encerrarConta(Cliente cliente) {
		cliente = null;
	}
	
	void realizarPagamento(Cliente cliente, Terceiro terceiro, double valor) {
		cliente.conta.saldo += valor;
		
	}
	
	void realizarTransferencia(Cliente clienteEnvio, Cliente clienteRecebimento, double valor) {
		Transferencia transferencia = new Transferencia();
		transferencia.data = new Date();
		transferencia.clienteEnvio = clienteEnvio;
		transferencia.clienteRecebimento = clienteRecebimento;
		transferencia.valor = valor;
		transferencia.clienteEnvio.conta.saldo -= transferencia.valor;
		transferencia.clienteRecebimento.conta.saldo += transferencia.valor;
		
	}
	
	void realizarSaque(Cliente cliente, double valor) {
		cliente.conta.saldo -= valor;
	}
	
	void realizarDeposito(Cliente cliente, double valor) {
		cliente.conta.saldo += valor;
	}
}
