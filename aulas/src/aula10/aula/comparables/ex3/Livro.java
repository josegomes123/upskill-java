package aula10.aula.comparables.ex3;

public class Livro {
    String nome;
    int ano;
    String editora;
    String autor;

    public Livro(String nome, String editora, int ano, String autor){
        this.nome = nome;
        this.editora = editora;
        this.ano = ano;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", ano=" + ano +
                ", editora='" + editora + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
