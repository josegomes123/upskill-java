package aula11.trabalho.exercicio2e3;

public class Testes {
    // Testes ex2 aula 11
    public static void main(String[] args) {
        // Crio electrodomesticos todos
        Eletrodomestico microondas = new Eletrodomestico("Microoodas", "Bosch", 2000);
        Eletrodomestico frigorifico = new Eletrodomestico("Frigorifico", "Bosch", 300);
        Eletrodomestico fogao = new Eletrodomestico("Fogao", "Bosch", 600);
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
        System.out.println("----------------------------------------");
        System.out.println("HashMap completo da casa:");
        System.out.println(casa);
        // Remove marca bosch
        System.out.println("-----------------------------------------");
        System.out.println("Remove marca Bosch da cozinha:");

        // EX 3A - Método 1 (removeAll) - Remover Comentarios para testar
        //casa.removeMarca("Cozinha", "Bosch");
        //System.out.println("Electrodomesticos na cozinha:");
        //System.out.println(casa.getDivisao("Cozinha"));
        //System.out.println(casa);

        // EX 3B - Método 2 (iterator) - Remover Comentarios para testar
        //casa.removeMarcaIterator("Cozinha", "Bosch");
        //System.out.println("Electrodomesticos na cozinha:");
        //System.out.println(casa.getDivisao("Cozinha"));
        //System.out.println(casa);

        // EX 3C - Método 3 (Predicate) - Remover Comentarios para testar
        casa.removeMarcaPredicate("Cozinha", "Bosch");
        System.out.println("Electrodomesticos na cozinha:");
        System.out.println(casa.getDivisao("Cozinha"));
        System.out.println(casa);


        // Todos os 3 métodos acima estão muito bem explicados neste página
        // https://stackoverflow.com/a/10432084/1081088
    }
}
