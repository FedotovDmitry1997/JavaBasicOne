package ru.otus.java.basic.hw5;
import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        int[] a1 = {1, 2, 3};
        int[] a2 = {2, 2};
        int[] a3 = {1, 1, 1, 1, 1};
        masSumm(a1, a2, a3);

        int[] a4 = {9, -4, -4 , -1};
        searchPoint(a4);

        int[] a5 = {5, 4, 3, 2, 1};
        checkSort(a5);

        int[] a6 = {5, 4, 3, 2, 1, 0};
        masReverse(a6);
    }
    public static void masSumm(int[] a1, int[] a2, int[] a3) {
        int[] resMas = new int[Math.max(a1.length, Math.max(a2.length, a3.length))];
        for (int i = 0; i < resMas.length; i++) {
            resMas[i] = 0;
            if (i < a1.length) {
                resMas[i] += a1[i];
            }
            if (i < a2.length) {
                resMas[i] += a2[i];
            }
            if (i < a3.length) {
                resMas[i] += a3[i];
            }
        }
        System.out.println(Arrays.toString(resMas));
    }
    public static void searchPoint(int[] pointMas) {
        int j = pointMas.length - 1, leftSum = 0, rightSum = 0;
        for (int i = 0; i < pointMas.length; i++) {
            if (i == j + 1) {
                break;
            } else {
                if (leftSum < rightSum && pointMas[i] >= 0) {
                    leftSum += pointMas[i];
                } else if (leftSum >= rightSum && pointMas[j] >= 0) {
                    rightSum += pointMas[j];
                    j--;
                    i--;
                } else if (leftSum > rightSum && pointMas[i] < 0) {
                    leftSum += pointMas[i];
                } else {
                    rightSum += pointMas[j];
                    j--;
                    i--;
                }
            }
        }
        if (leftSum == rightSum){
            System.out.println("точка найдена" );
        } else {
            System.out.println("точка не найдена");
        }
    }
    public static void checkSort(int[] a) {
        boolean res = true, order = false;
        if (order) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] >= a[i + 1]) {
                    res = false;
                    break;
                }
            }
        } else {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] <= a[i + 1]) {
                    res = false;
                    break;
                }
            }
        }
        if (res){
            System.out.print("Массив отсортирован ");
            if (order) {
                System.out.println("в порядке возрастания");
            } else {
                System.out.println("в порядке убывания");
            }
        } else {
            System.out.println("массив не отсортированн в заданном порядке");
        }
    }
    public static void masReverse(int[] a){
        int tmp;
        for (int i = 0; i < (int)(a.length / 2); i++){
            tmp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = tmp;
        }
        System.out.println(Arrays.toString(a));
    }
}
