package aula03;

import java.util.Scanner;

public class aula03 {

    //Exercicios feitos durante a aula03
    public static void main(String[] args) {
        // ex A
        int result = arredondar(2.6);
        System.out.println(result);
        // ex B
        getTemperature(55);
        // ex D
        System.out.println("--------------------------------");
        System.out.println("Introduza um Numero na consola:");
        verNumero();
        // ex E
        System.out.println("Maximo de 3 Numeros Introduzidos");
        int resultado = maiorNum();
        System.out.println("O numero maior dos 3 é " + resultado);
    }

    //  Arredondar sem Math.round()
    static int arredondar(double a) {
        // Se o Resto da divisao do proprio a pelo a truncado (convertido para int)
        // for maior que 0.5 entao arredonda para cima, caso contrario arredonda pra baixo
        if (a % (int) a >= 0.5) {
            return (int) a + 1;
        } else {
            return (int) a;
        }
    }

    // Funcao getTemperature usando estructuras if / else
    static void getTemperature(int temp) {
        if (temp < 0) {
            System.out.println("está gelado");
        } else if (temp < 15) {
            System.out.println("está frio");
        } else if (80 >= temp && temp > 50) {
            System.out.println("está quente");
        } else if (temp > 80) {
            System.out.println("está a ferver");
        } else {
            System.out.println("está normal");
        }
    }

    // Verifica se o numero introduzido pelo utilizador é neg, pos ou 0
    static void verNumero() {
        // cria objecto Scanner
        Scanner keyboard = new Scanner(System.in);
        // aguarda Numero no scanner
        int numero = keyboard.nextInt();
        if (numero < 0) {
            System.out.println("este numero é negativo");
        } else if (numero > 0) {
            System.out.println("este numero é positivo");
        } else {
            System.out.println("este numero é 0");
        }
    }

    // Verifica o maior dos 3 numeros introduzidos pelo utilizador
    static int maiorNum() {
        // cria objecto Scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Introduz o 1º num:");
        // aguarda 1º Numero no scanner
        int num1 = keyboard.nextInt();
        // guarda o 1º numero como maximo
        int max = num1;
        System.out.println("Introduz o 2º num:");
        // aguarda 2º Numero no scanner
        int num2 = keyboard.nextInt();
        if (num2 > max) {
            max = num2;
        }
        System.out.println("Introduz o 3º num:");
        // aguarda 3º Numero no scanner
        int num3 = keyboard.nextInt();
        if (num3 > max) {
            max = num3;
        }
        return max;
    }
}
