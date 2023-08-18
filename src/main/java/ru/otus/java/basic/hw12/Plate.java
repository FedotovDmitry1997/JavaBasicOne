package ru.otus.java.basic.hw12;

public class Plate {
    private int maxFood;
    private int currentFood;

    public Plate(int maxFood) {
        this.maxFood = maxFood;
        currentFood = maxFood;
    }
    public void addFood (int amountFood){
        if (currentFood + amountFood > maxFood) {
            currentFood = maxFood;
        } else {
            currentFood += amountFood;
        }
    }
    public boolean decreaseFood(int amountFood) {
        if (currentFood >= amountFood) {
            currentFood -= amountFood;
            return true;
        }
        return false;
    }
}
