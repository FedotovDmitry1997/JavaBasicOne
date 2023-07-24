package ru.otus.java.basic.hw3;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        int numberMethod = -1;
        Scanner scanner = new Scanner(System.in);
        while (numberMethod != 0) {
            System.out.println("Введите номер метода от 1 до 5");
            System.out.println("Для выхода введите 0");
            numberMethod = scanner.nextInt();
            if (numberMethod == 1) {
                greetings();
            } else if (numberMethod == 2) {
                int a = (int)(Math.random() * 100 - 50);
                int b = (int)(Math.random() * 100 - 50);
                int c = (int)(Math.random() * 100 - 50);
                checkSign(a, b, c);
            } else if (numberMethod == 3) {
                selectColor();
            } else if (numberMethod == 4) {
                compareNumbers();
            } else if (numberMethod == 5) {
                int initValue = (int)(Math.random() * 100 - 50);
                int delta = (int)(Math.random() * 100 - 50);
                boolean increment = Math.random() < 0.5 ;
                addOrSubtractAndPrint(initValue, delta, increment);
            } else if (numberMethod == 0) {
                System.out.println("Конец");
            } else {
                System.out.println("Такого метода нет");
            }
        }
    }
    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }
    public static void  checkSign(int a, int b, int c) {
        if (a + b + c >= 0) {
            System.out.println("Сумма положительная");
        }
        else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void  selectColor() {
        int data = (int)(Math.random() * 31);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }
    public static void compareNumbers() {
        int a = (int)(Math.random() * 100 - 50);
        int b = (int)(Math.random() * 100 - 50);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
    public static void addOrSubtractAndPrint(int initValue, int delta, boolean increment) {
        if (increment) {
            System.out.println(initValue + delta + " 1");
        } else {
            System.out.println(initValue - delta + " 2");
        }
    }
}