package aula25.exercicio1;

import java.io.Serializable;

public class User implements Serializable {
    private String nome;
    private String texto;
    private String titulo;


    public User(String nome, String titulo, String texto){
        this.nome = nome;
        this.titulo = titulo;
        this.texto = texto;
    }

    public String getNome() {
        return nome;
    }

    public String getTexto() {
        return texto;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public String toString() {
        return "Nome:" + nome +
                "Texto:" + texto +
                "Titulo:" + titulo;
    }
}
