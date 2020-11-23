package aula25.observer;

import java.util.ArrayList;
import java.util.List;

public class ServicoSubs implements Subject {
    List<Observer> listaSubs = new ArrayList<>();


    @Override
    public void adiciona(Observer o) {
        listaSubs.add(o);
    }

    @Override
    public void remove(Observer o) {
        listaSubs.remove(o);
    }

    @Override
    public void notificacao(Message msg) {
        for (Observer obs : listaSubs) {
            obs.update(msg);
        }
    }
}
