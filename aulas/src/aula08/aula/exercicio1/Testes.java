package aula08.aula.exercicio1;

public class Testes {
    //Testes ex1 aula
    public static void main(String[] args) {
        //Crio Funcionarios
        Funcionario assistente1 = new Assistente("Joao", "DSMMG", 600.0);
        Funcionario gerente1 = new Gerente("Artur", "SAFK523", 1200.0);
        Funcionario vendedor1 = new Vendedor("Sofia", "LCANMF", 600.0, 22.0);
        Assistente assistente2 = new Assistente("Joao", "DSMMG", 600.0);
        //Mostra salario funcionarios
        System.out.println("Salario Assistente1:");
        System.out.println(assistente1.calculaSalario());
        System.out.println("Salario Assistente2:");
        System.out.println(assistente2.calculaSalario());
        System.out.println("Salario Gerente1:");
        System.out.println(gerente1.calculaSalario());
        System.out.println("Salario Vendedor1:");
        System.out.println(vendedor1.calculaSalario());
    }
}
