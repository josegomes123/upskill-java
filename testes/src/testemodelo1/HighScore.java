package testemodelo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class HighScore {
    private String playerName;
    private int movements;
    private boolean won;
    public HighScore(String name, int movements, boolean won) {
        this.playerName= name;
        this.movements= movements;
        this.won = won;
    }

    public int getMovements() {
        return movements;
    }

    public String getPlayerName() {
        return playerName;
    }

    public boolean getWon(){
        return won;
    }

    @Override
    public String toString() {
        return "Name:" + playerName +
                " Moves: " + movements +
                " Won: " + won;
    }


    public static void main(String[] args) {
        HighScore s1 = new HighScore("s1", 323, false);
        HighScore s2 = new HighScore("s2", 116, false);
        HighScore s3 = new HighScore("s3", 223, false);
        HighScore s4 = new HighScore("s4", 323, true);
        HighScore s5 = new HighScore("s5", 116, true);
        HighScore s6 = new HighScore("s6", 223, true);
        HighScore s7 = new HighScore("s7", 2123, true);
        HighScore s8 = new HighScore("s8", 5, false);

        ArrayList<HighScore> array = new ArrayList<>();
        array.add(s1);
        array.add(s2);
        array.add(s3);
        array.add(s4);
        array.add(s5);
        array.add(s6);
        array.add(s7);
        array.add(s8);
        ComparatorOfHighScores comparator1 = new ComparatorOfHighScores();
        Collections.sort(array, comparator1);
        System.out.println("Ordenado por pontuaçao:");
        for(HighScore s: array){
            System.out.println(s.toString());
        }

    }
}
