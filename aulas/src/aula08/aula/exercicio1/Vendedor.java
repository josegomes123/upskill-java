package aula08.aula.exercicio1;

public class Vendedor extends Funcionario {
    //Atributo
    public double comissaoBase;

    //Contructor
    public Vendedor(String nome, String codigo, double salarioBase, double comissaoBase){
        super(nome, codigo, salarioBase);
        this.comissaoBase = comissaoBase;
    }

    //Calcula o salario
    // Converte a comissao base num valor de 1-100%
    public double calculaSalario(){
        return getSalarioBase() + (getSalarioBase() * (comissaoBase/100));
    }
}
