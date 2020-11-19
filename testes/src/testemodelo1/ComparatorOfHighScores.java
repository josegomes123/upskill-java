package testemodelo1;

import java.util.Comparator;

public class ComparatorOfHighScores implements Comparator<HighScore> {


    // Só ordena os com Won(true) correctamente, nao é possivel ordenar por mais que um atributo ao mesmo tempo
    // sem usar vários comparadores dentro uns dos outros segundo:
    // https://www.codejava.net/java-core/collections/sorting-a-list-by-multiple-attributes-example

    public int compare(HighScore s1, HighScore s2) {
        if (s1.getWon()) {
            if (s1.getMovements() == s2.getMovements() && s1.getWon()== s2.getWon())
                return 0;
            else if (s1.getMovements() > s2.getMovements() && s1.getWon()== s2.getWon())
                return 1;
            else
                return -1;
        } else {
            return -1;
        }

    }

    @Override
    public Comparator<HighScore> reversed() {
        return null;
    }
}