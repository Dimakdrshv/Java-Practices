package lesson_7_1;

import lesson_7_1.GeometricObject;

import java.util.Scanner;

public class Circle extends GeometricObject implements Colorable {
    private double radius;

    /** Создает по умолчанию заданный круг */
    public Circle() {}

    /** Создает круг с указанным радиусом */
    public Circle(double radius) {
        this.radius = radius;
    }

    /** Создает круг с указанным радиусом, цветом и заливкой */

    public Circle(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    /** Возвращает радиус */
    public double getRadius() {
        return radius;
    }

    /** Присваивает новый радиус */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /** Возвращает площадь */

    public double getArea() {
        return radius * radius * Math.PI;
    }

    /** Возвращает диаметр */
    public double getDiameter() {
        return 2 * radius;
    }

    /** Возвращает периметр */

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    /** Отображает информацию о круге */
    public void printCircle() {
        System.out.println("Круг создан " + getDateCreated() +
                " и радиус равен " + radius);
    }

    @Override
    public void howToColor() {
        System.out.println("Введите тип раскраски");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.next();
        this.setColor(color);
    }
}
