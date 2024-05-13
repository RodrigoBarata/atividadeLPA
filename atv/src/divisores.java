import java.util.Scanner;
public class divisores {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a,resultado;
        a=sc.nextInt();
        for(double i=0;i<=a;i++){
            resultado=a/i;

            if(a%i==0){
                System.out.print(a+"/"+i+"="+resultado+"   ");

            }
        }






    }
}
