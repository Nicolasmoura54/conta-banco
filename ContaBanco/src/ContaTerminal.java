import java.util.Scanner;

public class ContaTerminal {
    int numeroConta;
    String agencia;
    String cliente;
    double saldo= 1500;

    Scanner sc = new Scanner(System.in);
    public void nomeCliente(){
        System.out.println("Por favor, digite o seu nome completo: ");
        cliente = sc.nextLine();

    }
    public void agencia(){
        System.out.println("Por favor, digite o numero da agencia: ");
        agencia = sc.nextLine();

    }
    public void numeroConta(){
        System.out.println("Por favor, digite o numero da conta: ");
        numeroConta = sc.nextInt();

    }

    public void mensagem(){
        System.out.println("Olá: " + cliente + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia +
                ", conta: " + numeroConta + ", e seu saldo: " + saldo + " já está disponível para saque");


    }
}
