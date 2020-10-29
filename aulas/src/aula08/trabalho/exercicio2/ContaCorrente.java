package aula08.trabalho.exercicio2;

public class ContaCorrente extends ContaBancaria {
    private int numTransacoes;

    public ContaCorrente(int senha, String numero, double saldo) {
        super(senha, numero, saldo);
        this.numTransacoes = 0;
    }

    // Getter
    public int getNumTransacoes() {
        return numTransacoes;
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
            // Incrementa as transaçoes se teve sucesso
            this.numTransacoes++;
        }
    }

    // Deposita valor na conta
    public void deposita(double valor) {
        setSaldo(getSaldo() + valor);
        System.out.println("Fez um depósito de " + valor + "€ com sucesso!");
        // Incrementa as transaçoes se teve sucesso
        this.numTransacoes++;
    }

    // Imprime o extracto da conta na consola
    public void tiraExtracto(){
        System.out.println("Tipo de conta: Conta Corrente");
        System.out.println("Numero de conta: "+ getNumero());
        System.out.println("Saldo da conta: " + getSaldo() + "€");
        System.out.println("Numero de Transaçoes Realizadas: " + numTransacoes);
    }


}
