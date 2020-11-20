package aula25.exerciciosLambdas;

import java.util.ArrayList;
import java.util.Arrays;

public class Lambda {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();
        a.add(11);
        a.add(12);
        a.add(13);
        a.add(15);
        a.add(15);
        a.add(16);
        a.forEach((num) -> {
            System.out.println(num);
        });

        Person p1 = new Person("Ricardo", 32);
        Person p2 = new Person("Andre", 12);
        Person p3 = new Person("Tiago", 22);
        Person p4 = new Person("Bruno", 12);
        ArrayList<Person> lista = new ArrayList<>();
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        lista.add(p4);

        lista.sort( (pessoa1,pessoa2) -> {
            return (pessoa1.name.compareTo(pessoa2.name));
        });

        System.out.println(lista.toString());


    }
}
