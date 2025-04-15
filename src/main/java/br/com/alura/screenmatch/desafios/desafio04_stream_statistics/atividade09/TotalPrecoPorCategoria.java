package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade09;

import java.util.*;
import java.util.stream.Collectors;

public class TotalPrecoPorCategoria {
    public static void main(String[] args) {
        // 9 - Dada a lista de produtos acima, calcule o total dos preços dos produtos em cada categoria
        // e armazene o resultado em um Map<String, Double>.
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone",800.0,"Eletrônicos"),
                new Produto("Notebook",1500.0,"Eletrônicos"),
                new Produto("Teclado",200.0,"Eletrônicos"),
                new Produto("Cadeira",300.0,"Móveis"),
                new Produto("Monitor",900.0,"Eletrônicos"),
                new Produto("Mesa",700.0,"Móveis")
        );

        Map<String,Double> somaPrecoPorCategoria = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,
                                               Collectors.summingDouble(Produto::getPreco)));

        System.out.println(somaPrecoPorCategoria);
    }
}
