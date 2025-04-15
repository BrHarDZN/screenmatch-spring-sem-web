package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade02;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparPeloTamanho {
    public static void main(String[] args) {
        // 2 - Dada a lista de palavras (strings) abaixo, agrupe-as pelo seu tamanho.
        // No código a seguir, há um exemplo prático do resultado esperado.
        List<String> palavras = Arrays.asList("java","stream","lambda","code");

        Map<Integer, List<String>> agrupamento = palavras.stream()
                                                 .collect(Collectors.groupingBy(String::length));
        System.out.println(agrupamento);

        // Resultado Esperado: {4=[java, code], 6=[stream, lambda]}
    }
}
