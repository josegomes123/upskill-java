package aula07.aula.Exercicio1;

/*Crie um programa que use uma lista de empregados para calcular o total dos salários a pagar de
uma cadeia de lojas. A lista de empregados deve conter empregados (sem especialização),
gerentes de loja e diretores regionais. Para cada classe de empregados, o salário é calculado da
seguinte maneira:
● Empregados: valor fixo de 800€;
● Gerente de loja: valor fixo igual ao dos empregados sem especialização, acrescido de um
prémio de 200€ que é atribuído sempre que a loja cumpre os objectivos das vendas.
● Diretor regional: valor fixo igual ao dobro do dos empregados sem especialização, acrescido
de um prémio que corresponde a 1% do lucro mensal nas lojas da região.
Nota: para simplificar, considere que ter cumprido ou não os objectivos de vendas é um atributo
dos gerentes e que o lucro mensal da região é um atributo dos diretores. */

public class Empregados {
    // Atributos
    private String nome;
    private double salario;

    // Constructor
    public Empregados(String nome){
        this.nome = nome;
    }

    // Empregado tem salario de 800 sempre
    public void calcularSalario(){
        this.salario = 800.0;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    @Override
    public String toString() {
        return "Nome Empregado: " + nome + " Salario: " + salario;
    }
}
