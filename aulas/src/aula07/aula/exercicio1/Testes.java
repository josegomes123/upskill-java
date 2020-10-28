package aula07.aula.exercicio1;

import java.util.ArrayList;

public class Testes {
    // Testes Ex1 da aula 07

    public static void main(String[] args) {
        // Criei uma ArrayList para guardar os trabalhadores (nao criei classe Empresa nem várias empresas)
        // ArrayList permite manipulaçao dos dados mais facilmente e tem os metodos
        // add() e remove()
        ArrayList<Empregados> listaTrabalhadores = new ArrayList<Empregados>();

        //Crio diferentes trabalhadores
        Empregados empregado1 = new Empregados("Andre");
        GerentesDeLoja gerenteDeLoja1 = new GerentesDeLoja("Ricardo");
        GerentesDeLoja gerenteDeLoja2 = new GerentesDeLoja("Maria");
        DirectoresRegionais directorRegional1 = new DirectoresRegionais("Abilio");
        //Adiciono os trabalhadores à lista
        listaTrabalhadores.add(empregado1);
        listaTrabalhadores.add(gerenteDeLoja1);
        listaTrabalhadores.add(gerenteDeLoja2);
        listaTrabalhadores.add(directorRegional1);

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
        // Uso um iterador (for-each) para percorrer a ArrayList e imprimir trabalhadores 1 a 1
        // Podem consultar mais sobre for-each no link abaixo
        // https://stackoverflow.com/questions/85190/how-does-the-java-for-each-loop-work
        System.out.println("Lista de Trabalhadores criados");
        for (Empregados empregado : listaTrabalhadores ){
            System.out.println(empregado.toString());
        }

    }
}
