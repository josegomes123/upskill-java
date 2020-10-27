package aula06.trabalho.exercicio4;

public class Person {
    private String firstName;
    private String lastName;
    private int idade;
    private String morada;
    private String nacionalidade;


    //Constructor
    public Person(String firstName, String lastName, int idade){
        this.firstName = firstName;
        this.lastName = lastName;
        this.idade = idade;
    }

    //Getters and Setters
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = firstName;
    }

    public int getIdade(){
        return idade;
    }
    public void setIdade(int idade){
        this.idade = idade;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    // Imprime o nome completo seguido de idade
    public String toString(){
        return "Nome: " + this.getFirstName() + " " + this.getLastName() + " Idade: " + this.getIdade();
    }


}
