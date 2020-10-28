package aula06.trabalho.exercicio5;


/*5. Implemente a classe CreditCard cujas instâncias deverão ter um comportamento
semelhante ao do conhecido cartão. Cada instância da classe CreditCard deverá possuir,
ao ser criada, um titular, um número de 12 dígitos, um mês e ano de validade e um valor
máximo de débito autorizado. Deve também guardar o montante despendido até ao
momento e um histórico dos movimentos realizados. Por questões de simplicidade,
considere que um movimento é uma String com o valor e uma descrição (ex: “30EUR -
Bilhete de futebol”). A classe deve implementar os seguintes métodos:
a. int saldo() - devolver o saldo do cartão (diferença entre o montante gasto e o
limite de endividamento)
b. void pagarCredito(int pag) - efetuar um pagamento, isto é, abater o valor pag
ao montante em dívida
c. void gastar(int quantia, String descr) - registar um movimento e atualizar o
montante gasto
d. String obterTalao() - devolver a String que corresponde ao último movimento
realizado
e. String getMovimentos() - devolver a lista de movimentos efetuados sob a forma
de uma String*/

import java.util.Arrays;

public class CreditCard {
    //Atributos
    private String titular;
    private String numeroCartao; // Guardo em String para evitar usar Long
    private int mesVal;
    private int anoVal;
    private int maxDebit;
    private int gastos;
    private String[] movimentos;
    private int numMovimentos;

    // Constructor
    public CreditCard(String titular, String numeroCartao, int mesVal, int anoVal, int maxDebit){
        this.titular = titular;
        this.numeroCartao = numeroCartao;
        this.mesVal = mesVal;
        this.anoVal = anoVal;
        this.maxDebit = maxDebit;
        this.gastos = 0; // Inicio os gastos a 0
        this.movimentos = new String[100];
        this.numMovimentos = 0;
        // Só irá guardar 100 movimentos,
        // teriamos que usar ArrayLists para ter comprimento dinamico
    }

    //Funções

    //  devolver o saldo do cartão (diferença entre o montante gasto e o
    // limite de endividamento)
    public int saldo(){
        return maxDebit - gastos;
    }

    // void pagarCredito(int pag) - efetuar um pagamento, isto é, abater o valor pag
    //ao montante em dívida
    public void pagarCredito(int pagamento){
        // Subtraio aos gastos (valor em divida) o pagamento de crédito
        gastos -= pagamento;
    }

    // void gastar(int quantia, String descr) - registar um movimento e atualizar o
    //montante gasto, verifica tambem se o gasto é permitido
    public void gastar(int quantia, String descr){
        // Se o gasto exceder o maximo de credito, entao a transação dá erro
        if (saldo()-quantia< 0) {
            System.out.println("Crédito Insuficiente para esta transação, só tem mais " + saldo() +  "€ disponíveis.");
        } else {
            // Soma a quantia aos gastos do cartão
            gastos += quantia;
            //Usa o contador numMovimentos para introduzir a transaçao na lista e incrementa o numMovimentos
            movimentos[numMovimentos] = "Valor: " + quantia + "€ " + "Descricao: " + descr;
            numMovimentos++;
        }
    }

    //obterTalao() - devolver a String que corresponde ao último movimento realizado
    public String obterTalao(){
        //Usando o contador numMovimentos consigo aceder directamente ao ultimo movimento;
        // Indice numMovimentos-1 para aceder ao indice0 ou seja primeira compra
        return movimentos[numMovimentos-1];
    }

    //getMovimentos()
    // Decidi fazer retorno void e imprimir a lista de movimento directo na função porque torna as coisas
    // mais faceis de intender
    public void getMovimentos() {
        // Percorro a lista de movimentos e imprimo cada movimento 1 a 1
        for (int i=0; i<numMovimentos; i++){
            System.out.println(movimentos[i]);
        }
    }
}
