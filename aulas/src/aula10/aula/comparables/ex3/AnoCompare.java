package aula10.aula.comparables.ex3;

import aula10.aula.comparables.Estudante;

import java.util.Comparator;

public class AnoCompare implements Comparator<Livro> {
    public int compare(Livro l1, Livro l2){
        if (l1.ano > l2.ano) {
            return -1;
        } else if (l1.ano < l1.ano) {
            return 1;
        } else {
            return 0;
        }
    }
}
