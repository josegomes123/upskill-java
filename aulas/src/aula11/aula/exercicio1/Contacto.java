package aula11.aula.exercicio1;

public class Contacto {
    private String nome;
    private int numTel;
    private String email;

    public Contacto(String nome, int numTel, String email) {
        this.nome = nome;
        this.numTel = numTel;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public int getNumTel() {
        return numTel;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return nome + " - " + " - " + numTel + " - " + email;
    }
}
