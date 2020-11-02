package aula10.aula.comparables;

import java.util.Comparator;

public class NomeCompare implements Comparator<Estudante> {
    public int compare(Estudante s1, Estudante s2){
        return s1.nome.compareTo(s2.nome);
    }
}