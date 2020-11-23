package aula25.observer;

public class Subscriber1 implements Observer{
    @Override
    public void update(Message msg) {
        System.out.println("Mensagem recebida por sub1");
    }
}
