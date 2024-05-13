import java.util.Scanner;
public class atv3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        int a;
        a=sc.nextInt();
        while((a>100)||(a<0)){
            System.out.print("digite outro numero");
                    a=sc.nextInt();
        }
        if((a<=100)&&(a>0)) {
        System.out.print("seu numero esta dentro da faixa ");
        }


















    }
}