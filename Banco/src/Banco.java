import java.text.SimpleDateFormat;
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
		System.out.println("Conta encerrada com sucesso");
	}
	
	void realizarPagamento(Cliente cliente, Terceiro terceiro, double valor) {
		cliente.conta.saldo += valor;
		System.out.println("Pagamento");
		System.out.println("Valor: R$" + valor);
		System.out.println("De: " + terceiro.nome);
		System.out.println("CPF: " + terceiro.CPF);
		System.out.println("Banco: " + terceiro.banco.nome);
		System.out.println();
		System.out.println("Para: " + cliente.nome);
		System.out.println("CPF: " + cliente.cpf);
		System.out.println("Banco: " + nome);
		System.out.println();
	}
	
	void realizarTransferencia(Cliente clienteEnvio, Cliente clienteRecebimento, double valor) {
		Transferencia transferencia = new Transferencia();
		transferencia.data = new Date();
		transferencia.clienteEnvio = clienteEnvio;
		transferencia.clienteRecebimento = clienteRecebimento;
		transferencia.valor = valor;
		transferencia.clienteEnvio.conta.saldo -= transferencia.valor;
		transferencia.clienteRecebimento.conta.saldo += transferencia.valor;
		System.out.println("Transferência");
		SimpleDateFormat dataT = new SimpleDateFormat("dd/MM/AAAA");
		System.out.println("Data: " + dataT.format(transferencia.data));
		System.out.println("Valor: R$" + valor);
		System.out.println("De: " + clienteEnvio.nome);
		System.out.println("CPF: " + clienteEnvio.cpf);
		System.out.println("Conta: " + clienteEnvio.conta.numero);
		System.out.println("Agencia: " + clienteEnvio.conta.agencia.nome);
		System.out.println();
		System.out.println("Para: " + clienteRecebimento.nome);
		System.out.println("CPF: " + clienteRecebimento.cpf);
		System.out.println("Conta: " + clienteRecebimento.conta.numero);
		System.out.println("Agencia: " + clienteRecebimento.conta.agencia.nome);
		System.out.println();
		
	}
	
	void realizarSaque(Cliente cliente, double valor) {
		cliente.conta.saldo -= valor;
		System.out.println("R$" + valor + " sacados com sucesso");
	}
	
	void realizarDeposito(Cliente cliente, double valor) {
		cliente.conta.saldo += valor;
		System.out.println("R$" + valor + " depositados com sucesso");
	}
}
