package aula10.aula.comparables.ex3;

import java.util.Comparator;

public class AutorCompare implements Comparator<Livro> {
    public int compare(Livro l1, Livro l2){
        return l1.autor.compareTo(l2.autor);
    }
}