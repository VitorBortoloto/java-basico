import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o seu nome completo: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o numero da sua Agência: ");
        String numeroAgencia = scanner.next();

        System.out.println("Por favor, digite o numero da sua conta: ");
        int numeroConta = scanner.nextInt();               

        System.out.println("Por favor, digite o saldo da sua conta: ");
        double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo de " + saldo + 
        " já está disponível para saque!");
    }
}
