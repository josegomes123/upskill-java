package aula25.observer;

public interface Subject {
    public void adiciona(Observer o);
    public void remove(Observer o);
    public void notificacao(Message msg);
}
