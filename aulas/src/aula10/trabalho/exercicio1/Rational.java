package aula10.trabalho.exercicio1;

public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

    }

    // Testes Ex1
    public static void main(String[] args) {
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);
        if (r1.compareTo(r2) > 0)
            System.out.println(r1 + " is bigger than " + r2);
        else
            System.out.println(r1 + " is not bigger than " + r2);
    }

    public int getNumerator() {
        return numerator;

    }

    public int getDenominator() {
        return denominator;

    }

    @Override
    public String toString() {
        return numerator + "/" + denominator;

    }

    @Override
    public int compareTo(Rational other) {
        // Converter racionais para numeros com mesmo denominador
        // Multiplica-se o 1º num pelo denominador do 2º
        // Multiplica-se o 2º num pelo denominador do 1º
        // E com isto obtem-se fracçoes sempre com o mesmo denominador
        // Assim é so necessario comparar os numeradores para saber o maior numero racional
        int numerador1final = this.numerator * other.denominator;
        int numerador2final = other.numerator * this.denominator;
        if (numerador1final == numerador2final)
            return 0;
        else if (numerador1final > numerador2final)
            return 1;
        else
            return -1;
    }

}


