package lesson_1;

import java.util.Scanner;

public class SolutionOne {
    final double ROUBLES_PER_YUAN = 11.91;
    int yuan;
    double roubles;
    int digit;
    int digit_rub;
    public void SolveFirst() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в юанях: ");
        yuan = scanner.nextInt();
        roubles = ROUBLES_PER_YUAN * yuan;
    }
    public void SolveSecond() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите сумму в юанях: ");
        yuan = scanner.nextInt();
        digit = yuan % 10;
        switch (digit) {
            case 1:
                System.out.println("Китайских юань.");
                break;
            case 2, 3, 4:
                System.out.println("Китайских юаня.");
                break;
            case 0, 5, 6, 7, 8, 9:
                System.out.println("Китайских юаней.");
                break;
        }
        roubles = ROUBLES_PER_YUAN * yuan;
        scanner.close();
    }
    public void PrintInfo() {
        digit_rub = (int) (this.roubles % 10);
        switch (digit_rub) {
            case 1:
                System.out.printf("%.2f рубль\n", this.roubles);
                break;
            case 2, 3, 4:
                System.out.printf("%.2f рубля\n", this.roubles);
                break;
            case 0, 5, 6, 7, 8, 9, 11, 12, 13, 14:
                System.out.printf("%.2f рублей\n", this.roubles);
        }
    }
}
