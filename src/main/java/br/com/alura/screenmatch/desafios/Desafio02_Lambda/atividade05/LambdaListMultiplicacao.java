package br.com.alura.screenmatch.desafios.Desafio02_Lambda.atividade05;

import java.util.*;

public class LambdaListMultiplicacao {
    public static void main(String[] args) {
        // 5 - Implemente uma expressão lambda que recebe uma lista de inteiros e
        // retorna uma nova lista onde cada número foi multiplicado por 3.
        // Dica: a função replaceAll, das Collections, recebe uma interface funcional como parâmetro,
        // assim como vimos na função forEach.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5);
        numeros.replaceAll(n -> n * 3);
        System.out.println(numeros);
    }
}
