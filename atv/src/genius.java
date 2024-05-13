import java.util.Random;
import java.util.Scanner;
public class genius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean saoiguais=true;
        int nivel1[] = nivel1();
       System.out.println("vetor:");
            for (int i = 0; i < nivel1.length; i++) {
                System.out.print(nivel1[i]);
            }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            System.out.println("thread 2 interrupted");
        }for(int i=1; i<=80; i++) {
            System.out.println();
        }
        System.out.println("Digite uma sequência de números separados por espaço:");
        String userInput = sc.nextLine();
        String[] numerosDigitados = userInput.split(" ");
        for (int i = 0; i < nivel1.length; i++) {
            int numeroDigitado = Integer.parseInt(numerosDigitados[i]);
            if (numeroDigitado != nivel1[i]) {
                saoiguais = false;
                break;
            }


        }
       if(saoiguais){
       System.out.println("voce subiu de nivel");
      }else{
     System.out.println("game over");
       }
       boolean saoiguais2=true;
        int nivel2[] = nivel2();
        System.out.println("vetor:");
        for (int i = 0; i < nivel2.length; i++) {
            System.out.print(nivel2[i]);
        }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            System.out.println("thread 2 interrupted");
        }for(int i=1; i<=80; i++) {
            System.out.println();
        }
        System.out.println("Digite uma sequência de números separados por espaço:");
        String userInput2 = sc.nextLine();
        String[] numerosDigitados2 = userInput.split(" ");
        for (int i = 0; i < nivel2.length; i++) {
            int numeroDigitado2 = Integer.parseInt(numerosDigitados[i]);
            if (numeroDigitado2 != nivel2[i]) {
                saoiguais2 = false;
                break;
            }


        }
        if(saoiguais2){
            System.out.println("voce subiu de nivel");
        }else{
            System.out.println("game over");
        }
        boolean saoiguais3=true;
        int nivel3[] = nivel3();
        System.out.println("vetor:");
        for (int i = 0; i < nivel3.length; i++) {
            System.out.print(nivel3[i]);
        }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            System.out.println("thread 2 interrupted");
        }for(int i=1; i<=80; i++) {
            System.out.println();
        }
        System.out.println("Digite uma sequência de números separados por espaço:");
        String userInput3 = sc.nextLine();
        String[] numerosDigitados3 = userInput.split(" ");
        for (int i = 0; i < nivel3.length; i++) {
            int numeroDigitado = Integer.parseInt(numerosDigitados[i]);
            if (numeroDigitado != nivel3[i]) {
                saoiguais3 = false;
                break;
            }


        }
        if(saoiguais3){
            System.out.println("voce subiu de nivel");
        }else{
            System.out.println("game over");
        }
        boolean saoiguais4=true;
        int nivel4[] = nivel4();
        System.out.println("vetor:");
        for (int i = 0; i < nivel4.length; i++) {
            System.out.print(nivel4[i]);
        }
        try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            System.out.println("thread 2 interrupted");
        }for(int i=1; i<=80; i++) {
            System.out.println();
        }
        System.out.println("Digite uma sequência de números separados por espaço:");
        String userInput4 = sc.nextLine();
        String[] numerosDigitados4 = userInput.split(" ");
        for (int i = 0; i < nivel4.length; i++) {
            int numeroDigitado = Integer.parseInt(numerosDigitados[i]);
            if (numeroDigitado != nivel4[i]) {
                saoiguais4 = false;
                break;
            }


        }
        if(saoiguais4){
            System.out.println("voce subiu de nivel");
        }else{
            System.out.println("game over");
        }
        System.out.println("fim de jogo");

    }

    public static int[] nivel1() {
        Random gerador = new Random();
        int sequencia[] = new int[9];
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = gerador.nextInt(3)+1;
        }

        return sequencia;
    }

    public static int[] nivel2() {
        Random gerador = new Random();
        int sequencia[] = new int[9];
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = gerador.nextInt(6)+1;
        }

        return sequencia;
    }

    public static int[] nivel3() {
        Random gerador = new Random();
        int sequencia[] = new int[9];
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = gerador.nextInt(9) + 1;
        }

        return sequencia;
    }

    public static int[] nivel4() {
        Random gerador = new Random();
        int sequencia[] = new int[9];
        for (int i = 0; i < sequencia.length; i++) {
            sequencia[i] = gerador.nextInt(12) + 1;
        }

        return sequencia;
    }
}