package ru.otus.java.basic.hw20.client;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class PingClient {
    public static void main(String[] args) {
        try(Socket socket = new Socket("localhost", 8080)) {
            System.out.println("Client connected");
            readRequest(socket);

            Scanner scanner = new Scanner(System.in);
            String userInput = scanner.nextLine();
            writeData(socket, userInput);

            userInput = scanner.nextLine();
            writeData(socket, userInput);

            userInput = scanner.nextLine();
            writeData(socket, userInput);

            readRequest(socket);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static void readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = reader.readLine();
        System.out.println("Server:" + str);
    }

    public static void writeData(Socket socket, String data) throws IOException {
        BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
        if (!data.endsWith("\n")) {
            data += "\n";
        }
        writer.write(data);
        writer.flush();
    }
}
