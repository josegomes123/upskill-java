package aula10.trabalho.exercicio2;

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
