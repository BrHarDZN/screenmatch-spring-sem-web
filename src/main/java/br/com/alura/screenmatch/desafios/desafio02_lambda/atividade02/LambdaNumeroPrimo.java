package br.com.alura.screenmatch.desafios.desafio02_lambda.atividade02;

public class LambdaNumeroPrimo {
    public static void main(String[] args) {
        //2 - Implemente uma expressão lambda que verifique se um número é primo.
        Primo numero = n -> {
            if (n <= 1) {
                return false;
            }
            //Math.sqrt(n) define o tamanho como a raiz quadrada.
            for (int i = 2;i <= Math.sqrt(n);i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        };
        System.out.println(numero.verificarPrimo(97));
    }
}
