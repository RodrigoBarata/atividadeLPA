import java.util.Scanner;
public class primo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,c=0;
        System.out.println("digite um numero:");
        a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(a%i==0)
                c++;

        }
        if(c==2){
            System.out.print("seu numero é primo");
        }else{
            System.out.print("seu numero não é primo");
        }



















    }
}
