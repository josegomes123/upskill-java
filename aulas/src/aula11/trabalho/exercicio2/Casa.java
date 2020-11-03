package aula11.trabalho.exercicio2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Casa {
    public Map<String, ArrayList<Eletrodomestico>> mapaEletro = new HashMap<String, ArrayList<Eletrodomestico>>();

    // Adiciona Eletrodomestico à lista da divisao
    public void addEletro(String divisao, Eletrodomestico eletro) {
        ArrayList<Eletrodomestico> listaEletro;
        // Se a divisao ja existir obtem a lista existente
        if (mapaEletro.containsKey(divisao)) {
            listaEletro = mapaEletro.get(divisao);
            // se a divisao ainda nao existir, cria uma lista nova
        } else {
            listaEletro = new ArrayList<Eletrodomestico>();
        }
        listaEletro.add(eletro);
        mapaEletro.put(divisao, listaEletro);
    }

    public ArrayList<Eletrodomestico> getDivisao(String divisao) {
        return mapaEletro.get(divisao);
    }

    public Map<String, ArrayList<Eletrodomestico>> getMapaEletro() {
        return mapaEletro;
    }

    @Override
    public String toString() {
        return "Mapa:" + mapaEletro;
    }
}
