package aula10.aula.comparables;

import java.util.Arrays;

// Ex 1 Comparables (Exemplo 2)
public class Estudante implements Comparable<Estudante> {
    int numero;
    String nome;
    int idade;

    public Estudante(int numero, String nome, int idade) {
        this.numero = numero;
        this.nome = nome;
        this.idade = idade;
    }

    // Comparador de idade
    public int compareTo(Estudante st) {
        if (idade == st.idade)
            return 0;
        else if (idade > st.idade)
            return 1;
        else
            return -1;
    }


    // Testes ex1 Comparables
    public static void main(String[] args) {
        Estudante[] st = new Estudante[3];
        st[0] = new Estudante(101, "José", 23);
        st[1] = new Estudante(106, "Maria", 27);
        st[2] = new Estudante(105, "Manuel", 21);
        // Ordenado por idade
        Arrays.sort(st);
        System.out.println("Ordenado por idade: ");
        for (Estudante stu : st) {
            System.out.println(stu.numero + " " + stu.nome + " " + stu.idade);
        }
       // Cria Comparador de Nome e ordena por nome
        NomeCompare nomeCompare = new NomeCompare();
        Arrays.sort(st, nomeCompare);
        System.out.println("Ordenado por nome:");
        for(Estudante stu:st){
            System.out.println(stu.numero + " " +
                    stu.nome + " " + stu.idade);
        }
        // Cria Comparador de Nome e ordena por numero
        NumeroCompare numCompare=new NumeroCompare();
        Arrays.sort(st, numCompare);
        System.out.println("Ordenado por numero:");
        for(Estudante stu:st){
            System.out.println(stu.numero + " " +
                    stu.nome + " " + stu.idade);
        }

    }
}