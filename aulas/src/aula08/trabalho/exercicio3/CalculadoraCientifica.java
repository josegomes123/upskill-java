package aula08.trabalho.exercicio3;

public class CalculadoraCientifica extends Calculadora{

    public int potencia(int a, int b){
        int resultado = (int) Math.pow(a,b);
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " ^ " + b + " = " + resultado;
        System.out.println(operacao);
        return resultado;
    }
    public double raiz(int a){
        double resultado = Math.sqrt(a);
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = "√"+ a + " = " + resultado;
        System.out.println(operacao);
        return resultado;
    }
}
