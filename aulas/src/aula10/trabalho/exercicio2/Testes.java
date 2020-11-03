package aula10.trabalho.exercicio2;

import java.util.Arrays;

public class Testes {
    public static void main(String[] args) {
        //Cria Alunos
        Aluno aluno1 = new Aluno("José", 5);
        Aluno aluno2 = new Aluno("Maria", 8);
        Aluno aluno3 = new Aluno("Raquel", 6);
        Aluno aluno4 = new Aluno("André", 11);
        Aluno aluno5 = new Aluno("Vitor", 2);
        // Coloco alunos na array
        Aluno[] listaAlunos = {aluno1, aluno2, aluno3, aluno4, aluno5};
        // Criar comparador de numero, ordena a array pelo numero e imprime os alunos ordenados
        NumCompare numcompare = new NumCompare();
        Arrays.sort(listaAlunos, numcompare);
        System.out.println("Alunos ordenados pelo num: ");
        for (Aluno l : listaAlunos) {
            System.out.println(l.toString());
        }
        /// Criar comparador de nome, ordena a array pelo nome e imprime os alunos ordenados
        NomeCompare nomecompare = new NomeCompare();
        Arrays.sort(listaAlunos, nomecompare);
        System.out.println("Alunos ordenados pelo nome: ");
        for (Aluno l : listaAlunos) {
            System.out.println(l.toString());
        }
    }
}
