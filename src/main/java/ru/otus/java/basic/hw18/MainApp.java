package ru.otus.java.basic.hw18;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
import java.util.stream.Collectors;


public class MainApp {
    public static void main(String[] args) {
        File file = new File("./");
        System.out.println("Список доступных файлов");
        List<String> listFiles = Arrays.stream(file.listFiles()).map(obj -> obj.getName()).collect(Collectors.toList());
        for (String i : listFiles) {
            if (i.endsWith(".txt")) {
                System.out.println(i);
            }
        }
        System.out.println("введите имя файла");
        Scanner scanner = new Scanner(System.in);
        String fileName = scanner.nextLine();
        try (InputStreamReader in = new InputStreamReader(new FileInputStream(fileName))) {
            int n = in.read();
            while (n != -1) {
                System.out.print((char)n);
                n = in.read();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("введите строку:");
        String data = scanner.nextLine();
        try (BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(fileName))) {
            byte[] buffer = data.getBytes(StandardCharsets.UTF_8);
            for (int i = 0; i < buffer.length; i++) {
                out.write(buffer[i]);
            }
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
