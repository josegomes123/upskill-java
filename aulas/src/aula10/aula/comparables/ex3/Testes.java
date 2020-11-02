package aula10.aula.comparables.ex3;

import java.util.Arrays;

// Testes ex3 Aula10 Livros
public class Testes {
    public static void main(String[] args) {
        //Crio livros e array para inserir os livros
        Livro l1 = new Livro("Livro1", "Bertrand", 2003, "José");
        Livro l2 = new Livro("Hobbit", "Edit", 1999, "Tolkien");
        Livro l3 = new Livro("Meditations", "Penguin", 2006, "Marcus Aurelius");
        Livro l4 = new Livro("AAAAA", "TesteEditora", 1940, "Anabela");
        // Coloco livros na array
        Livro[] listaLivros = {l1,l2,l3,l4};
        // Criar comparador de ano, ordena a array pelo ano e imprime os livros ordenados
        AnoCompare anocompare = new AnoCompare();
        Arrays.sort(listaLivros, anocompare);
        System.out.println("Livros ordenados pelo ano: ");
        for (Livro l: listaLivros ) {
            System.out.println(l.toString());
        }
        // Criar comparador de autor, ordena a array pelo autor e imprime os livros ordenados
        AutorCompare autorcompare = new AutorCompare();
        Arrays.sort(listaLivros, autorcompare);
        System.out.println("Livros ordenados pelo autor: ");
        for (Livro l: listaLivros ) {
            System.out.println(l.toString());
        }
        // Criar comparador de editora, ordena a array pela editora e imprime os livros ordenados
        EditoraCompare editoracompare = new EditoraCompare();
        Arrays.sort(listaLivros, editoracompare);
        System.out.println("Livros ordenados pela editora: ");
        for (Livro l: listaLivros ) {
            System.out.println(l.toString());
        }
        // Criar comparador de nome, ordena a array pelo nome e imprime os livros ordenados
        NomeCompare nomecompare = new NomeCompare();
        Arrays.sort(listaLivros, nomecompare);
        System.out.println("Livros ordenados pelo nome: ");
        for (Livro l: listaLivros ) {
            System.out.println(l.toString());
        }


    }
}
