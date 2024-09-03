public class ProgressaAritmetica {
    private int primeirotermo;
    private int razao;
    private int termoatual;
    public ProgressaAritmetica(int primeirotermo,int razao){
        this.primeirotermo=primeirotermo;
        this.razao=razao;
        this.termoatual=primeirotermo;

    }
    public int proximoTermo() {
        int atual=this.termoatual;
        this.termoatual+=this.razao;
        return atual;

    }
    public int getPrimeirotermo() {
        return primeirotermo;
    }


    public void setPrimeiroTermo(int primeiroTermo) {
        this.primeirotermo = primeiroTermo;
        this.termoatual = primeiroTermo; // Reinicializa o termoAtual
    }


    public int getRazao() {
        return razao;
    }

    public void setRazao(int razao) {
        this.razao = razao;
    }

}
