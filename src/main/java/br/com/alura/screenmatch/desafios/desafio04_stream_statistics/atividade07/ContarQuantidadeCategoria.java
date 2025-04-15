package br.com.alura.screenmatch.desafios.desafio04_stream_statistics.atividade07;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ContarQuantidadeCategoria {
    public static void main(String[] args) {
    // 7 - Dada a lista de produtos acima, conte quantos produtos há em cada categoria e armazene em um Map<String, Long>.

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone",800.0,"Eletrônicos"),
                new Produto("Notebook",1500.0,"Eletrônicos"),
                new Produto("Teclado",200.0,"Eletrônicos"),
                new Produto("Cadeira",300.0,"Móveis"),
                new Produto("Monitor",900.0,"Eletrônicos"),
                new Produto("Mesa",700.0,"Móveis")
        );
        Map<String,Long> agrupador = produtos.stream()
                .collect(Collectors.groupingBy(Produto::getCategoria,Collectors.counting()));

        System.out.println(agrupador);
    }
}
