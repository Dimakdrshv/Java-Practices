package lesson_8;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите номер месяца: ");
        int index = 0;

        try {
            index = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("WARNING: Неверно введено значение.");
            System.exit(0);
        }

        Months months = new Months();
        String month = null;
        int days = 0;

        try {
            month = months.getMonth(index);
            days = months.getDom(index);
            if (index == 2) {
                System.out.print("Введите год: ");
                int year = scanner.nextInt();
                if (months.checkYear(year)) days++;
            }
        } catch (ArrayIndexOutOfBoundsException | InputMismatchException ex) {
            if (ex instanceof InputMismatchException) System.out.println("WARNING: Неверное указание года");
            else System.out.println(ex.getMessage());
            System.exit(0);
        }

        System.out.println("Месяц: " + month + " Количество дней: " + days);
    }
}
