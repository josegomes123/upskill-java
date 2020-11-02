package aula10.aula.comparables.ex3;

import java.util.Comparator;

public class EditoraCompare implements Comparator<Livro> {
    public int compare(Livro l1, Livro l2){
        return l2.editora.compareTo(l1.editora);
    }
}
