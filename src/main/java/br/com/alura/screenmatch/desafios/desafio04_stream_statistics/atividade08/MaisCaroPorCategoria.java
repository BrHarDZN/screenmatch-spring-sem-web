package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade08;

import java.util.*;
import java.util.stream.Collectors;

public class MaisCaroPorCategoria {
    public static void main(String[] args) {
        // 8 - Dada a lista de produtos acima, encontre o produto mais caro de cada categoria
        // e armazene o resultado em um Map<String, Optional<Produto>>.

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone",800.0,"Eletrônicos"),
                new Produto("Notebook",1500.0,"Eletrônicos"),
                new Produto("Teclado",200.0,"Eletrônicos"),
                new Produto("Cadeira",300.0,"Móveis"),
                new Produto("Monitor",900.0,"Eletrônicos"),
                new Produto("Mesa",700.0,"Móveis")
        );

        Map<String,Optional<Produto>> produtosMaisCarosPorCategoria = produtos.stream()
                                                          .collect(Collectors.groupingBy(Produto::getCategoria,
                                                           Collectors.maxBy(Comparator.comparingDouble(Produto::getPreco))));

        System.out.println(produtosMaisCarosPorCategoria);
    }
}
