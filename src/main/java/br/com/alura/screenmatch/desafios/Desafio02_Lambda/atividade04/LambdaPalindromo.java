package br.com.alura.screenmatch.desafios.Desafio02_Lambda.atividade04;

public class LambdaPalindromo {
    public static void main(String[] args) {
        // 4 - Crie uma expressão lambda que verifique se uma string é um palíndromo.
        // A expressão deve ser implementada dentro de uma interface funcional com o método boolean verificarPalindromo(String str).
        // Dica: utilize o método reverse da classe StringBuilder.

        Palindromo palindromo = str -> str.equals(new StringBuilder(str).reverse().toString());

        System.out.println(palindromo.verificarPalindromo("ana"));
        System.out.println(palindromo.verificarPalindromo("radar"));
        System.out.println(palindromo.verificarPalindromo("java"));
        System.out.println(palindromo.verificarPalindromo("macarrão"));
    }
}
