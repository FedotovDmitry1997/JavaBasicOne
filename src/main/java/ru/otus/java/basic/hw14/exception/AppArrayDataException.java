package ru.otus.java.basic.hw14.exception;

public class AppArrayDataException extends RuntimeException {
    private String value;
    private int row;
    private int col;

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public String getValue() {
        return value;
    }

    public AppArrayDataException(String value, int row, int col) {
        super("\"" + value + "\"" + " в ячейке " + row + "x" + col + " не является числом" );
        this.value = value;
        this.row = row;
        this.col = col;
    }
}
