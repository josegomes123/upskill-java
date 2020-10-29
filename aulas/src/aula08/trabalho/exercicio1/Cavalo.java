package aula08.trabalho.exercicio1;

import java.util.ArrayList;

public class Cavalo extends PecaXadrez {

    // Contructor
    public Cavalo(int x, int y) {
        super(x, y);
    }


    // Coordenadas que estou a usar
    // 8
    // 7
    // 6     x     x
    // 5  x           x  <- mov possiveis
    // 4        ()   <- cavalo
    // 3  x           x
    // 2     x     x
    // 1  2  3  4  5  6  7  8

    // Movimentos Possiveis
    // 2 cima 1 direita
    // 2 cima 1 esquerda
    // 2 direita 1 cima
    // 2 direita 1 baixo
    // 2 baixo 1 direita
    // 2 baixo 1 esquerda
    // 2 esquerda 1 baixo
    // 2 esquerda 1 cima

    public ArrayList<int[]> movPossiveis() {
        // Obtem posicao da peca e separa em coordenada
        int[] pos = getPosicao();
        int x = pos[0];
        int y = pos[1];
        //Cria lista para guardar movimentos possiveis
        ArrayList<int[]> possiveis = new ArrayList<int[]>();
        // Movimentos Possiveis Cavalo
        // Testa se os movimentos possiveis nao ultrapassam os limites do tabuleiro
        // 2 cima 1 direita
        if ((y + 2 <= maxY()) && (x + 1 <= maxX())) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x + 1;
            mov[1] = y + 2;
            possiveis.add(mov);
        } // 2 cima 1 esquerda
        if ((y + 2 <= maxY()) && (x - 1 >= 0)) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x - 1;
            mov[1] = y + 2;
            possiveis.add(mov);
        } // 2 direita 1 cima
        if ((y + 1 <= maxY()) && (x + 2 <= maxX())) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x + 2;
            mov[1] = y + 1;
            possiveis.add(mov);
        } // 2 direita 1 baixo
        if ((y - 1 >= 0) && (x + 2 <= maxX())) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x + 2;
            mov[1] = y - 1;
            possiveis.add(mov);
        } // 2 baixo 1 direita
        if ((y - 2 >= 0) && (x + 1 <= maxX())) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x + 1;
            mov[1] = y - 2;
            possiveis.add(mov);
        } // 2 baixo 1 esquerda
        if ((y - 2 >= 0) && (x - 1 >= 0)) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x - 1;
            mov[1] = y - 2;
            possiveis.add(mov);
        } // 2 esquerda 1 baixo
        if ((y - 1 >= 0) && (x - 2 >= 0)) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x - 2;
            mov[1] = y - 1;
            possiveis.add(mov);
        } // 2 esquerda 1 cima
        if ((y + 1 <= maxY() ) && (x - 2 >= 0)) {
            //Cria vector para guardar cada movimento
            int[] mov = new int[2];
            mov[0] = x - 2;
            mov[1] = y + 1;
            possiveis.add(mov);
        }
        return possiveis;
    }
}
