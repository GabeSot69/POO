import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalBanco {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Banco> bancos = new ArrayList<>();
        criarBanco(bancos);
        char escolha;
        Cliente cliente = new Cliente();
        switch (escolha){
            case '1':
                banco.abrirConta(cliente);
                break;
            case '2':
                banco.encerrarConta(cliente);
                break;
            case '3':
                Terceiro terceiro = new Terceiro();
                System.out.println("Digite o nome do terceiro");
                terceiro.nome = scanner.nextLine();
                terceiro.CPF = scanner.nextLine();
                terceiro.banco
                banco.realizarPagamento();
        }

    }

    public static void criarBanco(List<Banco> bancos){
        Banco banco = new Banco();
        System.out.println("Digite o nome do banco");
        banco.nome = scanner.nextLine();
        System.out.println("Digite o endereço");
        banco.endereco = scanner.nextLine();
        System.out.println("Digite o CNPJ");
        banco.CNPJ = scanner.nextLine();
        System.out.println("Digite o FEBRABAN");
        banco.FEBRABAN = scanner.nextLine();
        bancos.add(banco);
    }
}
