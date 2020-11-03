package aula11.aula.exercicio2;

public class Carro {
    private String matricula;
    private String marca;
    private int anoVenda;

    public Carro(String matricula, String marca, int anoVenda){
        this.matricula = matricula;
        this.marca = marca;
        this.anoVenda = anoVenda;
    }

    public String getMatricula() {
        return matricula;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "matricula='" + matricula + '\'' +
                ", marca='" + marca + '\'' +
                ", anoVenda=" + anoVenda +
                '}';
    }
}
