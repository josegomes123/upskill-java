package testemodelo1;

import java.util.Comparator;

public class ComparatorOfHighScores implements Comparator<HighScore> {


    //  Comparador
    // as maiores pontuaçoes devem ser aquelas em que o jogador venceu
    //o jogo (i.e., o atributo won e verdadeiro) ordenadas por ordem crescente do numero de movimentos,
    //seguidas das pontuacoes em que o jogador nao chegou ao fim do jogo, ordenadas por ordem
    //decrescente do numero de movimentos.

    public int compare(HighScore s1, HighScore s2) {
        // Compara quando os 2 acabam o jogo com sucesso
        if (s1.getWon() && s2.getWon()) {
            if (s1.getMovements() == s2.getMovements())
                return 0;
            // O que fizer menos movimentos primeiro
            else if (s1.getMovements() > s2.getMovements())
                return 1;
            else
                return -1;
            // Se um tiver ganho e o outro nao, passar para baixo ou para cima  conforme a situaçao
        } else if (s1.getWon() && !s2.getWon()) {
                return -1;
        } else if (!s1.getWon() && s2.getWon()) {
            return 1;
        } else {
            // Quando os 2 perdem o jogo
            if (s1.getMovements() == s2.getMovements())
                return 0;
            // Ordena no sentido contrario, quantos menos movimentos, mais para baixo vai
            else if (s1.getMovements() > s2.getMovements())
                return -1;
            else
                return 1;
        }

    }

    @Override
    public Comparator<HighScore> reversed() {
        return null;
    }
}