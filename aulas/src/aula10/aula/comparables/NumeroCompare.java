package aula10.aula.comparables;

import java.util.Comparator;

public class NumeroCompare implements Comparator<Estudante> {
    public int compare(Estudante s1, Estudante s2){
        if (s1.numero < s2.numero) {
            return -1;
        } else if (s1.numero > s2.numero) {
            return 1;
        } else {
            return 0;
        }
    }
}
