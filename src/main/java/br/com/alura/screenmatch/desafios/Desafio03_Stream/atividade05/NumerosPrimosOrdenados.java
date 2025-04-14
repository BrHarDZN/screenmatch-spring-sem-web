package br.com.alura.screenmatch.desafios.Desafio03_Stream.atividade05;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumerosPrimosOrdenados {
    public static void main(String[] args) {
        // 5 - Dada a lista de sublistas de números inteiros abaixo, extraia todos os números primos em uma única lista
        // e os ordene em ordem crescente.

        List<List<Integer>> listaDeNumeros = Arrays.asList(
                Arrays.asList(1,2,3,4),
                Arrays.asList(5,6,7,8),
                Arrays.asList(9,10,11,12)
        );

        List<Integer> numerosPrimos = listaDeNumeros.stream()
                .flatMap(List::stream).
                filter(NumerosPrimosOrdenados::ehPrimo)
                .sorted()
                .collect(Collectors.toList());

        numerosPrimos.forEach(System.out::println);
    }

    private static boolean ehPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        //Math.sqrt(n) define o tamanho como a raiz quadrada.
        for (int i = 2;i <= Math.sqrt(numero);i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
