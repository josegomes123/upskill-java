package aula08.trabalho.exercicio4;

public class Quadrado extends Rectangulo {

    // Constructor com lado de comprimentos iguais
    public Quadrado(float lado){
        super(lado,lado);
    }

    @Override
    public String toString() {
        return "Quadrado{" +
                "lado=" + super.getLado() + "} ";
    }
}
