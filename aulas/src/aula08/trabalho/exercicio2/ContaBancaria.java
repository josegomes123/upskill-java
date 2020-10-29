package aula08.trabalho.exercicio2;


/*2. Implemente a hierarquia de classes ContaBancaria (superclasse), ContaCorrente (com
senha, número, saldo e quantidade de transações realizadas) e ContaPoupanca (com
senha, número, saldo e taxa de rendimento).
a. Quando uma ContaBancaria for criada, informe a senha da conta por
parâmetro.
b. Na classe ContaBancaria, crie os seguintes métodos abstratos:
i. Levanta(double valor)
ii. deposita(double valor)
iii. tiraExtrato()
c. Nesta mesma classe, crie o método alteraSenha, que recebe uma senha por
parâmetro e deve confirmar a senha anterior (via teclado), e somente se a
senha anterior estiver correta a senha recebida por parâmetro deve ser
atribuída.
d. Implemente os métodos abstratos nas classes ContaCorrente e
ContaPoupanca.
e. Crie os métodos de acesso ( getters ) para os atributos de ContaCorrente e
ContaPoupanca.*/


import java.util.Scanner;

public abstract class ContaBancaria {
    private int senha;
    private String numero; // para representar numero da conta com 10+ algarismos uso uma String
    private double saldo;

    public ContaBancaria(int senha, String numero, double saldo) {
        this.senha = senha;
        this.numero = numero;
        this.saldo = saldo;
    }


    // Getters e Setters
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    //Funcoes abstractas da superclasse
    public abstract void levanta(double valor);
    public abstract void deposita(double valor);
    public abstract void tiraExtracto();


    // Altera a senha para uma nova se a senha introduzida por a correcta
    public void alterarSenha(int senha) {
        // Crio Scanner para receber a senha anterior e verificar se está correcta
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Para alterar a senha precisa de confirmar a sua senha");
        System.out.println("Introduza a senha desta conta:");
        int senhaInserida = keyboard.nextInt();
        // Só troca a senha se a inserida for a que estiver activa actualmente no objecto
        if (senhaInserida == this.senha) {
            System.out.println("A sua senha foi alterada com sucesso!");
            this.senha = senha;
        } else {
            System.out.println("Introduziu a senha errada.");
            System.out.println("Nao foi possivel alterar a senha desta conta");
        }
    }



}
