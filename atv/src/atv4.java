import java.util.Scanner ;
public class atv4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,cp=0,sp=0,ci=0,si=0;
                do{
                    a=sc.nextInt();
                    if(a%2==0){
                        cp++;
                        sp+=a;
                    }else{
                        ci++;
                        si+=a;
                    }

                }while(cp<10);{
                    System.out.print(sp);
                    if(ci!=0){
                        System.out.print(si/ci);
                    }
        }



















    }
}