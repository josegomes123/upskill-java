package aula25.singleton;

public class Singleton {

    private static Singleton instancia = null;
    private String nome;

    private Singleton(){
        nome = "abc";
    }


    public static Singleton getInstancia() {
        if (instancia == null){
            instancia = new Singleton();
        }
        return instancia;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
