package lesson_7;

import java.util.Scanner;

public class Main {
    public static String colorInitialization() {
        String color;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите цвет треугольника: ");
        color = scanner.next();
        return color;
    }
    public static boolean isFilledInitialization() {
        boolean isFilled;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Закрашен ли треугольник (true - да, false - нет): ");
        isFilled = scanner.nextBoolean();
        return isFilled;
    }

    public static int[] sidesInitialization() {
        int[] sides = new int[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите стороны треугольника:");
        for (int i = 0; i < 3; i++)
            sides[i] = scanner.nextInt();
        return sides;
    }

    public static void main(String[] args) {
        String color = colorInitialization();
        boolean isFilled = isFilledInitialization();
        int[] sides = sidesInitialization();
        try {
            Triangle triangle = new Triangle(color, isFilled, sides[0], sides[1], sides[2]);
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
