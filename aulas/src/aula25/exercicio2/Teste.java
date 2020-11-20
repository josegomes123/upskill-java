package aula25.exercicio2;

public class Teste {

    public static void main(String[] args) {
        //Crio objectos com o tipo
        Pair<String, Integer> pair = new Pair<String, Integer>("testeString", 12);
        System.out.println(pair.getTipo1());
        System.out.println(pair.getTipo2());
        pair.setTipo1("TESTEAGAIN");
        System.out.println(pair.getTipo1());

    }
}
