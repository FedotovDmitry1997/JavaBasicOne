package ru.otus.java.basic.hw12;

public class MainApp {
    public static void main(String[] args) {
        Plate plate = new Plate(500);
        Cat[] cats = {
                new Cat("Барсик", 300),
                new Cat("Муся", 50),
                new Cat("Белка", 100),
                new Cat("Туча", 75),
                new Cat("Иннокентий", 200)
        };
        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
            cats[i].isFull();
        }
    }
}
