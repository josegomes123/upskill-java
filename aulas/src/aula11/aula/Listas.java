package aula11.aula;

import java.util.*;

public class Listas {

    public ArrayList<String> lista;

    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<String>();
        lista.add("Joao");
        lista.add("Maria");
        lista.add("Artur");
        // Imprime a lista completa
        System.out.println("Lista Completa");
        System.out.println(lista);
        // Remove e testa se elemento ainda continua na lista
        System.out.println("Remove Joao");
        lista.remove("Joao");
        System.out.println("A lista contem Joao? "+ lista.contains("Joao"));
        // Percorre a lista e Imprime a lista 1 a 1
        System.out.println("Imprime Lista 1 a 1");
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        // Linked list
        LinkedList<String> linkados = new LinkedList<>();
        linkados.add("NOme1");
        linkados.add("Nome2");
        linkados.add("Nome3");
        System.out.println(linkados);
        // Qeue linked list
        Queue<String> q = new LinkedList<String>();
        q.add("Test1");
        q.add("Test2");
        System.out.println(q);
        // Queue
        PriorityQueue<Filme> priority = new PriorityQueue<Filme>();
        Filme filme1 = new Filme(3, "Filme 1 ");
        Filme filme2 = new Filme(6, "Filme 2 ");
        Filme filme3 = new Filme(1, "Filme 3 ");
        Filme filme4 = new Filme(5, "Filme 4 ");
        Filme filme5 = new Filme(4, "Filme 5 ");
        priority.add(filme1);
        priority.add(filme2);
        priority.add(filme3);
        priority.add(filme4);
        priority.add(filme5);
        System.out.println("Queue inicial: ");
        System.out.println(priority);
        System.out.println("Peek: ");
        System.out.println(priority.peek());
        System.out.println("Poll: ");
        System.out.println(priority.poll());
        System.out.println("Queue depois de poll");
        System.out.println(priority);
    }



}
