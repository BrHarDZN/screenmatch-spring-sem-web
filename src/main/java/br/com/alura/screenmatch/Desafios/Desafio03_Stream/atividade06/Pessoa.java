package br.com.alura.screenmatch.Desafios.Desafio03_Stream.atividade06;

public class Pessoa {
    String nome;
    int idade;

    Pessoa(String nome,int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}