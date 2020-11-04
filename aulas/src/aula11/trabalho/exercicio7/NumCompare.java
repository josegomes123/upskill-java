package aula11.trabalho.exercicio7;


import java.util.Comparator;

public class NumCompare implements Comparator<Aluno> {
    public int compare(Aluno aluno1, Aluno aluno2) {
        if (aluno1.getNum() > aluno2.getNum()) {
            return 1;
        } else if (aluno1.getNum() < aluno2.getNum()) {
            return -1;
        } else {
            return 0;
        }
    }
}

