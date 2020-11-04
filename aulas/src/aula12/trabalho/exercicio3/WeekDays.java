package aula12.trabalho.exercicio3;

public enum WeekDays {
    DOMINGO(1), SEGUNDA(2), TERÇA(3), QUARTA(4),
    QUINTA(5), SEXTA(6), SABADO(7);
    private int number;
    private WeekDays(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public boolean isWeekDay(){
        return (number == 2)  || (number == 3) || (number == 4) || (number == 5) || (number == 6);
    }
    // Contrario de weekday
    public boolean isWeekEnd(){
        return !isWeekDay();
    }
}
