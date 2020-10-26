package aula03;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;

public class aula03ex {
    //Exercicios de trabalho autonomo da aula03
    public static void main(String[] args) {
        // ex1 - testes
        int resultado1 = idade(1992);
        System.out.println("A Idade é " + resultado1);
        //ex 2 - testes
        int resultado2 = divisao(3, 1);
        System.out.println("A divisao dos 2 numeros é " + resultado2);
        //ex 3 - testes
        boolean resultado3 = isEven(4);
        System.out.println("O numero introduzido é par? " + resultado3);
        //ex 4 - testes
        boolean resultado4 = isPositive(-45);
        System.out.println("O numero introduzido é positivo? " + resultado4);
        //ex 5 - testes
        System.out.println("Introduza algo na consola:");
        devolve();
        //ex 6 - testes
        System.out.println("Introduza um veiculo na consola:");
        // Cria scanner para receber informação da consola
        Scanner keyboard = new Scanner(System.in);
        // Aguarda proxima informaçao da consola
        String veiculo = keyboard.nextLine();
        System.out.println("O " + veiculo + " tem " + getWheels(veiculo) + " rodas.");
        //ex 7 - testes
        System.out.println("A nota é: " + getGrade(67));
        System.out.println("A nota é: " + getGrade(102));
        //ex 8 - testes
        System.out.println("O mês dado é " + devolveMes(3));
        //ex 9 - testes
        obterSigno();
        //ex10 - testes
        ordenaNum ();
    }


    // 1.Criar uma função que dado o ano de nascimento devolve a idade.
    public static int idade(int birthdate) {
        // Função para calcular o ano actual em Java
        int currentYear = LocalDate.now().getYear();
        // Sem imports daria com currentYear = 2020;
        return currentYear - birthdate;
    }

    // 2.Criar uma função que divide dois números. Caso a divisão seja por zero,a função deve devolver 0.
    public static int divisao(int a, int b) {
        // Se a divisao for por 0
        if (b == 0) {
            return 0;
        } else {
            return a / b;
        }
    }

    // 3. Criar uma função que devolve verdadeiro se o número dado for par.(Ex:isEven(6)->true)
    public static boolean isEven(int a) {
        return a % 2 == 0;
    }

    // 4. Criar uma função que devolve verdadeiro se o número dado é positivo e falso caso contrário.
    // (Ex: isPositive(-45) -> false)
    public static boolean isPositive(int a) {
        return a >= 0;
    }

    // 5. Criar uma função que devolva o conteúdo escrito na consola. Para este exercício deve
    //utilizar o Scanner.
    public static void devolve() {
        // Cria scanner para receber informação da consola
        Scanner keyboard = new Scanner(System.in);
        // Aguarda proxima informaçao da consola
        String textoIntroduzido = keyboard.nextLine();
        System.out.println(textoIntroduzido);
    }

    // 6. Criar uma função que devolve o número de rodas que o veículo possui, dado esse
    //mesmo veículo. Assuma apenas os seguintes veículos: automóvel, moto, bicicleta,
    //triciclo, camião, monociclo. (Ex: getWheels(“Bicicleta”) -> 2)
    public static int getWheels(String veiculo) {
        // É mais pratico usar switch em vez de if/else nesta situaçao
        // devido ao grande numero de casos especificos a testar
        switch (veiculo) {
            case "automovel":
                // Neste caso nao precisa de break porque cada caso já faz return
                // por isso sai do ciclo automaticamente
                return 4;
            case "moto":
                return 2;
            case "bicicleta":
                return 2;
            case "triciclo":
                return 3;
            case "camião":
                return 12;
            case "monociclo":
                return 1;
            default:
                return 0;
        }
    }

    //7. Criar uma função que indica a nota qualitativa dada uma nota quantitativa. Assuma as
    //seguintes escalas: Excelente (90%-100%), Muito bom (80%-90%), Bom (70%-80%),
    //Suficiente (50%-70%), Insuficiente (30%-50%) e Muito Insuficiente (0%-30%). Caso a
    //nota dada esteja fora da escala, deve retornar Nota inválida. (Ex: getGrade(67) ->
    //“Suficiente”, getGrade(102) -> “Nota inválida”)
    public static String getGrade(int nota) {
        if (nota <= 100 && nota >= 90) {
            return "Excelente";
        } else if (nota < 90 && nota >= 80) {
            return "Muito Bom";
        } else if (nota < 80 && nota >= 70) {
            return "Bom";
        } else if (nota < 70 && nota >= 50) {
            return "Suficiente";
        } else if (nota < 50 && nota >= 30) {
            return "Insuficiente";
        } else if (nota < 30 && nota >= 0) {
            return "Muito Insuficiente";
        } else {
            return "Nota Inválida";
        }
    }

