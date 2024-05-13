public class vetor02 {
    public static void main(String[] args) {
        int vetor1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int vetor2[] = {11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        int soma[]=somavetores(vetor1,vetor2);
        System.out.print("vetor soma: ");
        for (int num:soma){
            System.out.print(num + "  ");
        }

    }

    public static int[] somavetores(int[] vetor1, int[] vetor2) {
        int vetorsoma[] = new int[10];

        for (int i = 0; i < 10; i++) {
            vetorsoma[i] = vetor1[i] + vetor2[i];

        }

        return vetorsoma;


    }
}