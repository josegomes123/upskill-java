package aula25.command;

public class TV implements AparelhoEletronico{
    private int volume;

    public void on(){
        System.out.println("TV Ligada");
    }

    public void off(){
        System.out.println("TV Desligada");
    }

    public void aumentarVolume(){
        volume++;
        System.out.println("O volume está a "+ volume);
    }

    public void diminuirVolume(){
        volume--;
        System.out.println("O volume está a "+ volume);
    }
}
