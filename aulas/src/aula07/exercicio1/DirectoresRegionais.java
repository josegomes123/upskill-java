package aula07.exercicio1;

public class DirectoresRegionais extends Empregados {
    // Atributos
    private int lucroMensal;

    // Constructor
    public DirectoresRegionais(String nome){
        super(nome);
    }

    //Getters e Setters
    public void setLucroMensal(int lucroMensal) {
        this.lucroMensal = lucroMensal;
    }
    public int getLucroMensal() {
        return lucroMensal;
    }

    //  Gerente de Loja tem salario variavel conforme cumpre ou nao os objectivos de vendas
    public void calcularSalario(){
        // 1% do lucro mensal
        double percentagemLucro = 0.01 * lucroMensal;
        //  valor fixo igual ao dobro do dos empregados sem especialização, acrescido
        //de um prémio que corresponde a 1% do lucro mensal nas lojas da região.
        setSalario(1600 + percentagemLucro);

    }

    @Override
    public String toString() {
        return super.toString() + " Especializaçao: Director Regional" +
                " Lucro Mensal: " + lucroMensal;
    }
}
