

public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        f1.nome = "Joao";
        f1.funcao = "adim";
        f1.salario = 1000;
        Funcionario f2 = new Funcionario();
        f2.nome = "Ana";
        f2.funcao = "Artista";
        f2.salario = 2000;
        Funcionario f3 = new Funcionario();
        f3.nome = "Pedro";
        f3.funcao = "desenvolvedor";
        f3.salario = 3000;
        f1.ajustarsalario();
        f1.exibirinfo();
        f2.ajustarsalario();
        f2.exibirinfo();
        f3.ajustarsalario();
        f3.exibirinfo();



    }
    }
