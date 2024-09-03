public class Funcionario {
    String nome;
    String funcao;
    double salario;

public double ajustarsalario(){
    salario*=1.05;
    return salario;
}
public void exibirinfo( ){
    System.out.println("Nome: " + nome);
    System.out.println("Função: " + funcao);
    System.out.println("Salário: R$ " + String.format("%.2f", salario));
    System.out.println();
}



}

