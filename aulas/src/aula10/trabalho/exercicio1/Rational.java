package aula10.trabalho.exercicio1;

public class Rational implements Comparable<Rational> {
    private int numerator;
    private int denominator;

    public Rational(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;

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
        //int numerador1final =
        return 0;

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

}


