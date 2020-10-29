package aula08.trabalho.exercicio3;

/*3. Crie uma classe calculadora. Esta classe deve ser abstrata e implementar as operações
básicas (soma, subtração, divisão e multiplicação). Utilizando o conceito de herança
crie uma classe chamada calculadora científica que implementa os seguintes cálculos:
raiz quadrada e a potência. Dica : utilize a classe Math do pacote java.lang.*/

public abstract class Calculadora {

    // Constructor vazio
    public Calculadora() {
    }

    // Operacoes base.
    // Imprime os resultados no ecran mas tambem devolve como
    //  retorno se quisermos usar as operaçoes umas dentro de outras
    public int sum(int a, int b) {
        int resultado = a + b;
        // Converto a operacao e resultado numa string para imprimir
        String operacao = a + " + " + b + " = " + resultado;
        System.out.println(operacao);
        return resultado;
    }

    public int sub(int a, int b) {
        int resultado = a - b;
        // Converto a operacao e resultado numa string para imprimir
        String operacao = a + " - " + b + " = " + resultado;
        System.out.println(operacao);
        return resultado;
    }

    public int mul(int a, int b) {
        int resultado = a * b;
        // Converto a operacao e resultado numa string para imprimir
        String operacao = a + " x " + b + " = " + resultado;
        System.out.println(operacao);
        return resultado;
    }

    public double div(int a, int b) {
        double resultado = (double) a / b;
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " / " + b + " = " + resultado;
        System.out.println(operacao);
        return resultado;
    }

    public int rem(int a, int b) {
        int resultado = a % b;
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " % " + b + " = " + resultado;
        System.out.println(operacao);
        return resultado;
    }


    //Operacoes abstractas
    public abstract double raiz(int a);
    public abstract int potencia(int a, int b);


}
