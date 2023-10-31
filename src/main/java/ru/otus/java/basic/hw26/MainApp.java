package ru.otus.java.basic.hw26;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Apple> apples = new ArrayList<>();
        apples.add(new Apple(2.1));
        Box appleBox = new Box<>(apples);
        Apple apple = new Apple(1.2);
        appleBox.addToBox(apple);

        Orange orange = new Orange(3.5);
        List<Orange> oranges = new ArrayList<>();
        Box orangeBox = new Box<>(oranges);
        orangeBox.addToBox(orange);

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(orangeBox.weight());

        List<Fruit> fruits = new ArrayList<>();
        fruits.add(new Apple(1.4));
        fruits.add(new Orange(1.6));
        Box fruitBox = new Box<>(fruits);
        orangeBox.pourOver(fruitBox);
        System.out.println(fruitBox.weight());
    }

}
