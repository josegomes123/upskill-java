package aula06.trabalho.exercicio1;

public class Student {
    // atributos
    private int numAluno;
    private String nome;
    private String curso;

    // constructor
    public Student(int numAluno, String nome, String curso){
        this.numAluno = numAluno;
        this.nome = nome;
        this.curso = curso;
    }

    // getters e setters
    public int getNumAluno(){
        return numAluno;
    }

    public String getCurso(){
        return curso;
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        return "Aluno: " + getNome() + " Numero: " +getNumAluno() +  " Curso: " + getCurso();
    }



}
