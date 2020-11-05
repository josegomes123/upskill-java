package aula13.exercicio3;

//Criei uma classe Movimento acessória para ajudar a guardar os movimentos
public class Movimento {
    private String descricao;
    private double valor;

    public Movimento(String descricao, double valor){
        this.descricao = descricao;
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return  "Desc: " + descricao + " Valor: " + valor;
    }
}
