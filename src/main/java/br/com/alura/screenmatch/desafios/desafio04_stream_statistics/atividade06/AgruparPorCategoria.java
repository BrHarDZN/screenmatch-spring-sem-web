package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade06;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparPorCategoria {
    public static void main(String[] args) {
        // 6 - Dada a lista de produtos acima, agrupe-os por categoria em um Map<String, List<Produto>>.
        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );

       Map<String,List<Produto>> agrupador = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria));

        System.out.println(agrupador);
    }
}
