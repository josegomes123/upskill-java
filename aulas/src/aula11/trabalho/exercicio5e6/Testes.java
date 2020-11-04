package aula11.trabalho.exercicio5e6;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Testes {
    // Ex 4-5 e 6 aula 11
    public static void main(String[] args) {
        String s1 = "String1";
        String s2 = "teste";
        String s3 = "Frase";
        String s4 = "UltimoTeste";
        Stack<String> pilha = new Stack<String>();
        pilha.push(s1);
        pilha.push(s2);
        pilha.push(s3);
        pilha.push(s4);
        System.out.println("Pilha completa: ");
        System.out.println(pilha);
        // Remove elemento
        System.out.println("Elemento removido: ");
        System.out.println(pilha.pop());
        // O ultimo elemento inserido é o que "salta" com o pop

        System.out.println("-----------------------------------");
        Deque deque = new ArrayDeque();
        deque.add(s1);
        deque.add(s2);
        deque.add(s3);
        deque.add(s4);
        System.out.println("Lista Deque: ");
        System.out.println(deque);
        // Vê o primero elemento da lista
        System.out.println("primeiro elemento: ");
        System.out.println(deque.peekFirst());
        // Vê o ultimo elemento da lista
        System.out.println("ultimo elemento: ");
        System.out.println(deque.peekLast());
        // Retira o 1º e ultimo elemento da pilha
        deque.pollFirst();
        deque.pollLast();
        System.out.println("Deque com o 1º e ultimo elemento removidos:");
        System.out.println(deque);
    }

}
