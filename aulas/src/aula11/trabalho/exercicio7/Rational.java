package aula11.trabalho.exercicio7;


// Para os Racionais usei a classe Rational e o Comparable já implementado na Aula10 ex1 do trabalho autonomo
// Para os Alunos usei a Classe Aluno e os Comparators já implementados no Aula10 ex 2 do trabalho autonomo
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


