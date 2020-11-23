package aula25.strategy;

public class Passaro extends Animal{
    public Passaro(){
        super();
        setAnimalVoador(new Voa());
        tentaVoar();
    }
}
