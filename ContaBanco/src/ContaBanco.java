import java.util.Scanner;

public class ContaBanco {
    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    ContaTerminal contaTerminal = new ContaTerminal();

    contaTerminal.nomeCliente();
    contaTerminal.agencia();
    contaTerminal.numeroConta();
    contaTerminal.mensagem();



    sc.close();

    }

}
