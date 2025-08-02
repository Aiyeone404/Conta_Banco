import java.util.Scanner;

public class Pessoa{
    public String nome;
    public double saldo;
    public double checkespecial;
    Pessoa(String nome, double saldo, double checkespecial){
        this.nome=nome;
        this.saldo=saldo;
        this.checkespecial=checkespecial;
    }
      public String getnome(){
          return nome;
    }
    public double getsaldo(){
        return saldo;
    }

    public double getcheck(){
        if(saldo<=500){
            return checkespecial=50;
        }else{
            return checkespecial = saldo / 2;
        }
    }
    public void deposito(Scanner Scanner){
        System.out.println("Digite O Valor A Ser Depositado: ");
        double valordeposito=Scanner.nextDouble();
         saldo=saldo+valordeposito;
         System.out.println("Seu Valor Atual E "+ saldo);
    }

    public void saque(Scanner Scanner){
        System.out.println("O Saldo Disponivel Na Sua Conta Para Sacar E "+ saldo);
        double sacar=Scanner.nextDouble();
        if(sacar>saldo){
            System.out.println("Valor Para Sacar Menor Que Saldo Disponivel" );
        }else{
             saldo=sacar-saldo;
             System.out.printf("Saque No Valor De "+ sacar +"Feito Com Sucesso");
        }
    }
    public void boleto(Scanner Scanner){
        System.out.println("Digite O Valor Do Boleto Que Deseja Pagar");
        double valorboleto=Scanner.nextDouble();
        if(valorboleto > saldo) {
            System.out.println("Voce Nao Possui Saldo Suficiente Para Pagar O Boleto");
        }else{
            saldo=valorboleto-saldo;
            System.out.println("Boleto Pago Com Sucesso, Seu Saldo Atual Agora E " + saldo);
        }
    }
}