package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.model.DadosEpisodio;
import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.model.DadosTemporada;
import br.com.alura.screenmatch.model.Episodio;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverterDados;

import java.sql.SQLOutput;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;


public class Principal {

    private Scanner leitura = new Scanner(System.in);
    private ConsumoAPI consumo = new ConsumoAPI();

    private final String ENDERECO = "https://www.omdbapi.com/?t=";
    private final String API_KEY = "&apikey=5d75dc03";

    public void exibeMenu() {
        System.out.println("Digite o nome da série para a busca");
        var nomeSerie = leitura.nextLine();
        var json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ","+") + API_KEY);
        ConverterDados conversor = new ConverterDados();
        DadosSerie dados = conversor.obterDados(json,DadosSerie.class);

        //"https://www.omdbapi.com/?t=gilmore+girls&apikey=5d75dc03"

        List<DadosTemporada> temporadas = new ArrayList<>();

        for (int i = 1;i <= dados.totalTemporadas();i++) {
            json = consumo.obterDados(ENDERECO + nomeSerie.replace(" ","+") + "&season=" + i + API_KEY);
            DadosTemporada dadosTemporada = conversor.obterDados(json,DadosTemporada.class);
            temporadas.add(dadosTemporada);
        }
        temporadas.forEach(System.out::println);

        //        for (int i = 0;i < dados.totalTemporadas() ;i++) {
        //            List<DadosEpisodio> episodiosTemporada = temporadas.get(i).episodios();
        //            for (int j = 0;j < episodiosTemporada.size() ;j++) {
        //                System.out.println(episodiosTemporada.get(j).titulo());
        //            }
        //        }

        temporadas.forEach(t -> t.episodios().forEach(e -> System.out.println(e.titulo())));

        List<String> nomes = Arrays.asList("Jacque","Iasmin","Paulo","Rodrigo","Nico");

        //        nomes.stream()
        //                .sorted()
        //                .limit(3)
        //                .filter(n -> n.startsWith("N"))
        //                .map(n -> n.toUpperCase())
        //                .forEach(System.out::println);


        List<DadosEpisodio> ListaDadosEpisodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream())
                .collect(Collectors.toList());

//        System.out.println("\nTop 10 episódios");
//        ListaDadosEpisodios.stream()
//                .filter(e -> !e.avaliacao().equalsIgnoreCase("N/A"))
//                .peek(e -> System.out.println(" Filtro N/A " + e))
//                .sorted(Comparator.comparing(DadosEpisodio::avaliacao).reversed())
//                .peek(e -> System.out.println("Ordenação reverse avaliação " + e))
//                .limit(10)
//                .peek(e -> System.out.println("Limite de 10 " + e))
//                .map(e -> e.titulo().toUpperCase())
//                .peek(e -> System.out.println("Map uppercase " + e))
//                .forEach(System.out::println);
//
        List<Episodio> episodios = temporadas.stream()
                .flatMap(t -> t.episodios().stream()
                .map(d -> new Episodio(t.numero(),d)))
                .collect(Collectors.toList());

        episodios.forEach(System.out::println);



//        System.out.println("Digite um trecho do titulo do episódio");
//        String trechoTitulo = leitura.nextLine();
//        Optional<Episodio> episodioBuscado = episodios.stream()
//                .filter(e -> e.getTitulo().toUpperCase().contains(trechoTitulo.toUpperCase()))
//                .findFirst();
//
//        if (episodioBuscado.isPresent()) {
//            System.out.println("Episódio encontrado Encontrado!");
//            System.out.println("Temporada: " + episodioBuscado.get().getTemporada());
//        }else {
//            System.out.println("Episódio não encontrado Encontrado!");
//        }
        //
//        System.out.println("A partir de que ano você deseja ver os episódios?");
//        var ano = leitura.nextInt();
//
//        LocalDate databusca = LocalDate.of(ano,1,1);
//
//        DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
//        episodios.stream()
//                .filter(e -> e.getDataLancamento() != null && e.getDataLancamento().isAfter(databusca))
//                .forEach(e -> System.out.println(
//                        "Temporada " + e.getTemporada() +
//                        ":" + " Episódio " + + e.getNumeroEpisodio() +
//                        ": " + e.getTitulo() +
//                        " Data lançamento: " + e.getDataLancamento().format(formatador)
//                ));

        Map<Integer, Double> avaliaçoesPorTemporada = episodios.stream()
                .filter(episodio -> episodio.getAvaliacao() > 0.0)
                .collect(Collectors.groupingBy(Episodio::getTemporada,
                                               Collectors.averagingDouble(Episodio::getAvaliacao)));
        System.out.println(avaliaçoesPorTemporada);

        DoubleSummaryStatistics est = episodios.stream()
                .filter(episodio -> episodio.getAvaliacao() > 0.0)
                .collect(Collectors.summarizingDouble(Episodio::getAvaliacao));
        System.out.println("Média: " + est.getAverage());
        System.out.println("Melhor episódio: " + est.getMax());
        System.out.println("Pior episódio: " + est.getMin());
        System.out.println("Quantidade: " + est.getCount());
   }
}