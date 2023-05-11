import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agencia !");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da Conta !");
        String agencia = scanner.next();
        
        System.out.println("Por favor, digite o Nome do Cliente !");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o Saldo da Conta !");
        double saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %s e seu saldo %s já está disponível para saque", nomeCliente, agencia, numero, saldo);
    }
}
