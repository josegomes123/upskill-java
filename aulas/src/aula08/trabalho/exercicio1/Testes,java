package aula08.trabalho.exercicio1;

import java.util.Arrays;

public class Testes {
    //Testes ex1
    public static void main(String[] args) {
        //Cria Peças Xadrez
        PecaXadrez peaoBranco = new Peao(1,1, "branca");
        PecaXadrez peaoPreto = new Peao(1,1, "preta");
        PecaXadrez cavalo = new Cavalo(5,0);
        // Movimentos possiveis dos peoes
        // Como estou a receber uma arraylist de int[] no movPossiveis()
        // tenho de percorrer a arraylist 1 a 1 usando um for/each e imprimir
        // cada posiçao usando o Arrays.toString()
        System.out.println("Movimentos Possiveis Peao Branco");
        // mostra os 2 movimentos possiveis
        for (int[] pos : peaoBranco.movPossiveis())
        {
            System.out.println(Arrays.toString(pos));
        }
        System.out.println("Movimentos Possiveis Peao Preto");
        // Só deve mostrar um movimento possivel para nao ultrapassar os limites do tabuleiro
        for (int[] pos : peaoPreto.movPossiveis())
        {
            System.out.println(Arrays.toString(pos));
        }
        // Testa Movimentos Possiveis do cavalo
        // Só deve conseguir 4 dos 8 movimentos possiveis
        System.out.println("Movimentos Possiveis do Cavalo");
        for (int[] pos : cavalo.movPossiveis())
        {
            System.out.println(Arrays.toString(pos));
        }
    }
}
