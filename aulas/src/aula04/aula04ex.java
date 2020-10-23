package aula04;

public class aula04ex {
    public static void main(String[] args) {
        System.out.println("Exercicio 1 - Soma While");
        somaWhile();
        System.out.println("Exercicio 2 - Soma For");
        somaFor();
        System.out.println("Exercicio 3 - Numero de Divisores");
        System.out.println(divisores(10));
        System.out.println("Exercicio 4 - Soma de Divisores");
        System.out.println(somatorioDivisores(10));
        System.out.println("Exercicio 5 - E Primo");
        System.out.println(ePrimo(192));
        System.out.println("Exercicio 6 - E Primo Intervalo");
        System.out.println(ePrimoIntervalo(2504,2520));
    }


    //ex1
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


    //ex2
    public static void somaFor(){
        int soma = 0;
        for (int i =0; i<=100; i++){
            soma = soma + i;
        }
        System.out.println(soma);
    }

    //ex3
    public static int divisores(int n){
        int divisores = 0;
        for (int i=1; i<=n; i++){
            if (n % i == 0){
                divisores++;
            }
        }
        return divisores;
    }

    //ex4
    public static int somatorioDivisores(int n){
        int somaDivisores = 0;
        for (int i=1; i<n; i++){
            if (n % i == 0){
                somaDivisores = somaDivisores+i;
            }
        }
        return somaDivisores;
    }

    //ex5
    public static boolean ePrimo(int n){
        for (int i=2; i<n; i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

    //ex6
    public static boolean ePrimoIntervalo(int a, int b){
        for (int i=a; i<=b; i++){
            if (ePrimo(i)) {
                return true;
            }
        }
        return false;
    }


}
