package aula08.trabalho.exercicio2;

public class Testes {
    //Testes ex2

    public static void main(String[] args) {
        //Criar conta
        ContaBancaria contaPoupanca1 = new ContaPoupanca(1234,"5315123123161", 1000,5.0);
        ContaBancaria contaCorrente1 = new ContaCorrente(0000,"9993443473413", 50);

        // Faz operaçoes na conta corrente e tira extracto
        //Deve dar erro por nao ter dinheiro
        contaCorrente1.levanta(100.0);
        contaCorrente1.deposita(300.0);
        contaCorrente1.levanta(100.0);
        contaCorrente1.levanta(37.0);
        System.out.println("-------------------------------");
        contaCorrente1.tiraExtracto();
        System.out.println("-------------------------------");
        //Faz alteracoes na conta poupanca e tira extracto
        contaPoupanca1.deposita(6000.0);
        System.out.println("-------------------------------");
        contaPoupanca1.tiraExtracto();
        System.out.println("-------------------------------");
        //Tenta alterar Senha da conta 1
        contaCorrente1.alterarSenha(4444);
    }
}
