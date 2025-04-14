package br.com.alura.screenmatch.desafios.Desafio02_Lambda.atividade07;

public class LambaException {
    public static void main(String[] args) {
        // 7 - Crie uma função lambda que recebe dois números e divide o primeiro pelo segundo.
        // A função deve lançar uma exceção de tipo ArithmeticException se o divisor for zero.

        Operacao operacao = (n1,n2) -> {
            if (n2 == 0) {
                throw new ArithmeticException("Divisão por zero");
            }
            return n1 / n2;
        };

        try {
            System.out.println(operacao.dividir(10,2));
            System.out.println(operacao.dividir(10,0));
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
