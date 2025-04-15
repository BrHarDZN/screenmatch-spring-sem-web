package br.com.alura.screenmatch.desafios.desafio03_stream.atividade03;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImparesMultPor2 {

    public static void main(String[] args) {
        // 3 - Dada a lista de números inteiros abaixo, filtre os números ímpares, multiplique cada um por 2
        // e colete os resultados em uma nova lista.

        List<Integer> numeros = Arrays.asList(1,2,3,4,5,6);

        List<Integer> numerosFiltradas = numeros.stream()
                .filter(n -> n % 2 != 0)    // 1,3,5
                .map(n -> n * 2)
                .collect(Collectors.toList());

        numerosFiltradas.forEach(System.out::println);
    }
}