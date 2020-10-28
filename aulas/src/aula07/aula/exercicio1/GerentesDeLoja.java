package aula07.aula.exercicio1;

public class GerentesDeLoja extends Empregados {
    private Boolean objectivosVendas;
    // Considerado como atributo boolean para verificar se cumpriu ou nao objectivos de vendas

    // Constructor
    public GerentesDeLoja(String nome){
        super(nome);
    }

    public Boolean getObjectivosVendas() {
        return objectivosVendas;
    }
    public void setObjectivosVendas(Boolean objectivosVendas) {
        this.objectivosVendas = objectivosVendas;
    }

    //  Gerente de Loja tem salario variavel conforme cumpre ou nao os objectivos de vendas
    public void calcularSalario(){
        if (objectivosVendas == true) {
            setSalario(1000.0);
        } else { // Se nao cumpre os objectivos de vendas usa o calculo de salario de empregado base
            super.calcularSalario();
        }

    }

    @Override
    public String toString() {
        return super.toString() + " Especializaçao: Gerente De Loja " +
                " Cumpriu Objectivos: " + objectivosVendas;
    }
}
