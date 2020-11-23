package aula25.strategy;

public class Cao extends Animal {

    public Cao(){
        super();
        setAnimalVoador(new NaoVoa());
        tentaVoar();
    }
}
