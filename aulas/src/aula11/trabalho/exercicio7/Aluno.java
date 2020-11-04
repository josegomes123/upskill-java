package aula11.trabalho.exercicio7;

import java.util.Comparator;

// Para os Racionais usei a classe Rational e o Comparable já implementado na Aula10 ex1 do trabalho autonomo
// Para os Alunos usei a Classe Aluno e os Comparators já implementados no Aula10 ex 2 do trabalho autonomo
public class Aluno {
    private int num;
    private String nome;

    public Aluno(String nome, int num){
        this.num = num;
        this.nome = nome;
    }

    public int getNum() {
        return num;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return " num: " + num +
                " nome: " + nome;
    }
}
