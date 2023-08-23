package ru.otus.java.basic.hw14.exception;

public class AppArraySizeException extends RuntimeException {
    public AppArraySizeException() {
        super("Некорректный размер массива");
    }
}
