package ru.otus.java.basic.hw13.transport;

import ru.otus.java.basic.hw13.Ground;

public class Horse implements Drivable{
    private int energy;

    public Horse(int energy) {
        this.energy = energy;
    }

    private static final int ENERGY_ECONOMY = 2;

    @Override
    public boolean drive(int distance, Ground ground){
        if (distance * ENERGY_ECONOMY <= energy && ground.equals(Ground.PLAIN)) {
            energy -= distance * ENERGY_ECONOMY;
            return true;
        }
        return false;
    }
}
