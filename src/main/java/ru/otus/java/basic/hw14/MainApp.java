package ru.otus.java.basic.hw14;

import ru.otus.java.basic.hw14.exception.AppArrayDataException;
import ru.otus.java.basic.hw14.exception.AppArraySizeException;

import java.io.FileNotFoundException;

public class MainApp {
    public static void main(String[] args) {
        String[][] test1 = {
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10", "11"},
                {"12", "13", "14", "15"}
        };
        String[][] test2 = {
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9a", "10", "11"},
                {"12", "13", "14", "15"}
        };
        String[][] test3 = {
                {"0", "1", "2", "3"},
                {"4", "5", "6", "7"},
                {"8", "9", "10"},
                {"12", "13", "14", "15"},
                {"16"}
        };

        try {
            System.out.println("TEST 1:");
            System.out.println(sumElem(test1));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("TEST 2:");
            System.out.println(sumElem(test2));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        }

        try {
            System.out.println("TEST 3:");
            System.out.println(sumElem(test3));
        } catch (AppArrayDataException | AppArraySizeException ex) {
            System.out.println(ex.getMessage());
        }

    }
    public static int sumElem(String[][] array) {
        if (array.length != 4) {
            throw new AppArraySizeException();
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException();
            }
        }
        int sumElem = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
               try {
                   sumElem += Integer.parseInt(array[i][j]);
               } catch (NumberFormatException ex) {
                   throw new AppArrayDataException(array[i][j], i, j);
               }
            }
        }
        return sumElem;
    }
}
