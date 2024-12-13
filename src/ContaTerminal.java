import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        //TO DO: Criar objeto Scanner para receber dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        //Declarar variáveis para armazenar os dados da conta
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        //Solicitar o número da conta
        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        //Solicitar o número da agência
        System.out.println("Por favor, digite o número da agência: ");
        scanner.nextLine(); //Consumir a quebra de linha pendente
        agencia = scanner.nextLine();

        //Solicitar o nome do cliente
        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.nextLine();

        //Solicitar o saldo inicial
        System.err.println("Por favor, digite o saldo inicial: ");
        saldo = scanner.nextDouble();

        //Exibir a mensagem de confirmação
        System.out.println(String.format("\nOlá %s, obrigado por criar uma conta em nosso banco. Sua agência é %s, conta %d e seu saldo de R$%.2f já está disponível para saque.", nomeCliente, agencia, numero, saldo));
    }
}
