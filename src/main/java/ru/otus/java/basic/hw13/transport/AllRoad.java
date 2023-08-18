package ru.otus.java.basic.hw13.transport;

import ru.otus.java.basic.hw13.Ground;

public class AllRoad implements Drivable {
    private int fuel;

    public AllRoad(int fuel) {
        this.fuel = fuel;
    }

    private static final int FUEL_ECONOMY = 4;

    @Override
    public boolean drive(int distance, Ground ground){
        if (distance * FUEL_ECONOMY <= fuel) {
            fuel -= distance * FUEL_ECONOMY;
            return true;
        }
        return false;
    }

}
