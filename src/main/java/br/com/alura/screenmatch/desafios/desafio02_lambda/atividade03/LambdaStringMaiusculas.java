package br.com.alura.screenmatch.desafios.desafio02_lambda.atividade03;

public class LambdaStringMaiusculas {
    public static void main(String[] args) {
        // 3 - Crie uma função lambda que receba uma string e a converta para letras maiúsculas.

        Converter converter = s -> s.toUpperCase();

        System.out.println(converter.maiusculas("teste de conversão para maiuscula"));

        String teste = "teste";
        teste.toUpperCase();


    }
}
