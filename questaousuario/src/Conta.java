
public class Conta {

    private int numeroconta;
    private String nome;
    private double saldo;
    public Conta(int numeroconta,String nome,double saldoInicial){
        this.numeroconta=numeroconta;
        this.nome=nome;
        this.saldo=saldoInicial;
    }
    public void sacar(double valor){
        if (valor>saldo){
            System.out.println("saldo insuficiente");
        }else{
            saldo-=valor;
            System.out.println("saque de "+valor+" realizado");
            System.out.println("sua conta esta com "+saldo+" reais");
        }
    }
    public void depositar(double valor){
        saldo+=valor;
        System.out.println("deposito de "+valor+" realizado");
        System.out.println("seu saldo agora é "+saldo);

    }
    public double consultar(){
        return saldo;
    }



}

