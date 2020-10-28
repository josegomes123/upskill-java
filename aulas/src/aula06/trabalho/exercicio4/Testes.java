package aula06.trabalho.exercicio4;

public class Testes {
    // Testes exercicio4
    public static void main(String[] args) {
        //Cria carros
        Car carro1 = new Car("Opel", "Corsa", 5, 6, 50.0);
        Car carro2 = new Car("Ford", "Focus", 6, 4, 65.0);
        //Cria pessoas para adicionar como proprietarios
        Person pessoa1 = new Person("Tiago", "Lopes", 22);
        Person pessoa2 = new Person("Andre", "Silva", 27);
        // Faz 300 Kms, testa se está ligado (se gastou combustivel)
        carro1.run(300);
        //Verifica se esta ligado
        carro1.isLigado();
        //Verifica o combustivel
        System.out.println("O carro tem " + carro1.getCombustivelActual() + " L " +
                "de um total de " + carro1.getCombustivelMaximo() + "l de combustivel maximo");
        //Enche o deposito
        System.out.println("Abasteceu o deposito");
        carro1.encherDeposito();
        //Verifica o combustivel de novo e ve se ta ligado
        System.out.println("O carro tem " + carro1.getCombustivelActual() + "l " +
                "de um total de " + carro1.getCombustivelMaximo() + "l de combustivel maximo");
        carro1.isLigado();
        //Regista proprietarios nos carros e testa 2String
        carro1.registoProprietario(pessoa1, 02, 1992, "24-DX-54");
        carro2.registoProprietario(pessoa2, 12, 1984, "13-VT-21");
        System.out.println(carro1.toString());
        System.out.println(carro2.toString());
    }
}
