package aula06.trabalho.exercicio2;

//2. Pretende-se desenvolver um programa que simula uma playlist de músicas. A cada
//música está associado o título e a duração da mesma. A playlist guarda uma lista de
//músicas e deverá permitir as seguintes operações:
//a. mostrar a lista de músicas atualmente na playlist
//b. acrescentar ou retirar músicas à playlist
//c. calcular a duração total de todas as músicas contidas na playlist

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Playlist {
    private ArrayList<Musica> listaDeMusicas;
    // Usei ArrayList neste caso porque é uma estructura que permite adicionar
    // e remover elementos da lista com operações já existentes e muito mais facilmente,
    // uma boa referencia para perceber como funciona e as diferenças é
    // https://beginnersbook.com/2013/12/java-arraylist/#arraylist-vs-array
    private String nome;


    // Constructor playlist
    public Playlist(String nome){
        this.listaDeMusicas = new ArrayList<Musica>();
        this.nome = nome;
    }


    // Mostra a lista de musicas adicionadas
    public void mostrarMusicas(){
        // For para iterar uma ArrayList, usando size() para obter dimensao e get() para obter o elemento
        for (int i = 0; i < listaDeMusicas.size(); i++) {
            // Imprime cada musica na posicao i da lista
            System.out.println(listaDeMusicas.get(i).getTitle());
        }
    }


    // Add e remove musicas
    public void adicionarMusica(Musica musica){
        listaDeMusicas.add(musica); // utilizei add() que é uma das ArrayLists
    }

    public void removerMusica(Musica musica){
        listaDeMusicas.remove(musica); // utilizei remove() que é uma das ArrayLists
    }

    //Calcula duracao total em segundos
    public int calcDuration(){
        int tempoTotal = 0;
        // percorre lista e adiciona duração de cada musica ao tempo total
        for (int i = 0; i < listaDeMusicas.size(); i++) {
            tempoTotal = tempoTotal + listaDeMusicas.get(i).getDuration();
        }
        return tempoTotal;
    }




}
