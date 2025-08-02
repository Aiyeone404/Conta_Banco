import java.util.Scanner;
public class Conta {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double checkespecial=0;
        System.out.println("Digite Seu Nome:");
        String nome=scanner.nextLine();
        System.out.println("Digite Seu Saldo Inicial:");
        double saldoinicial=scanner.nextDouble();
        Pessoa user=new Pessoa(nome, saldoinicial,checkespecial);

        System.out.printf( "Seja Bem Vindo(a) " + user.getnome() + " Seu Saldo Inicial " + user.getsaldo());
        System.out.println("O valor Liberado Para o CheckEspecial E " + user.getcheck());
        while (true) {
        System.out.println("Seja Bem Vindo(a), Escolha Alguma OPÇAO ");
        System.out.println("Digite 1 Para Fazer Deposito: ");
        System.out.println("Digite 2  Para Fazer O Saque: ");
        System.out.println("Digite 0  Para Finalizar Programa: ");
        
        int opc=scanner.nextInt();
        switch (opc) {
            case 1:
            user.deposito(scanner);
                break;
            case 2:
            user.saque(scanner);
            break;
            case 0:
            System.out.println("SISTEMA FINALIZADO");
            scanner.close();
            return;
            default:
            System.out.println("OPÇAO INVALIDA");
                break;
        }
    }
    }
}
