import java.util.Scanner;
public class atv2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int a,b,c;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        while(b+c!=a){
            System.out.print("digite um numero");
            b=c;
            c=sc.nextInt();
        }
        if(b+c==a){
            System.out.print("esse dois numeros somados dão o primeiro numero");
        }














}
}
