package aula08.trabalho.exercicio2;

public class ContaPoupanca extends ContaBancaria {
    private double taxaRendimento;

    public ContaPoupanca(int senha, String numero, double saldo, double taxaRendimento) {
        super(senha, numero, saldo);
        this.taxaRendimento = taxaRendimento;
    }

    //Getters e Setters
    public double getTaxaRendimento() {
        return taxaRendimento;
    }
    public void setTaxaRendimento(double taxaRendimento) {
        this.taxaRendimento = taxaRendimento;
    }

    // Levanta valor da conta
    public void levanta(double valor) {
        double saldoActual = getSaldo();
        // Testa se a conta tem dinheiro suficiente para fazer o levantamento
        if (saldoActual - valor < 0) {
            System.out.println("Erro! A sua conta não tem dinheiro suficiente para fazer este levantamento");
        } else {
            setSaldo(saldoActual - valor);
            System.out.println("Fez um levantamento de " + valor + "€ com sucesso!");
        }
    }

    // Deposita valor na conta
    public void deposita(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Fez um depósito de " + valor + "€ com sucesso!");
    }

    // Imprime o extracto da conta na consola
    public void tiraExtracto(){
        System.out.println("Tipo de conta: Conta Poupanca");
        System.out.println("Numero de conta: "+ getNumero());
        System.out.println("Saldo da conta: " + getSaldo() + "€");
        System.out.println("Taxa de rendimento da conta: " + taxaRendimento + "%");
    }


}
