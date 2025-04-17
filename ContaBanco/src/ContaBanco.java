import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {
        // Receber os dados do usuário
        Scanner scanner = new Scanner(System.in);

        // Mensagens e entrada de dados
        System.out.println("Digite seu nome e pressione Enter: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o número da agência e pressione Enter: ");
        int numeroAgencia = scanner.nextInt();
        scanner.nextLine(); // consumir a quebra de linha que sobrou do nextInt()

        System.out.println("Digite o número da conta e pressione Enter: ");
        String numeroConta = scanner.nextLine();

        System.out.println("Digite o saldo inicial e pressione Enter: ");
        double saldo = scanner.nextDouble();

        // Mensagem final personalizada
        System.out.println("\nOlá " + nomeCliente +
                ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + numeroAgencia +
                ", conta " + numeroConta +
                " e seu saldo R$" + String.format("%.2f", saldo) +
                " já está disponível para saque.");

        // Encerrar o scanner
        scanner.close();
    }
}
