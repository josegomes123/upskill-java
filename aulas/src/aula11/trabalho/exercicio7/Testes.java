package aula11.trabalho.exercicio7;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

// Testes ex7 aula 12
// Para os Racionais usei a classe Rational e o Comparable já implementado na Aula10 ex1 do trabalho autonomo
// Para os Alunos usei a Classe Aluno e os Comparators já implementados no Aula10 ex 2 do trabalho autonomo
public class Testes {

    public static void main(String[] args) {
        //Cria Alunos
        Aluno aluno1 = new Aluno("José", 5);
        Aluno aluno2 = new Aluno("Maria", 8);
        Aluno aluno3 = new Aluno("Raquel", 6);
        Aluno aluno4 = new Aluno("André", 11);
        Aluno aluno5 = new Aluno("Vitor", 2);
        // Crio PriorityQueue de Alunos com o comparador
        // Para testar com o comparador de nome basta mudar o construtor de comparador dentro da
        // PriorityQueu para new NomeCompare()
        Queue<Aluno> priorityAlunoNome =  new PriorityQueue<Aluno>(new NumCompare());
        // Adiciono os alunos à priority queue (Posso adicionar vários ao mesmo tempo separando com virgulas)
        priorityAlunoNome.add(aluno1);
        priorityAlunoNome.add(aluno2);
        priorityAlunoNome.add(aluno3);
        priorityAlunoNome.add(aluno4);
        priorityAlunoNome.add(aluno5);
        // Imprime a queu completa de alunos (nao está por ordem)
        System.out.println("Qeue completa de Alunos guardada (Nao ordenada)");
        for (Aluno a: priorityAlunoNome) {
            System.out.println(a);
        }
        // Vou removendo os alunos, ao remover , a lista vai sair ordenada
        System.out.println("Qeue completa de Alunos com NomeCompare ao remover 1 a 1 (Ordenada por nome)");
        while (!priorityAlunoNome.isEmpty()) {
            System.out.println(priorityAlunoNome.poll());
        }
        System.out.println("------------------------------");
        // Crio racionais
        Rational r1 = new Rational(2, 3);
        Rational r2 = new Rational(3, 4);
        Rational r3 = new Rational(30, 4);
        Rational r4 = new Rational(4, 4);
        Rational r5 = new Rational(1, 4);
        // Crio PriorityQueue de Racionais com comparable e adiciono à queue
        Queue<Rational> priorityRational =  new PriorityQueue<>();
        priorityRational.add(r1);
        priorityRational.add(r2);
        priorityRational.add(r3);
        priorityRational.add(r4);
        priorityRational.add(r5);
        // Imprime a queu completa de racionais guardados (nao esta por ordem)
        System.out.println("Qeue completa de Racionais guardada (Nao ordenada)");
        for (Rational a: priorityRational) {
            System.out.println(a);
        }
        // Ao remover os elementos um a um com o poll, estes vão sair por ordem
        System.out.println("Qeue completa de Racionais ao remover 1 a 1 (Ordenada)");
        while (!priorityRational.isEmpty()) {
            System.out.println(priorityRational.poll());
        }


    }
}
