package aula04;

public class aula04ex {
    //Exercicios de trabalho autonomo da aula04
    public static void main(String[] args) {
        //ex1 - testes
        System.out.println("Exercicio 1 - Soma While");
        somaWhile();
        //ex2 - testes
        System.out.println("Exercicio 2 - Soma For");
        somaFor();
        //ex3 - testes
        System.out.println("Exercicio 3 - Numero de Divisores");
        System.out.println(divisores(10));
        //ex4 - testes
        System.out.println("Exercicio 4 - Soma de Divisores");
        System.out.println(somatorioDivisores(10));
        //ex5 - testes
        System.out.println("Exercicio 5 - E Primo");
        System.out.println(ePrimo(192));
        //ex6 - testes
        System.out.println("Exercicio 6 - E Primo Intervalo");
        System.out.println(ePrimoIntervalo(2504,2520));
    }


    // 1. Criar uma função que mostre a soma de todos os números no intervalo de 1 até 100
    //utilizando o While.
    public static void somaWhile(){
        int soma = 0;
        int i = 0;
        while (i<=100){
            // Adiciona i à soma
            soma = soma + i;
            i++;
        }
        System.out.println(soma);
    }


    // 2. Criar uma função que mostre a soma de todos os números no intervalo de 1 até 100
    //utilizando o For.
    public static void somaFor(){
        int soma = 0;
        for (int i =0; i<=100; i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }

    // 3. Criar uma função que devolva o número de divisores de um número inteiro n . Esta
    //função deverá iterar sobre os números naturais até n , contando os números que são
    //divisores de n .
    public static int divisores(int n){
        int divisores = 0;
        for (int i=1; i<=n; i++){
            if (n % i == 0){
                divisores++;
            }
        }
        return divisores;
    }

    // 4. Criar uma função que devolva o somatório dos divisores próprios de um número
    //inteiro n (o conjunto dos divisores exclui o próprio número). Esta função deverá iterar
    //sobre os números naturais até n (exclusive), acumulando os números que são divisores
    //de n .
    public static int somatorioDivisores(int n){
        int somaDivisores = 0;
        for (int i=1; i<n; i++){
            if (n % i == 0){
                somaDivisores = somaDivisores+i;
            }
        }
        return somaDivisores;
    }

    // 5. Criar uma função que que recebe como argumento um número natural e devolve
    //verdadeiro caso seja primo, ou falso caso contrário.
    public static boolean ePrimo(int n){
        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    // 6. Criar uma função que permite saber se existe algum número primo num dado
    //intervalo (aberto).
    public static boolean ePrimoIntervalo(int a, int b){
        for (int i=a+1; i<b; i++){
            if (ePrimo(i)) {
                return true;
            }
        }
        return false;
    }


}
