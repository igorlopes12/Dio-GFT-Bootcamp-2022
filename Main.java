package dio.com;

public class Main {

    public static void main(String[] args){

        //Calculadora

        System.out.println("Exercício Calculadora");
        Calculadora.soma(3, 5);
        Calculadora.subtracao(10, 3.2);
        Calculadora.divisao(40, 3.2);
        Calculadora.multiplicao(10, 4.5);

        //Mensagem
        System.out.println("Exercício Mensagem");
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(3);

        //Emprestimo
        System.out.println("Exercicio Emprestimo");
        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000,5);

    }
}
