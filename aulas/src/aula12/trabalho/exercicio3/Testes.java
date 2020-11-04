package aula12.trabalho.exercicio3;

public class Testes {
    // Testes Exercicio 3 aula 12

    // Testa cada dia e verifica se é fim de semana usando a funçao definida no enum WeekDays
    public static void eFimdeSemana(WeekDays day) {
        // Testa se o enum é fim de semana
        if (day.isWeekEnd()) {
            System.out.println(day.name() + " é fim de Semana");
        } else {
            System.out.println(day.name() + " é um dia da Semana");
        }
    }


    public static void main(String[] args) {
        // WeekDays - Testes dias da semana um a um
        WeekDays[] days = WeekDays.values();
        for (int i = 0; i < days.length; i++) {
            // Imprime os dias 1 a um
            eFimdeSemana(days[i]);
        }
    }
}
