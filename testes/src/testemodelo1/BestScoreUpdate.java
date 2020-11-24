package testemodelo1;

import java.io.*;
import java.util.Collections;
import java.util.List;

public class BestScoreUpdate {


    // Funcao atira as exceçoes dadas para "cima", para a funcao que as chamou
    public static void bestScoreUpdate(HighScore score, List<HighScore> highscores) throws FileNotFoundException, IOException {
        String filename = "HS FILE NAME";
        // Se for Highscore (usa uma funçao adicional)
        if (checkifHighScore(score, highscores)) {
            // Adiciona à lista e ordena
            highscores.add(score);
            ComparatorOfHighScores comparator = new ComparatorOfHighScores();
            Collections.sort(highscores, comparator);
            // Escreve no ficheiro actualizado
            File file = new File(filename);
            // Utiliza o println do PrintStream que permite imprimir linha a linha
            PrintStream writer = new PrintStream(file);
            int i = 0;
            //Percorre a lista
            for (HighScore s : highscores) {
                // Assim só vai imprimir os 10 primeiros resultados da lista
                if (i >= 10) {
                    break;
                } else {
                    // Escreve a linha no ficheiro
                    writer.println(s.toString());
                    i++;
                }
            }
        }
    }


    // Verifica se um score qualifica pra ser highscore
    public static boolean checkifHighScore(HighScore score, List<HighScore> highscores) {
        // Se houver menos que 10 highscores na lista, entao qualquer resultado é um highscore
        if (highscores.size()<10) {
            return true;
        }
        // Só percorrer as 10 primeiras posiçoes na lista
        for (int i = 0; i < 10; i++) {
            // Se tiver menos movimentos que qualquer um no top 10, entao é highscore, retorna true
            if (score.getMovements() < highscores.get(i).getMovements()) {
                return true;
            }
        }
        return false;
    }
}
