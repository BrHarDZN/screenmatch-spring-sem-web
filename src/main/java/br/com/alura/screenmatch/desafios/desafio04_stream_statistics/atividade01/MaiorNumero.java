package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class MaiorNumero {
    public static void main(String[] args) {
        // 1 - Dada a lista de números inteiros a seguir, encontre o maior número dela.
        List<Integer> numeros = Arrays.asList(10,20,30,40,50);
        Optional<Integer> max = numeros.stream()
                                       .max(Integer::compare);
        max.ifPresent(System.out::println); // Esperado: 50
    }
}