    //8. Criar uma função que receba um número inteiro e devolva uma string com o nome do
    //mês correspondente. Para o número inteiro 1 devolve “Janeiro”, para o número inteiro
    //2 devolve “Fevereiro” e por aí adiante. Neste exercício é necessário utilizar o
    //switch-case.
    public static String devolveMes(int mesNum) {
        switch (mesNum) {
            case 1:
                return "Janeiro";
            case 2:
                return "Fevereiro";
            case 3:
                return "Março";
            case 4:
                return "Abril";
            case 5:
                return "Maio";
            case 6:
                return "Junho";
            case 7:
                return "Julho";
            case 8:
                return "Agosto";
            case 9:
                return "Setembro";
            case 10:
                return "Outubro";
            case 11:
                return "Novembro";
            case 12:
                return "Dezembro";
            default:
                return "Mês Inválido";
        }
    }

    //9. Criar uma função que peça ao utilizador o dia, o mês de nascimento e devolva uma
    //string com o signo correspondente. Neste exercício é necessário utilizar o scanner para
    //pedir o dia e o mês de nascimento ao utilizador e utilizar o if-else para ver todas as
    //possibilidades de signos.
    public static void obterSigno() {
        Scanner s = new Scanner(System.in);
        System.out.println("Introduza o seu dia de nascimento:");
        int dia = s.nextInt();
        System.out.println("Introduza o numero do seu mês de nascimento:");
        int mes = s.nextInt();
        if ((dia>=21 && mes == 3) || (dia <= 20 && mes == 4)){
            System.out.println("O signo dado é Carneiro");
        } else if ((dia>=21 && mes == 4) || (dia <= 20 && mes == 5)) {
            System.out.println("O signo dado é Touro");
        } else if ((dia>=21 && mes == 5) || (dia <= 20 && mes == 6)) {
            System.out.println("O signo dado é Gémeos");
        } else if ((dia>=21 && mes == 6) || (dia <= 21 && mes == 7)) {
            System.out.println("O signo dado é Caranguejo");
        } else if ((dia>=22 && mes == 7) || (dia <= 22 && mes == 8)) {
            System.out.println("O signo dado é Leão");
        } else if ((dia>=23 && mes == 8) || (dia <= 22 && mes == 9)) {
            System.out.println("O signo dado é Virgem");
        } else if ((dia>=23 && mes == 9) || (dia <= 22 && mes == 10)) {
            System.out.println("O signo dado é Balança");
        } else if ((dia>=23 && mes == 10) || (dia <= 21 && mes == 11)) {
            System.out.println("O signo dado é Escorpião");
        } else if ((dia>=22 && mes == 11) || (dia <= 21 && mes == 12)) {
            System.out.println("O signo dado é Sagitário");
        } else if ((dia>=22 && mes == 12) || (dia <= 20 && mes == 1)) {
            System.out.println("O signo dado é Capricórnio");
        } else if ((dia>=21 && mes == 1) || (dia <= 19 && mes == 2)) {
            System.out.println("O signo dado é Aquário");
        } else if ((dia>=20 && mes == 2) || (dia <= 20 && mes == 3)) {
            System.out.println("O signo dado é Peixes");
        } else {
            System.out.println("A data introduzida nao é valida");;
        }
    }

        //10. Criar uma função que peça ao utilizador três números e os coloque por ordem
        //crescente. Neste exercício é preciso utilizar o scanner para pedir ao utilizador três
        //números
        public static void ordenaNum () {
            Scanner s = new Scanner(System.in);
            System.out.println("Introduza um numero no Scanner:");
            int num1 = s.nextInt();
            System.out.println("Introduza o segundo numero no Scanner:");
            int num2 = s.nextInt();
            System.out.println("Introduza o terceiro numero no Scanner:");
            int num3 = s.nextInt();
            // Coloca os 3 numeros numa array/vector
            int[] arrayInts = {num1, num2, num3};
            // Ordena os numeros usando a função sort() da library Arrays
            Arrays.sort(arrayInts);
            // Converte a array em string para imprimir
            System.out.println("Estes numeros em ordem crescente são:");
            System.out.println(Arrays.toString(arrayInts));
        }
    }
