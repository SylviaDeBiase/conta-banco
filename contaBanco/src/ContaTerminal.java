import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;	
        String agencia;
        String cliente;
        double saldo;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o nome do cliente!");
        cliente = scanner.nextLine();
        System.out.println("Digite o número da agência !");
        agencia = scanner.nextLine();
        System.out.println("Entre com o número da conta!");
        numero = scanner.nextInt();
        System.out.println("Qual o valor para abertura de conta?");
        saldo = scanner.nextDouble();

        String mensagem = "Olá ".concat(cliente)
            .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
            .concat(agencia).concat(", conta ")
            .concat(String.valueOf(numero)).concat(" e seu saldo ")
            .concat(String.valueOf(saldo)).concat(" já está disponível para saque");

        System.out.println(mensagem);
    }
}
