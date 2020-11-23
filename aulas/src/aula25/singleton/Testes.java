package aula25.singleton;

public class Testes {
    public static void main(String[] args) {
        Singleton a = Singleton.getInstancia();
        Singleton b = Singleton.getInstancia();
        System.out.println(a.getNome());
        System.out.println(b.getNome());
    }
}
