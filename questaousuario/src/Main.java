import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        Conta cliente = new Conta(1, "Joao", 100);

        do {

                System.out.println("Menu:");
                System.out.println("1. Saque");
                System.out.println("2. Depósito");
                System.out.println("3. Consulta de Saldo");
                System.out.println("4. Sair");
                System.out.print("Escolha uma opção: ");
                n = sc.nextInt();
            switch (n) {
                case 1:
                    System.out.println("Quantos reais voce quer sacar?");
                    double valordesaque;
                    valordesaque = sc.nextDouble();
                    cliente.sacar(valordesaque);
                    break;
                case 2:
                    System.out.println("Quantos reais voce quer depositar?");
                    double valordedeposito;
                    valordedeposito = sc.nextDouble();
                    cliente.depositar(valordedeposito);
                    break;
                case 3:
                    System.out.println("seu saldo é " + cliente.consultar() + " reais");
                    break;
                case 4:
                    System.out.println("Saindo da aplicação");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }while (n!=4);
    }
}