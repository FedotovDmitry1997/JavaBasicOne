package ru.otus.java.basic.hw7;

public class MainApp {
    public static void main(String[] args) {
        int size = 5;
        int[][] array  = new int[size][size];
        array = createArray(size);
        printArray(array);

        int sumPositiv =  sumOfPositiveElements(array);
        System.out.println(sumPositiv);

        printSquare(size);

        array = fillZero(array);
        printArray(array);

        int maxElement = findMax(array);
        System.out.println(maxElement);

        int sumOfSeconds = sumOfSecondElements(array);
        System.out.println(sumOfSeconds);

    }
    public static int[][] createArray(int size) {
        int[][] array  = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 10 - 5);
            }
        }
        return array;
    }
    public static void printArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0){
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }
    public static void printSquare(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static int[][] fillZero(int array[][]) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0;
            array[i][array.length - i - 1] = 0;
        }
        return array;
    }
    public static int findMax(int[][] array){
        int maxElem = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > maxElem){
                    maxElem= array[i][j];
                }
            }
        }
        return maxElem;
    }
    public static int sumOfSecondElements(int[][] array) {
        if (array.length < 2){
            return -1;
        }
        int sum = 0;
        for (int i = 0; i < array[1].length; i++) {
            sum += array[1][i];
        }
        return sum;
    }
}
