package aula08.trabalho.exercicio4;

public class Rectangulo extends Forma {
    // Atributos
    private float lado;
    private float altura;


    // Constructor
    public Rectangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }


    // Calculos das formas
    public float calcularArea(){
        return lado*altura;
    }

    public float calcularPerimetro(){
        return lado + lado + altura + altura;
    }

    //Para obter lado no toString do rectangulo
    public float getLado() {
        return lado;
    }

    @Override
    public String toString() {
        return "Rectangulo{" +
                "lado=" + lado +
                ", altura=" + altura +
                "} ";
    }
}
