import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProgressaoAritimerica pa=new ProgressaoAritimerica();
        int n;
        n=sc.nextInt();
        for(int i=1; i<=n;i++){
            System.out.println(pa.proximoTermo());
        }
    }
}