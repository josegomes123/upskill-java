package aula08.trabalho.exercicio3;

public class Testes {
    // Testes ex3
    public static void main(String[] args) {
        // Criar calculadora
        Calculadora calc = new CalculadoraCientifica();
        // Operaçoes
        calc.sum(2, 3);
        calc.sub(3, 2);;
        calc.div(22, 15);
        calc.mul(22, 33);
        calc.potencia(5, 6);
        calc.raiz(43);
    }
}
