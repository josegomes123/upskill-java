package aula25.strategy;

public class Testes {
    public static void main(String[] args) {
        Animal cao = new Cao();
        Animal passaro = new Passaro();
        System.out.println("O cao tenta voar: " + cao.tentaVoar());
        System.out.println("O passaro tenta voar: " + passaro.tentaVoar());
    }
}
