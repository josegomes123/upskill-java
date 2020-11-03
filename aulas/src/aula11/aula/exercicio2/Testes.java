package aula11.aula.exercicio2;

import java.util.HashMap;

public class Testes {

    public static void main(String[] args) {
        HashMap<String, Carro> mapaCarros = new HashMap<String, Carro>();

        // Criar Carros
        Carro carro1 = new Carro("34-AA-64", "Seat", 1999);
        Carro carro2 = new Carro("24-BB-23", "Nissan", 2009);
        Carro carro3 = new Carro("87-DS-53", "Mercedes", 2001);
        Carro carro4 = new Carro("12-JA-12", "Mercedes", 2006);
        Carro carro5 = new Carro("53-KT-07", "Citroen", 2003);
        //Adiciona o carro ao hash
        mapaCarros.put(carro1.getMatricula(), carro1);
        mapaCarros.put(carro2.getMatricula(), carro2);
        mapaCarros.put(carro3.getMatricula(), carro3);
        mapaCarros.put(carro4.getMatricula(), carro4);
        mapaCarros.put(carro5.getMatricula(), carro5);
        // Imprime mapa de carros
        System.out.println(mapaCarros);
        System.out.println("Devolve o carro 2");
        System.out.println(mapaCarros.get("24-BB-23"));


    }
}
