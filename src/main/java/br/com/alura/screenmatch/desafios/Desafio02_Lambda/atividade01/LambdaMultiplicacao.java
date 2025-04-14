package br.com.alura.screenmatch.desafios.Desafio02_Lambda.atividade01;

public class LambdaMultiplicacao  {
    public static void main(String[] args) {
        // 1 - Crie uma expressão lambda que multiplique dois números inteiros. A expressão deve ser implementada
        // dentro de uma interface funcional com o método multiplicar(int a, int b).

        Operacao multiplicacao = (n1,n2) -> n1 * n2;
        System.out.println(multiplicacao.multiplicar(2,5));
    }
}
