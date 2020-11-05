package aula13.exercicio1;

public class Pessoa {
    private int idade;
    private String nome;
    private String local;

    public Pessoa(String nome, int idade, String local) {
        this.nome = nome;
        this.idade = idade;
        this.local = local;
    }

    @Override
    public String toString() {
        return " nome:" + nome + "idade:" + idade + " local:" + local;
    }
}
