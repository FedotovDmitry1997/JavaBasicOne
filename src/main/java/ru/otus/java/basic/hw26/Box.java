package ru.otus.java.basic.hw26;

import java.util.ArrayList;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> boxWithFruits = new ArrayList<T>();

    public Box(List<T> boxWithFruits) {
        this.boxWithFruits = boxWithFruits;
    }
    public void addToBox(T fruit) {
        boxWithFruits.add(fruit);
    }
    public double weight() {
        double boxWeight = 0.0;
        for (T boxWithFruit : boxWithFruits) {
            boxWeight += boxWithFruit.getWeight();
        }
        return boxWeight;
    }
    public boolean compare(Box<?> another) {
        if (another != null) {
            return Math.abs(this.weight() - another.weight()) < 0.0001;
        }
        return false;
    }
    public void pourOver(Box<? super T> another) {
        if (this != another) {
            another.boxWithFruits.addAll(this.boxWithFruits);
        }
    }
}

