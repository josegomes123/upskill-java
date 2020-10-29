package aula08.trabalho.exercicio1;

import java.util.ArrayList;

public class Peao extends PecaXadrez {
    // Adicionei um atributo cor ao peao porque interessa se a peça é
    // branca ou preta com o sistema de coordenadas que usei, porque se for branca
    // anda 1 ou 2 casas para a frente (x+1) ou (x+2)
    //e se for preta anda 1 ou 2 casas para tras (x-1) ou (x-1)
    private String cor;

    // Contructor
    public Peao(int x, int y, String cor) {
        super(x, y);
        this.cor = cor;
    }

    // Coordenadas que estou a usar
    // 8
    // 7
    // 6
    // 5       x
    // 4       x   <- mov possivel
    // 3       ()  <- peao branco
    // 2
    // 1  2  3  4  5  6  7  8


    // Movimentos possíveis
    public ArrayList<int[]> movPossiveis() {
        // Obtem posicao da peca e separa em coordenada
        int[] pos = getPosicao();
        int x = pos[0];
        int y = pos[1];
        //Cria lista para guardar movimentos possiveis
        ArrayList<int[]> possiveis = new ArrayList<int[]>();
        //Se a peça for branca anda para a frente (1 ou 2 casas)
        if (cor == "branca") {
            // Testa se os movimentos possiveis nao ultrapassam os limites do tabuleiro
            if (y + 1 <= maxY()) {
                //Cria vector para guardar cada movimento
                int[] mov = new int[2];
                mov[0] = x;
                mov[1] = y + 1;
                possiveis.add(mov);
            }  // Testa se os movimentos possiveis nao ultrapassam os limites do tabuleiro
            if (y + 2 <= maxY()) {
                //Cria vector para guardar cada movimento
                int[] mov = new int[2];
                mov[0] = x;
                mov[1] = y + 2 ;
                possiveis.add(mov);
            }
            // Se a peça for preta anda para tras (1 ou 2 casas)
        } else if (cor == "preta") {
            // Testa se os movimentos possiveis nao ultrapassam os limites do tabuleiro
            if (y - 1 >= 0) {
                //Cria vector para guardar cada movimento
                int[] mov = new int[2];
                mov[0] = x;
                mov[1] = y - 1;
                possiveis.add(mov);
            }  // Testa se os movimentos possiveis nao ultrapassam os limites do tabuleiro
            if (y - 2 >= 0) {
                //Cria vector para guardar cada movimento
                int[] mov = new int[2];
                mov[0] = x;
                mov[1] = y -2;
                possiveis.add(mov);
            }
        }
        return possiveis;
    }
}
