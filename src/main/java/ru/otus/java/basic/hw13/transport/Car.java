package ru.otus.java.basic.hw13.transport;

import ru.otus.java.basic.hw13.Ground;

public class Car implements Drivable {
    private int fuel;

    public Car(int fuel) {
        this.fuel = fuel;
    }

    private static final int FUEL_ECONOMY = 2;

    @Override
    public boolean drive(int distance, Ground ground){
        if (distance * FUEL_ECONOMY <= fuel && ground.equals(Ground.PLAIN)) {
            fuel -= distance * FUEL_ECONOMY;
            return true;
        }
        return false;
    }

}
