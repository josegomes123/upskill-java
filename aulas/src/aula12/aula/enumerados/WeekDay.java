package aula12.aula.enumerados;

public enum WeekDay{
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4),
    FRIDAY(5), SATURDAY(6), SUNDAY(7);
    private int number;
    private WeekDay(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
}
