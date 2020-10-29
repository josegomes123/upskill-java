package aula08.aula.exercicio1;

public class Assistente extends Funcionario {
    // Constructor
    public Assistente(String nome, String codigo, double salarioBase){
        super(nome, codigo, salarioBase);
    }

    // Funcoes
    public double calculaSalario(){
        return getSalarioBase();
    }
}

