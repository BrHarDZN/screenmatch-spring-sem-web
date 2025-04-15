package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade03;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConcatenaçãoPorVirgula {
    public static void main(String[] args) {
     // 3 - Dada a lista de nomes abaixo, concatene-os separados por vírgula.
     // No código a seguir, há um exemplo prático do resultado esperado.

        List<String> nomes = Arrays.asList("Alice","Bob","Charlie");
        System.out.println(nomes.stream().collect(Collectors.joining(", ")));
        // Resultado Esperado: "Alice, Bob, Charlie"
    }
}
