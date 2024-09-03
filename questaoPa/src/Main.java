import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
  ProgressaAritmetica pa=new ProgressaAritmetica(1,1);
        System.out.print("Informe o número de termos (n): ");
        int n = sc.nextInt();

        System.out.println("Os " + n + " primeiros termos da progressão são:");
        for (int i = 0; i < n; i++) {
            System.out.println(pa.proximoTermo());
        }
       System.out.println("*****************************");
        System.out.println("digite o novo primeiro termo da pa");
        int novoprimeirotermo=sc.nextInt();
        pa.setPrimeiroTermo(novoprimeirotermo);
        System.out.println("digite nova razao da pa");
        int novarazao=sc.nextInt();
        pa.setRazao(novarazao);
        System.out.println("digite quantos termo voce quer");
       int x=sc.nextInt();
        for(int i=0;i<x;i++){
            System.out.println(pa.proximoTermo());
        }










    }
}