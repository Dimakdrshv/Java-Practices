package lesson_9;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Arrays arrays = new Arrays();
        Random random = new Random();



        ArrayList<Integer> arrayList = new ArrayList<>();
        System.out.print("Размер коллекции: ");
        Scanner scanner = new Scanner(System.in);
        int size;
        while (true) {
            size = scanner.nextInt();
            if (size > 0) break;
            else System.out.println("Вы ввели неверное число. Попробуйте снова.");
        }
        for (int i = 0; i < size; i++)
            arrayList.add(random.nextInt(15));



        System.out.print("Значение элемента для поиска: ");
        int item = scanner.nextInt();
        int result = arrays.searchItem(arrayList, item);
        if (result == -1) System.out.println("Элемент " + item + " не найден.");
        else System.out.println("Элемент " + item + " находится на " + result + " индексе.");



        System.out.println("Обычный ряд:");
        arrays.showArrayList(arrayList);
        arrayList = new ArrayList<>(arrays.setArrayList(arrayList));
        System.out.println("Ряд с уникальными элементами:");
        arrays.showArrayList(arrayList);




        ArrayList<Circle> Circles = new ArrayList<>();
        System.out.print("Размер коллекции элементов Circle: ");
        int size1;
        while (true) {
            size1 = scanner.nextInt();
            if (size1 > 0) break;
            else System.out.println("Вы ввели неверное число. Попробуйте снова.");
        }

        for (int i = 0; i < size1; i++)
            Circles.add(new Circle(random.nextDouble(10)));
        Circle.findLargestCircle(Circles);



        Element<Integer>[][] elements = new Element[][]{
                {new Element<>(1), new Element<>(2), new Element<>(25)},
                {new Element<>(15), new Element<>(4), new Element<>(13)},
                {new Element<>(17), new Element<>(6), new Element<>(9)}
        };
        Element<Integer> maxElement = elements[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (elements[i][j].compareTo(maxElement) > 0) maxElement = elements[i][j];
            }
        }
        System.out.println("Максимальный элемент коллекции: " + maxElement.toString());



        GenericStack<Integer> genericStack = new GenericStack<>(10);
        System.out.println("Размер коллекции: " + genericStack.getSize());
        for (int i = 0; i < 15; i++)
            genericStack.push(15);
        genericStack.push(22);
        System.out.println("Размер коллекции: " + genericStack.getSize());
        try {
            System.out.println("Элемент на вершине коллекции: " + genericStack.peek());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.print("Проверка на пустоту: ");
        if (genericStack.isEmpty()) {
            System.out.println("Пустой");
        } else {
            System.out.println("Непустой");
        }
        try {
            genericStack.pop();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Размер коллекции: " + genericStack.getSize());
        System.out.println(genericStack.toString());



        GenericStackEAL<Integer> genericStackEAL = new GenericStackEAL<>();
        System.out.println("Размер коллекции: " + genericStackEAL.getSize());
        for (int i = 0; i < 10; i++)
            genericStackEAL.push(random.nextInt(15));
        System.out.println("Размер коллекции: " + genericStackEAL.getSize());
        System.out.println("Последний элемент коллекции: " + genericStackEAL.peek());
        genericStackEAL.pop();
        System.out.println("Размер коллекции: " + genericStackEAL.getSize());
        System.out.println("Элементы коллекции");
        for (var items : genericStackEAL) {
            System.out.print(items + "  ");
        }
        System.out.println();
        if (genericStack.isEmpty()) {
            System.out.println("Пустой");
        } else {
            System.out.println("Непустой");
        }

        genericStackEAL = new GenericStackEAL<>();
        System.out.print("Введите элементы коллекции: ");
        for (int i = 0; i < 5; i++)
            genericStackEAL.push(scanner.nextInt());
        System.out.println("Элементы коллекции:");
        for (var items : genericStackEAL)
            System.out.print(items + "  ");
        System.out.println();
        System.out.println("Элементы в обратном порядке:");
        for (int i = 0; i < 5; i++)
            System.out.print(genericStackEAL.pop() + "  ");

    }
}
