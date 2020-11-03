package aula11.trabalho.exercicio2;

public class Testes {

    public static void main(String[] args) {
        Eletrodomestico microondas = new Eletrodomestico("Microoodas", "Marca1", 2000);
        Eletrodomestico frigorifico = new Eletrodomestico("Frigorifico", "Marca2", 300);
        Eletrodomestico fogao = new Eletrodomestico("Fogao", "Marca3", 600);
        Eletrodomestico televisao = new Eletrodomestico("Televisao", "Marca4", 20);
        Eletrodomestico alarme = new Eletrodomestico("Alarme", "Marca5", 50);
        Eletrodomestico secador = new Eletrodomestico("Secador", "Marca6", 100);
        Eletrodomestico maqBarbear = new Eletrodomestico("Máquina de Barbear", "Marca7", 500);
        Eletrodomestico arcondicionado = new Eletrodomestico("Ar Condicionado", "Marca8", 1500);
        Casa casa = new Casa();
        casa.addEletro("Cozinha", microondas);
        casa.addEletro("Cozinha", frigorifico);
        casa.addEletro("Cozinha", fogao);
        casa.addEletro("Sala", televisao);
        casa.addEletro("Sala", alarme);
        casa.addEletro("Casa de Banho", secador);
        casa.addEletro("Casa de Banho", maqBarbear);
        casa.addEletro("Corredor", arcondicionado);
        System.out.println(casa);












    }
}
