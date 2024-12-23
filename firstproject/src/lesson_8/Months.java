package lesson_8;

import java.util.InputMismatchException;

public class Months {
    private String[] months = {"январь", "февраль", "март", "апрель", "май",
            "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    private int[] dom = {31,28,31,30,31,31,30,31,30,31,30,31};

    public String getMonth(int index) {
        if (index > 12 || index < 1) {
            throw new ArrayIndexOutOfBoundsException("WARNING: Неверное указание номера месяца.");
        } else return this.months[index - 1];
    }

    public int getDom(int index) {
        if (index > 12 || index < 1) {
            throw new ArrayIndexOutOfBoundsException("WARNING: Неверное указание номера месяца.");
        } else return this.dom[index - 1];
    }

    public boolean checkYear (int year) {
        if (year < 0) throw new InputMismatchException();
        return year % 4 == 0;
    }
}
