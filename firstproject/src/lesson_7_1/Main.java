package lesson_7_1;

import lesson_7_1.IllegalTriangleException;
import lesson_7_1.Triangle;

import javax.swing.plaf.metal.MetalIconFactory;
import java.util.ArrayList;
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

    public static void main(String[] args) throws IllegalTriangleException {
        //3 задание
        String color = colorInitialization();
        boolean isFilled = isFilledInitialization();
        int[] sides = sidesInitialization();
        try {
            Triangle triangle = new Triangle(color, isFilled, sides[0], sides[1], sides[2]);
            System.out.println(triangle.toString());
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }


        Circle circle1 = new Circle(12);
        Circle circle2 = new Circle(8);

        Rectangle rectangle1 = new Rectangle(12.13,5.6);
        Rectangle rectangle2 = new Rectangle(7.4, 9.81);

        GeometricObject geometricObject1 = GeometricObject.max(rectangle1, rectangle2);
        GeometricObject geometricObject2 = GeometricObject.max(circle1, circle2);

        System.out.println("Больший прямоугольник с площадью: " + geometricObject1.getArea());
        System.out.println("Большая окружность с площадью: " + geometricObject2.getArea());



        ComparableCircle circle3 = new ComparableCircle(5);
        ComparableCircle circle4 = new ComparableCircle(3.5);

        Rectangle rectangle3 = new Rectangle(15, 5);

        ComparableCircle maxCircle = ComparableCircle.max(circle3, circle4);
        System.out.println("Наибольшая окружность с площадью: " + maxCircle.getArea());

        GeometricObject maxCircleRectangle = GeometricObject.max(circle4, rectangle3);
        System.out.print("Наибольшая площадь между кругом и прямоугольником: " + maxCircleRectangle.getArea() + " - ");
        if (maxCircleRectangle.getArea() == rectangle3.getArea()) {
            System.out.println("площадь прямоугольника.");
        } else {
            System.out.println("площадь окружности.");
        }

        //4 задание

        ArrayList<GeometricObject> arrayList = new ArrayList<>(5);
        arrayList.add(new Triangle("red", true,2, 2, 2));
        arrayList.add(new Circle(12.6, "red", true));
        arrayList.add(new Rectangle(12.6, 6, "red", true));
        arrayList.add(new Square());
        arrayList.add(new Square(15));
        for (var i : arrayList) {
            if (i.getArea() != 0 && i instanceof Triangle triangle) {
                triangle.howToColor();
            } else if (i.getArea() != 0 && i instanceof Circle circle) {
                circle.howToColor();
            } else if (i.getArea() != 0 && i instanceof Rectangle rectangle) {
                rectangle.howToColor();
            } else if (i.getArea() != 0 && i instanceof Square square) {
                square.howToColor();
            } else {
                System.out.println("Невозможно выполнить раскараску для фигуры созданной в " + i.getDateCreated());
            }
        }
        for (var i : arrayList) {
            System.out.println("Цвет новых фигур по порядку: " + i.getColor());
        }
    }
}

