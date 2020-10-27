package aula06.trabalho.exercicio3;


//3. Implemente a classe Calculator. O objeto calculadora deve ser capaz de realizar os
//cálculos matemáticos comuns de uma calculadora normal:
//a. Soma
//b. Subtração
//c. Multiplicação
//d. Divisão
//e. Potência
//f. Resto da divisão
//g. Fórmula resolvente
//h. A calculadora possui ainda um história das operações realizadas, armazenadas
//em formato String num vetor. Desenvolva as funções necessárias para:
//i. guardar o histórico no vetor
//ii. obter o histórico completo
//iii. obter as últimas operações realizadas pela calculadora (histórico
//parcial)


public class Calculator {
    //atributo
    private String[] historico;
    private int currentOps; // Num de operaçoes actualmente guardadas

    // Constructor
    public Calculator(){
        this.historico = new String[100];
        this.currentOps = 0;
        // Só irá armazenar 100 operações, teriamos que usar ArrayList ou outra
        // estructura de dados para conseguir aumentar o tamanho da lista conforme necessário
    }

    // Adicionar operaçao ao Historico
    public void addHistory(String op){
        //Usando o contador currentOps metemos a operaçao no indice certo
        historico[currentOps] = op;
        currentOps++;
    }

    // Obter Historico total
    public void getHistory(){
        System.out.println("Histórico Total de Operações:");
        for (int i=0; i<currentOps; i++){
            System.out.println("Operação " + i + ": " + historico[i] );
        }
    }

    // Obter Historico parcial (Ultimas 3 Operações)
    public void getPartHistory(){
        // Percorremos a array de forma inversa (do fim para o inicio)
        // mas só as ultimas 3 posições
        System.out.println("Ultimas 3 Operações registadas:");
        for (int i=currentOps-1; i>=currentOps-3; i--){
            System.out.println(historico[i]);
        }
    }

    // Calculos
    public int sum(int a, int b){
        int resultado = a + b;
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " + " + b + " = " + resultado;
        addHistory(operacao);
        return resultado;
    }
    public int sub(int a, int b){
        int resultado = a-b;
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " - " + b + " = " + resultado;
        addHistory(operacao);
        return resultado;
    }
    public int mul(int a, int b){
        int resultado = a*b;
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " x " + b + " = " + resultado;
        addHistory(operacao);
        return resultado;
    }
    public double div(int a, int b){
        double resultado = (double) a/b;
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " / " + b + " = " + resultado;
        addHistory(operacao);
        return resultado;
    }
    public int pot(int a, int b){
        int resultado = (int) Math.pow(a,b);
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " ^ " + b + " = " + resultado;
        addHistory(operacao);
        return resultado;
    }
    public int rem(int a, int b){
        int resultado = a%b;
        // Converto a operacao e resultado numa string para guardar no vector
        String operacao = a + " % " + b + " = " + resultado;
        addHistory(operacao);
        return resultado;
    }


    public String resolvente(int a, int b, int c){
        double x = (-b+Math.sqrt((4*a*c)))/(2*a);
        double y = (-b-Math.sqrt((4*a*c)))/(2*a);
        String operacao = "x=" + x + " V x=" + y;
        addHistory(operacao);
        return operacao;
    }

    // Testes
    public static void main(String[] args) {
        // Criar calculadora
        Calculator calc = new Calculator();
        // Adicionar operaçoes
        calc.sum(2,3);
        calc.sub(3,2);
        calc.resolvente(1,4,2);
        calc.div(22,15);
        calc.mul(22,33);
        calc.pot(5,6);
        // Obter historico total
        calc.getHistory();
        // Obter resultado Parcial
        calc.getPartHistory();
    }

}
