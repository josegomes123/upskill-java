package aula13.exercicio4;

public class Lampada {
    private int potencia;

    public Lampada(int potencia){
        this.potencia = potencia;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    @Override
    public String toString() {
        return "Potência: " + potencia + " Watts";
    }
}
