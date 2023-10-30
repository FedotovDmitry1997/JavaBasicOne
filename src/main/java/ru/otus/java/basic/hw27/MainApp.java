package ru.otus.java.basic.hw27;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
        System.out.println("введите имя файла");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();

        System.out.println("введите последовательность символов");
        String subsequence = scanner.nextLine();

        StringBuilder fileStr = new StringBuilder();
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(fileName))) {
            int n = in.read();
            fileStr.append((char) n);
            while (n != -1) {
                n = in.read();
                fileStr.append((char) n);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(countSubseq(fileStr,subsequence));
    }
        public static int countSubseq (StringBuilder fileStr, String subsequence){
            int countInto = 0;
            for (int i = 0; i < fileStr.length() - subsequence.length(); i++) {
                if (fileStr.charAt(i) == subsequence.charAt(0)) {
                    boolean fl = true;
                    for (int j = 1; j < subsequence.length(); j++) {
                        if (fileStr.charAt(i + j) != subsequence.charAt(j)) {
                            fl = false;
                            break;
                        }
                    }
                    if (fl) {
                        countInto += 1;
                    }
                }
            }
            return countInto;
        }
    }
