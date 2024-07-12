package executavel;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicita o número da conta
        System.out.println("Por favor, digite o número da conta (4 Dígitos):");
        int numero = sc.nextInt();
        sc.nextLine(); // Consumir a nova linha restante

        // Solicita a agência
        System.out.println("Por favor, digite o número da agência no formato XXX-X:");
        String agencia = sc.nextLine();

        // Solicita o nome do cliente
        System.out.println("Por favor, digite o nome do cliente:");
        String nomeCliente = sc.nextLine();

        // Solicita o saldo
        System.out.println("Por favor, digite o saldo inicial:");
        double saldo = sc.nextDouble();

        // Exibe a mensagem final
        String mensagem = String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.",
                nomeCliente, agencia, numero, saldo);
        System.out.println(mensagem);

        sc.close();
    }
}