package aula11.aula;

public class Filme implements Comparable<Filme>{
    private int pontuacao;
    private String nome;

    public Filme(int pontuacao, String nome){
        this.pontuacao = pontuacao;
        this.nome= nome;
    }

    // Comparador de pontuacao
    public int compareTo(Filme filme) {
        if (pontuacao == filme.pontuacao)
            return 0;
        else if (pontuacao < filme.pontuacao)
            return 1;
        else
            return -1;
    }

    @Override
    public String toString() {
        return "Pontuacao: " + pontuacao +
                " " + nome;
    }
}
