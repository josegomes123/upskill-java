package aula24.exerciciosLambdas;

public class Person {
    String name;
    int idade;

    Person(String name, int idade){
        this.name = name;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "name=" + name + "idade=" + idade +
                '}';
    }
}
