package lesson_8;
import java.util.InputMismatchException;
import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double annualInterestRate = 0d;
        int numberOfYears = 0;
        double loanAmount = 0d;

        // Получить годовую процентную ставку
        System.out.print("Введите годовую процентную ставку, например, 8.25: ");

        try {
            annualInterestRate = input.nextDouble();
            if (annualInterestRate <= 0) throw new IllegalArgumentException();
        } catch (IllegalArgumentException | InputMismatchException exception) {
            System.out.println("WARNING: Неверно введена процентная ставка.");
            System.exit(0);
        }

        // Получить срок кредита в годах
        System.out.print("Введите срок кредита в годах: ");

        try {
            numberOfYears = input.nextInt();
            if (numberOfYears <= 0) throw new IllegalArgumentException();
        } catch (IllegalArgumentException | InputMismatchException exception) {
            System.out.println("WARNING: Неверно введен срок кредита.");
            System.exit(0);
        }

        // Получить сумму кредита
        System.out.print("Введите сумму кредита в руб., например, 120000.95: ");

        try {
            loanAmount = input.nextDouble();
            if (loanAmount <= 0) throw new IllegalArgumentException();
        } catch (IllegalArgumentException | InputMismatchException exception) {
            System.out.println("WARNING: Неверно введена сумма кредита.");
            System.exit(0);
        }

        // Создать объект типа Loan
        Loan loan = new Loan(annualInterestRate, numberOfYears, loanAmount);

        // Отобразить дату взятия, ежемесячный платеж и общую стоимость кредита
        System.out.println("Дата взятия кредита: " + loan.getLoanDate().toString());
        System.out.println("Ежемесячный платеж по кредиту равен "
                + (int)(loan.getMonthlyPayment() * 100) / 100.0 + " руб.");
        System.out.println("Общая стоимость кредита равна "
                + (int)(loan.getTotalPayment() * 100) / 100.0 + " руб.");
    }
}