package aula08.trabalho.exercicio4;

public class Testes {
    // Testes ex4 aula 08
    public static void main(String[] args) {
        //  Crio as formas
        Forma rectangulo1 = new Rectangulo(2.0f,3.0f);
        Forma rectangulo2 = new Rectangulo(5.0f,3.0f);
        Forma quadrado = new Quadrado(2f);
        Forma circulo1 = new Circulo(2f);
        Forma circulo2 = new Circulo(4f);
        // Crio um array de formas e adiciono as formas ao array
        Forma[] arrayFormas = new Forma[5];
        arrayFormas[0] = rectangulo1;
        arrayFormas[1] = rectangulo2;
        arrayFormas[2] = quadrado;
        arrayFormas[3] = circulo1;
        arrayFormas[4] = circulo2;
        // Percorro a array e imprimo a informaçao
        for (int i = 0; i< arrayFormas.length; i++){
            System.out.println("-----------------------------------------------");
            // Informaçao de cada forma
            System.out.println(arrayFormas[i].toString());
            // Calculos de cada forma
            System.out.println("Perimetro da forma é: " + arrayFormas[i].calcularPerimetro());
            System.out.println("Area da forma é: " + arrayFormas[i].calcularArea());
        }
    }
}
