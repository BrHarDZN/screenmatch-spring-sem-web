package br.com.alura.screenmatch.Desafios.Desafio03_Stream.atividade06;

import java.util.Arrays;
import java.util.List;

public class FiltroIdadePessoa {

    public static void main(String[] args) {
        // 6 - Dado um objeto Pessoa com os campos nome e idade, filtre as pessoas com mais de 18 anos,
        // extraia os nomes e imprima-os em ordem alfabética. A classe Pessoa está definida abaixo.

        List<Pessoa> pessoas = Arrays.asList(
                new Pessoa("Charlie",19),
                new Pessoa("Alice",22),
                new Pessoa("Bob",17)

        );

        pessoas.stream()
                .filter(p -> p.getIdade() > 18)
                .map(Pessoa::getNome)
                .sorted()
                .forEach(System.out::println);

    }
}



