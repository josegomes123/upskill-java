package aula10.aula.comparables.ex3;

import java.util.Comparator;

public class NomeCompare implements Comparator<Livro> {
    public int compare(Livro l1, Livro l2) {
        return l1.nome.compareTo(l2.nome);
    }
}
