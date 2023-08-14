package ru.otus.java.basic.hw12;

public class Cat {
    private String name;
    private int appetite;
    private boolean fullCat = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }
    public void isFull(){
        System.out.print("Котик по имени " + name);
        if (fullCat) {
            System.out.println(" сыт");
        } else {
            System.out.println(" голоден :(");
        }
    }
    public void eat(Plate plate) {
        fullCat = plate.decreaseFood(appetite);
    }

}
