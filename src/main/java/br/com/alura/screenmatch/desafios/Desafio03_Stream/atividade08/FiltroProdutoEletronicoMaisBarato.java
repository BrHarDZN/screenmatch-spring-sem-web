package br.com.alura.screenmatch.desafios.Desafio03_Stream.atividade08;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Collectors;

public class FiltroProdutoEletronicoMaisBarato {
     public static void main(String[] args) {
        // 7 - Você tem uma lista de objetos do tipo Produto, onde cada produto possui os atributos nome (String),
        // preco (double) e categoria (String). Filtre todos os produtos da categoria "Eletrônicos"
        // com preço menor que R$ 1000, ordene-os pelo preço em ordem crescente e colete o resultado em uma nova lista.

        List<Produto> produtos = Arrays.asList(
                new Produto("Smartphone", 800.0, "Eletrônicos"),
                new Produto("Notebook", 1500.0, "Eletrônicos"),
                new Produto("Teclado", 200.0, "Eletrônicos"),
                new Produto("Cadeira", 300.0, "Móveis"),
                new Produto("Monitor", 900.0, "Eletrônicos"),
                new Produto("Mesa", 700.0, "Móveis")
        );
        List<Produto> produtosFiltrados =  produtos.stream()
                .filter(p -> p.getCategoria().equals("Eletrônicos"))
                .sorted((p1,p2) -> Double.compare(p1.getPreco(),p2.getPreco()))
                .limit(3)
                .collect(Collectors.toList());

        produtosFiltrados.forEach(System.out::println);
    }
}
