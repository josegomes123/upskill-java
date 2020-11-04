package aula11.trabalho.exercicio7;


import java.util.Comparator;

public class NomeCompare implements Comparator<Aluno> {
    public int compare(Aluno aluno1, Aluno aluno2) {
        return aluno1.getNome().compareTo(aluno2.getNome());
    }
}

