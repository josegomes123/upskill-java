package aula13.aula.exercicio6;

public class Reparacao {
    private String matricula;
    private String nome;
    private String item;
    private double valor;

    public Reparacao(String matricula, String nome, String item, double valor) {
        this.matricula = matricula;
        this.nome = nome;
        this.item = item;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }
    public String getMatricula() {
        return matricula;
    }
    public double getValor() {
        return valor;
    }
    public String getItem() {
        return item;
    }

    @Override
    public String toString() {
        return matricula + ';' + nome + ';' + item + ';' + valor;
    }
}
