import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da conta:");
        int numero = sc.nextInt();

        System.out.println("Digite a agência:");
        String agencia = sc.next();

        System.out.println("Digite seu nome:");
        String nome = sc.next();

        System.out.println("Digite o saldo inicial");
        double saldo = sc.nextDouble();

        System.out.println("Olá "+nome+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque");
    }
}
