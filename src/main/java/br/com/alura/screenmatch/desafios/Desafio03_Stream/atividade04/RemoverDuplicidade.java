package br.com.alura.screenmatch.desafios.Desafio03_Stream.atividade04;

import java.util.Arrays;
import java.util.List;

public class RemoverDuplicidade {
        public static void main(String[] args) {
            // 4 - Dada a lista de strings abaixo, remova as duplicatas (palavras que aparecem mais de uma vez)
            // e imprima o resultado.

            List<String> palavras = Arrays.asList("apple","banana","apple","orange","banana");
            palavras.stream()
                    .distinct()
                    .forEach(System.out::println);


        }
}
