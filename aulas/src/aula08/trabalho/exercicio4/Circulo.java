package aula08.trabalho.exercicio4;

public class Circulo extends Forma {
    // Atributos
    private float raio;

    // Constructor
    public Circulo(float raio){
        this.raio = raio;
    }

    // Calculos das formas
    public float calcularArea(){
        return (float) Math.pow(Math.PI*raio, 2);
    }

    public float calcularPerimetro(){
        return (float) (2*Math.PI*raio);
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                "} ";
    }
}
