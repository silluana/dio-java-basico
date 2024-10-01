import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        String agencia = "";
        String nomeCliente = "";
        double saldo = 0.0;

        System.out.println("Por favor, digite o número da conta: ");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência: ");
        agencia = scanner.next();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = scanner.nextDouble();
        //System.out.println(scanner.nextDouble());

        System.out.println("Olá " + nomeCliente + ", obrigada por criar uma conta em nosso banco, sua agência é " +
            agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
