package aula08.aula.exercicio1;

public class Gerente extends Funcionario {

    //Constructor
    public Gerente(String nome, String codigo, double salarioBase){
        super(nome, codigo, salarioBase);
    }

    // Calcula Salario gerente
    public double calculaSalario(){
        return getSalarioBase()*2;
    }
}
