package aula03;

import java.time.LocalDate;

public class aula03ex {
    //Exercicios de trabalho autonomo da aula03
    public static void main(String[] args) {
        // ex1
        int resultado1 = idade(1992);
        System.out.println("A Idade é " + resultado1 );
        //ex 2
        int resultado2 = divisao(3,1);
        System.out.println("A divisao dos 2 numeros é " + resultado2 );

    }




    // 1.Criar uma função que dado o ano de nascimento devolve a idade.
    public static int idade(int birthdate){
        // Função para calcular o ano actual em Java
        int currentYear = LocalDate.now().getYear();
        // Sem imports daria com currentYear = 2020;
        return currentYear - birthdate;
    }

    // 2.Criar uma função que divide dois números. Caso a divisão seja por zero,a função deve devolver 0.
    public static int divisao(int a, int b){
        // Se a divisao for por 0
        if (b==0){
            return 0;
        } else {
            return a/b;
        }
    }

    // 3. Criar uma função que devolve verdadeiro se o número dado for par.(Ex:isEven(6)->true)

}
