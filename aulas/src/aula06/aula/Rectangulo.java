package aula06.aula;

// Desenvolva uma classe para representar retângulos, tendo em conta a sua largura e comprimento.
//Os objetos retângulo deverão ser imutáveis, isto é, uma vez criado as suas dimensões não podem
//ser alteradas.
// Implemente o construtor e métodos que permitem obter o comprimento e a largura do retângulo
// Defina um método construtor adicional que cria um quadrado.
// Defina as funções que permitem obter as seguintes informações:
//■ área
//■ perímetro
//■ comprimento da diagonal
//■ se o retângulo é um quadrado

public class Rectangulo {
    // Atributos
    private int largura;
    private int comprimento;

    //constructor rectangulo
    public Rectangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    // constructor quadrado (Apenas recebe 1 lado)
    public Rectangulo(int lado){
        this.comprimento = lado;
        this.largura = lado;
    }

    // Getters
    public int getLargura(){
        return largura;
    }

    public int getComprimento(){
        return comprimento;
    }

    // Funções adicionais
    public int calculateArea(){
        return getComprimento() * getLargura();
    }

    public int calculatePerimeter(){
        return getLargura()*2 + getComprimento()*2;
    }

    // Calcula a diagonal através do teorema de pitágoras
    public double diagonal(){
        // teorema de pitagoras a = raiz (b^2 + c^2)
        // Uso Math.sqrt para fazer raiz quadrada e Math.pow para elevar num a 2
        double diagonal = Math.sqrt(Math.pow(getLargura(), 2) + Math.pow(getComprimento(), 2));
        return diagonal;
    }

    //verifica se é quadrado
    public boolean eQuadrado(){
        if (getComprimento() == getLargura()){
            return true;
        } else {
            return false;
        }
    }

    // Testes
    public static void main(String[] args) {
        // Cria Rectangulo
        Rectangulo rect = new Rectangulo(2, 3);
        // Calcula area e perimetro
        System.out.println(rect.calculateArea());
        System.out.println(rect.calculatePerimeter());
        // verifica se é quadrado
        System.out.println("É quadrado: " + rect.eQuadrado());
        // Cria Quadrado
        Rectangulo quadrado = new Rectangulo(2);
        // verifica se é quadrado
        System.out.println("É quadrado: " + quadrado.eQuadrado());
    }
}
