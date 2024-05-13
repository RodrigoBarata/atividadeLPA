public class vetor {
    public static void main(String[] args) {
        int sequencia[] = {22,100, 8, 1, 10};
        int maior = Maiornumero(sequencia);
        System.out.print(maior);
    }

        public static int Maiornumero ( int sequencia[]){
            int posiçãomaior = 0;
            for (int i = 1; i < sequencia.length; i++) {
                if (sequencia[i] > sequencia[posiçãomaior]) {
                    posiçãomaior = i;

                }
            }
            return posiçãomaior;
        }
    }

















