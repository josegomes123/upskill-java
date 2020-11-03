package aula11.trabalho.exercicio2;

public class Testes {
    // Testes ex2 aula 11
    public static void main(String[] args) {
        // Crio electrodomesticos todos
        Eletrodomestico microondas = new Eletrodomestico("Microoodas", "Marca1", 2000);
        Eletrodomestico frigorifico = new Eletrodomestico("Frigorifico", "Marca2", 300);
        Eletrodomestico fogao = new Eletrodomestico("Fogao", "Marca3", 600);
        Eletrodomestico televisao = new Eletrodomestico("Televisao", "Marca4", 20);
        Eletrodomestico alarme = new Eletrodomestico("Alarme", "Marca5", 50);
        Eletrodomestico secador = new Eletrodomestico("Secador", "Marca6", 100);
        Eletrodomestico maqBarbear = new Eletrodomestico("Máquina de Barbear", "Marca7", 500);
        Eletrodomestico arcondicionado = new Eletrodomestico("Ar Condicionado", "Marca8", 1500);
        // Crio casa e adiciono eletrodomesticos à casa
        Casa casa = new Casa();
        casa.addEletro("Cozinha", microondas);
        casa.addEletro("Cozinha", frigorifico);
        casa.addEletro("Cozinha", fogao);
        casa.addEletro("Sala", televisao);
        casa.addEletro("Sala", alarme);
        casa.addEletro("Casa de Banho", secador);
        casa.addEletro("Casa de Banho", maqBarbear);
        casa.addEletro("Corredor", arcondicionado);
        // Imprime divisoes 1 a 1
        System.out.println("Electrodomesticos na cozinha:");
        System.out.println(casa.getDivisao("Cozinha"));
        // Imprime divisoes 1 a 1
        System.out.println("Electrodomesticos na sala:");
        System.out.println(casa.getDivisao("Sala"));
        // Imprime divisoes 1 a 1
        System.out.println("Electrodomesticos na Casa de Banho:");
        System.out.println(casa.getDivisao("Casa de Banho"));
        // Imprime divisoes 1 a 1
        System.out.println("Electrodomesticos no Corredor:");
        System.out.println(casa.getDivisao("Corredor"));
        // imprimo o hashmap da casa completa
        System.out.println("---------------------------");
        System.out.println("HashMap completo da casa:");
        System.out.println(casa);

    }
}
