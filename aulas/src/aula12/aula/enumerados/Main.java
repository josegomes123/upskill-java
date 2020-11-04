package aula12.aula.enumerados;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Direcçoes - Testes direçoes
        String s1 = Direction.NORTH.name();
        System.out.println(s1);
        String s2 = Direction.SOUTH.prettyName();
        System.out.println(s2);
        // WeekDays - Testes dias da semana
        WeekDay[] days = WeekDay.values();
        for (int i= 0; i<days.length; i++){
            WeekDay day = days[i];
            String name = day.name();
            System.out.println(name);
        }
        // Comandos SAVE, LOAD; EXIT - Testes
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduza um comando:");
        String line = scanner.nextLine();
        Command command = Command.valueOf(line);
        switch (command) {
            case SAVE:
                // gravar
                break;
            case LOAD:
                // carregar
                break;
            case EXIT:
                // sair
                break;
        }
    }
}
