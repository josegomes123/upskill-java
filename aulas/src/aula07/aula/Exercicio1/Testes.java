package aula07.aula.Exercicio1;

public class Testes {
    // Testes Ex1 da aula 07

    public static void main(String[] args) {
        //Crio diferentes trabalhadores
        Empregados empregado1 = new Empregados("Andre");
        GerentesDeLoja gerenteDeLoja1 = new GerentesDeLoja("Ricardo");
        GerentesDeLoja gerenteDeLoja2 = new GerentesDeLoja("Maria");
        DirectoresRegionais directorRegional1 = new DirectoresRegionais("Abilio");

        // Defino atributos para cada trabalhador
        gerenteDeLoja1.setObjectivosVendas(true);
        gerenteDeLoja2.setObjectivosVendas(false);
        directorRegional1.setLucroMensal(1300);

        //Calculo salarios para todos os trabalhadores
        empregado1.calcularSalario();
        gerenteDeLoja1.calcularSalario();
        gerenteDeLoja2.calcularSalario();
        directorRegional1.calcularSalario();

        // Imprimir lista de trabalhadores
        System.out.println("Lista de Trabalhadores criados");
        System.out.println(empregado1.toString());
        System.out.println(gerenteDeLoja1.toString());
        System.out.println(gerenteDeLoja2.toString());
        System.out.println(directorRegional1.toString());


    }
}
