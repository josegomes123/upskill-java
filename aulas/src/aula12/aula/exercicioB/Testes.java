package aula12.aula.exercicioB;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Testes {
    // Exercicio B aula 12
    public static void main(String[] args) {
        // Operacoes SOMA, SUBTRACAO, MULTIPLICAR, DIVISAO
        Scanner scanner = new Scanner(System.in);
        // Recebe o comando
        System.out.println("Introduza um comando:");
        String line = scanner.nextLine();
        Operacoes op = null; // Preciso de declarar fora do try catch
        try { // Apanha as excepçoes do scanner se o valor introduzido nao for uma operacao valida
            op = Operacoes.valueOf(line);
        } catch (IllegalArgumentException e) {
            System.out.println("O Comando introduzido nao é válido");
            System.out.println("Tente um destes: SOMAR, SUBTRAIR, MULTIPLICAR, DIVIDIR");
        }
        // Apanha as excepçoes do scanner se o valor introduzido nao for um inteiro
        try {
            // Recebe os numeros a operar o comando
            System.out.println("Introduza o primeiro operando:");
            int num1 = scanner.nextInt();
            System.out.println("Introduza o segundo operando:");
            int num2 = scanner.nextInt();
            // Cria variavel para guardar resultado
            int result;
            switch (op) {
                case SOMAR:
                    result = num1 + num2;
                    System.out.println("O resultado da soma entre " + num1 + " e " + num2 + " é: " + result);
                    break;
                case SUBTRAIR:
                    result = num1 - num2;
                    System.out.println("O resultado da subtraçao entre " + num1 + " e " + num2 + " é: " + result);
                    break;
                case MULTIPLICAR:
                    result = num1 * num2;
                    System.out.println("O resultado da multiplicaçao entre " + num1 + " e " + num2 + " é: " + result);
                    break;

                case DIVIDIR:
                    // Consulta sobre blocos try/catch em Java
                    //https://beginnersbook.com/2013/04/try-catch-in-java/
                    /* We suspect that this block of statement can throw
                     * exception so we handled it by placing these statements
                     * inside try and handled the exception in catch block
                     */
                    try {
                        result = num1 / num2;
                        System.out.println("O resultado da divisão entre " + num1 + " e " + num2 + " é: " + result);
                    } catch (ArithmeticException e) {
                        /* This block will only execute if any Arithmetic exception
                         * occurs in try block
                         */
                        System.out.println("You should not divide a number by zero");
                    }
                    break;
            }
        } catch (InputMismatchException e) {
            System.out.println("Introduza um inteiro valido para a operaçao");
            System.out.println("Erro: " + e);
        }

    }
}

