package aula06.trabalho.exercicio2;

public class Musica {
    //atributos
    private String title;
    private int duration; // em segundos

    //constructor
    public Musica(String title, int duration){
        this.title = title;
        this.duration = duration;
    }

    // getters e setters
    public String getTitle(){
        return title;
    }

    public int getDuration(){
        return duration;
    }
}
