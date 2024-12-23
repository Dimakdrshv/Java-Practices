package lesson_10;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        MyStack<Integer> myStack = new MyStack<>();
        for (int i = 0; i < 5; i++) {
            myStack.push(random.nextInt(20));
        }
        System.out.println(myStack.toString());
        System.out.print("Вывод элементов стэка в обратном порядке:\n");
        for (int i = 0; i < 5; i++)
            System.out.print(myStack.pop() + " ");

        System.out.println("\nВведите элементы стэка:");
        MyStack<Integer> myStack1 = new MyStack<>();
        for (int i = 0; i < 5; i++) {
            myStack1.push(scanner.nextInt());
        }
        System.out.println(myStack1.toString());
        System.out.print("Вывод элементов стэка в обратном порядке:\n");
        for (int i = 0; i < 5; i++)
            System.out.print(myStack1.pop() + " ");
        System.out.println();



        MyStack<Integer> myStack2 = new MyStack<>();
        for (int i = 0; i < 10; i++)
            myStack2.push(random.nextInt(20));
        System.out.println(myStack2.toString());
        MyStack<Integer> integerMyStack = myStack2.deepCopy();
        System.out.println("Скопированный вывод:");
        System.out.println(integerMyStack.toString());
    }
}
