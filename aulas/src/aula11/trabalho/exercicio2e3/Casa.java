package aula11.trabalho.exercicio2e3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import java.util.function.Predicate;

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

    // Obtem ArrayList de todos os Eletrodomesticos de uma divisao
    public ArrayList<Eletrodomestico> getDivisao(String divisao) {
        return mapaEletro.get(divisao);
    }

    // Obtem o mapa completo de electrodomesticos e divisoes
    public Map<String, ArrayList<Eletrodomestico>> getMapaEletro() {
        return mapaEletro;
    }


    // Para o Exercicio 3 consultar o link abaixo, explica todos os métodos necessários
    // https://stackoverflow.com/a/10432084/1081088


    // Ex 3.A.   Colocar numa lista todos os electrodomésticos da marca a remover
    // e usar o método removeAll() após terminar a procura
    public void removeMarca(String divisao, String marca) {
        // Obtem lista de electrodomesticos numa divisao
        ArrayList<Eletrodomestico> listaDivisao = getDivisao(divisao);
        // Coloca elementos a remover numa lista
        ArrayList<Eletrodomestico> aRemover = new ArrayList<Eletrodomestico>();
        // Percorre lista
        for (Eletrodomestico e : listaDivisao) {
            // Se a marca encontrada for igual à pedida, adiciona à lista a remover
            if (marca.equalsIgnoreCase(e.getMarca())) {
                aRemover.add(e);
            }
        }
        listaDivisao.removeAll(aRemover);
    }

    // Ex 3.B. Usar um iterador (classe Iterator) para ir removendo cada electrodoméstico
    // ao mesmo tempo que se itera sobre a lista
    public void removeMarcaIterator(String divisao, String marca) {
        // Obtem lista de electrodomesticos numa divisao
        ArrayList<Eletrodomestico> listaDivisao = getDivisao(divisao);
        // Cria iterador para percorrer a lista
        ListIterator<Eletrodomestico> iterator = listaDivisao.listIterator();
        // percorre a lista com o Iterador e remove elementos se for igual à marca
        while (iterator.hasNext()) {
            if (marca.equalsIgnoreCase(iterator.next().getMarca())) {
                iterator.remove();
            }
        }
    }

    // Ex 3.C. Criar um filtro que implemente a interface Predicate e usar o método removeIf()
    // para remover todos os electrodomésticos da marca a remover(só no Java 8).
    public void removeMarcaPredicate(String divisao, String marca) {
        // Obtem lista de electrodomesticos numa divisao
        ArrayList<Eletrodomestico> listaDivisao = getDivisao(divisao);
        // Cria um predicado (condiçao de satisfaçao para remover)
        Predicate<Eletrodomestico> condicao = eletrodomestico -> eletrodomestico.getMarca().equals(marca);
        //Usa removeif para remover elementos que satisfazem a condicao
        listaDivisao.removeIf(condicao);
    }


    @Override
    public String toString() {
        return "Mapa:" + mapaEletro;
    }
}
