package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade04;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SomaQuadradosNumerosPares {
    public static void main(String[] args) {
        //4 - Dada a lista de números inteiros abaixo, calcule a soma dos quadrados dos números pares.
        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        System.out.println(numeros.stream()
                                   .filter(n -> n % 2 == 0)
                                   .map(n -> n * n)
                                   .reduce(0,Integer::sum));
    }
}
