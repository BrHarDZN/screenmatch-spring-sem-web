package br.com.alura.screenmatch;

import br.com.alura.screenmatch.model.DadosSerie;
import br.com.alura.screenmatch.service.ConsumoAPI;
import br.com.alura.screenmatch.service.ConverterDados;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenmatchApplication.class,args);
    }

    @Override
    public void run(String... args) throws Exception {
        var consumoAPI = new ConsumoAPI();
        var json = consumoAPI.obterDados("https://www.omdbapi.com/?t=gilmore+girls&apikey=5d75dc03&");
        System.out.println();
        System.out.println(json);
        //        json = consumoAPI.obterDados("https://coffee.alexflipnote.dev/random.json");
        //        System.out.println();
        ConverterDados convesor = new ConverterDados();
        DadosSerie dados = convesor.obterDados(json,DadosSerie.class);
        System.out.println();
        System.out.println(dados);
    }
}
