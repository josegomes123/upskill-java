package aula02;

public class aula02 {

    public static void main(String[] args) {

    }

    // Soma dos multiplos de a, b e c
    static int sumMult(int a, int b, int c) {
        return (a + b) * c;
    }

    // Area do circulo com raio r
    static double circleArea(int r) {
        return Math.PI * (r * r);
    }

    //Converte Celsius para Fahrenheit
    static int celsiusToF(int a) { // test
        return a * 2 + 30;
    }

    //Soma dos inteiros a e b
    static int soma(int a, int b) {
        return a + b;
    }

    //Quadrado de um numero a
    static int quadrado(int a) {
        return a * a;
    }

    // Diferença entre dois numeros inteiros
    static int diff(int a, int b) {
        return a - b;
    }

    // Área Rectangulo com 2 lados
    static int areaRect(int ladoA, int ladoB) {
        return ladoA * ladoB;
    }

    // Converte temperatura C (tempC) para Kelvin
    static double celsiusToKelvin(int tempC) {
        return tempC + 273.15;
    }

    // Converte a de cm para Inch
    static double cmToInch(int a) {
        return a * 0.393;
    }

    // Calcula IVA
    static double iva(int a) {
        return (double) 0.23 * a;
    }

    // Arredonda um numero a
    static int arredondar(double a) {
        return (int) Math.round(a);
    }





}
