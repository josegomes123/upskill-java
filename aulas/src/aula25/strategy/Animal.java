package aula25.strategy;

public class Animal {
    private String nome;
    private String som;
    private Voar voar;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSom(String som) {
        this.som = som;
    }

    public String getNome() {
        return nome;
    }

    public String getSom() {
        return som;
    }

    public String tentaVoar(){
        return voar.Voa();
    }

    public void setAnimalVoador(Voar voar){
        this.voar = voar;
    }
}
