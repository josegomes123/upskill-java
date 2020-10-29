package aula08.aula.exercicio1;

/*Crie uma hierarquia de classes para representar os diferentes tipos de funcionários de um escritório que tem os
seguintes cargos: gerente, assistente e vendedor. Escreva uma classe base abstrata chamada Funcionário que
declara um método abstrato:
double calculaSalario()
Esta classe também deve definir os seguintes atributos: nome (tipo String), codigo de funcionário (tipo String) e
salario base (tipo double). Crie um construtor que recebe os valores a serem armazenados nos respectivos
atributos. Esta classe abstrata deverá ser estendida pelas outras classes representativas dos tipos de funcionários.
Em cada classe deve-se sobrescrever o método calculaSalario de forma que o cálculo do salário seja feito da
seguinte forma: o gerente recebe duas vezes o salário_base, o assistente recebe o salário_base e o vendedor
recebe o salário_base mais uma comissão definida no momento de inicialização.
Crie uma classe Teste com um método main que cria um objeto de cada tipo e imprime para o ecrã os salários de
cada um.*/

public abstract class Funcionario {
    private String nome;
    private String codigo;
    private double salarioBase;

    public Funcionario(String nome, String codigo, double salarioBase){
        this.nome = nome;
        this.codigo =  codigo;
        this.salarioBase = salarioBase;

    }


    public abstract double calculaSalario();

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    //
    public double getSalarioBase() {
        return salarioBase;
    }
}
