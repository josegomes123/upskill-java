package aula06.trabalho.Exercicio5;


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

public class CreditCard {
    //Atributos
    private String titular;
    private int numero;
    private int mesVal;
    private int anoVal;
    private int maxDebit;
    private int gastos;
    private String[] movimentos;
    private int numMovimentos;

    // Constructor
    public CreditCard(String titular, int numero, int mesVal, int anoVal, int maxDebit){
        this.titular = titular;
        this.numero = numero;
        this.mesVal = mesVal;
        this.anoVal = anoVal;
        this.maxDebit = maxDebit;
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
    }

    // void gastar(int quantia, String descr) - registar um movimento e atualizar o
    //montante gasto, verifica tambem se o gasto é permitido
    public void gastar(int quantia, String descr){
        // Se o gasto exceder o maximo de credito, entao a transação dá erro
        if (saldo()+quantia>maxDebit) {
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
        return movimentos[numMovimentos];
    }

    //getMovimentos() - devolver a lista de movimentos efetuados sob a forma
    //de uma String*/
    public String[] getMovimentos() {
        return movimentos;
    }
}
