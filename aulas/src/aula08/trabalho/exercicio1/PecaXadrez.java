package aula08.trabalho.exercicio1;

import java.util.ArrayList;

public abstract class PecaXadrez {
    // Atributo, um vector de dimensao 2, com coordenadas x e y de posiçao
    private int[] posicao;

    // Constructor
    public PecaXadrez(int x, int y){
        posicao = new int[2];
        posicao[0]= x;
        posicao[1]= y;
    }

    // Uso uma arrayList para guardar um conjunto de int[] que representam cada uma posiçao
    // ArrayList é o mais facil de manipular neste caso
    public abstract ArrayList<int[]> movPossiveis();


    // Obtem a posicao maxima num tabuleiro
    // Para evitar que as peças ultrapassem os limites do tabuleiro
    public int maxX(){
        return 8;
    }
    public int maxY(){
        return 8;
    }

    // Retorna a posiçao da peça
    public int[] getPosicao() {
        return posicao;
    }
}
