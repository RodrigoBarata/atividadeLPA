
public class ProgressaoAritimerica {
    int primeiroTermo=2;
    int razao=3;
    int termoAtual=this.primeiroTermo;

    public int proximoTermo() {
        int atual=this.termoAtual;
        this.termoAtual+=this.razao;
        return atual;

    }
}



