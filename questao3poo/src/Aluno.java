public class Aluno {
    int Marticula;
    String nome;
    double p1, p2;
    double trabalho;
    double m;

    public double media() {

        m=(p1*2.5+p2*2.5+trabalho*2)/7;
        System.out.println(m);
        return m;

    }
    public void provafinal () {
        if(m<4.2) {
            System.out.println(nome +" ficou a baixo da media e tera que fazer prova final");
            double notaprovafinal;
            notaprovafinal=4.2-m;
            System.out.println(nome+" precisa tirar "+ notaprovafinal+" para passar de ano");



        }else {
            System.out.println(nome+" passou de ano direto");
        }


    }

}
