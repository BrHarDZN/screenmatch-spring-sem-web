package br.com.alura.screenmatch.desafios.Desafio02_Lambda.atividade06;

import java.util.Arrays;
import java.util.List;

public class LambdaOrdemAlfabetica {
    public static void main(String[] args) {
        // 6 - Crie uma expressão lambda que ordene uma lista de strings em ordem alfabética. Dica: a função sort,
        // das Collections, recebe uma interface funcional como parâmetro, assim como vimos na função forEach.

        List<String> nomes = Arrays.asList("Bruno","Mairone","Elisa","Marvin","Ado");
        nomes.sort(String::compareTo);
        System.out.println(nomes);
    }
}
