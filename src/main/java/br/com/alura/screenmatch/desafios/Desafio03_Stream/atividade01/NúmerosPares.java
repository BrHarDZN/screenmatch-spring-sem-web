package br.com.alura.screenmatch.desafios.Desafio03_Stream.atividade01;

import java.util.Arrays;
import java.util.List;

public class NúmerosPares {
    public static void main(String[] args) {
        // 1 - Dada a lista de números inteiros abaixo, filtre apenas os números pares e imprima-os.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}
