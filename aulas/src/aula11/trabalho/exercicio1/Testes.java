package aula11.trabalho.exercicio1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Testes {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<Integer>();
        List<Integer> linkedList = new LinkedList<Integer>();
        System.out.println("Test time Array List: " +
                testTime(arrayList));
        System.out.println("Test time Linked List: "
                + testTime(linkedList));
    }

    private static long testTime(List<Integer> list) {
        long startTime = System.currentTimeMillis();
        // Insercao de elementos no inicio da lista
        list.add(0);
        for (int i = 0; i != 100000; i++)
            list.add(0, i);
        return System.currentTimeMillis() - startTime;
    }

    /* LinkedList tem performance superior para adicionar elementos porque ao inserirmos sempre na
    posiçao 0 (que é o que estamos a fazer neste exercicio até 100000), numa array list esta
    vai ter que puxar todos os elementos à direita do indice 0 para arranjar espaço e inserir no indice 0
    enquanto a LinkedList como contem apenas 2 referencias/pointers (nós) a apontar para o próximo elemento,
    para inserir um elemento na posicao 0 é uma operaçao linear, porque simplesmente se substitui o elemento
    e se muda a referencia nos elementos vizinhos (neste caso apenas o indice 1), para este passar a apontar para o novo elemento
     */

}
