package aula02;

public class aula02 {

    //Exercicios feitos durante a aula02
    public static void main(String[] args) {
        // ex1 - testes
        System.out.println("Soma dos multiplos de a, b e c");
        System.out.println(sumMult(1, 2, 3));
        // ex2 - testes
        System.out.println("Area do circulo com raio r");
        System.out.println(circleArea(2));
        // ex3 - testes
        System.out.println("Conversao Celsius para F");
        System.out.println(celsiusToF(0));
    }

    // 1. Soma dos multiplos de a, b e c
    static int sumMult(int a, int b, int c) {
        return (a + b) * c;
    }

    // 2. Area do circulo com raio r
    static double circleArea(int r) {
        return Math.PI * (r * r);
    }

    // 3. Converte Celsius para Fahrenheit
    static double celsiusToF(int a) { // test
        return a * 1.8 + 32;
    }


}
