package aula10.aula.comparables.ex2;

import java.util.Arrays;

public class Filme implements Comparable<Filme> {
    int pontuacao;
    String nome;
    int ano;

    public Filme(String nome, int ano, int pontuacao) {
        this.nome = nome;
        this.ano = ano;
        this.pontuacao = pontuacao;
    }

    // Comparador de pontuacao
//    public int compareTo(Filme filme) {
//        if (pontuacao == filme.pontuacao)
//            return 0;
//        else if (pontuacao < filme.pontuacao)
//            return 1;
//        else
//            return -1;
//    }

    // Comparador de ano
    public int compareTo(Filme filme) {
        if (ano == filme.ano)
            return 0;
        else if (ano > filme.ano)
            return 1;
        else
            return -1;
    }

    // Testes ex2 Comparables
    public static void main(String[] args) {
        // Criar array filmes e inserir filmes na array
        Filme[] filmes = new Filme[3];
        filmes[0] = new Filme("Titanic", 1999, 10);
        filmes[1] = new Filme("Inception", 2010, 7);
        filmes[2] = new Filme("Avatar", 2009, 8);
        // Ordenar filmes por Pontuacao
        Arrays.sort(filmes);
        System.out.println("Ordenado por ano: ");
        for (Filme f : filmes) {
            System.out.println(f.nome + " " + f.ano + " " + f.pontuacao);
        }
    }

}
