package ru.otus.java.basic.hw20.server;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class PingServer {
    public static void main(String[] args) throws IOException {
        try(ServerSocket serverSocket = new ServerSocket(8080)) {
            Socket socket = serverSocket.accept();
            System.out.println("Client connected");

            writeData(socket, "Введите два числа и одну из операций(+,-,*,/)");
            Integer firstNumber = Integer.valueOf(readRequest(socket));
            String operand = readRequest(socket);
            Integer secondNumber = Integer.valueOf(readRequest(socket));

            writeData(socket, calculate(operand, firstNumber, secondNumber));
        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private static String calculate(String operand, Integer firstNumber, Integer secondNumber) {
        double res = 0;
        switch (operand) {
            case "+":
                res = firstNumber + secondNumber;
                break;
            case "-":
                res = firstNumber - secondNumber;
                break;
            case "/":
                res = (double)firstNumber / secondNumber;
                break;
            case "*":
                res = firstNumber * secondNumber;
                break;
        }
        return String.valueOf(res);
    }

    private static String readRequest(Socket socket) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        String str = reader.readLine();
        return str;
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

