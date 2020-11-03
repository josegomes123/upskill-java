package aula11.trabalho.exercicio2;

public class Eletrodomestico {
    private String tipo;
    private String marca;
    private int potencia;

    public Eletrodomestico(String tipo, String marca, int potencia){
        this.tipo = tipo;
        this.marca = marca;
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return tipo + " / " + marca + " / " + potencia;
    }
}
