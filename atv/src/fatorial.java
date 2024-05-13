import java.util.Scanner;
public class fatorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double f=1;
        double a=sc.nextInt();
        for(double i=1;i<=a;i++){
            f*=i;

        }
        System.out.print(f);






    }
}
