package ru.otus.java.basic.hw13.transport;

import ru.otus.java.basic.hw13.Ground;

public class Bike implements Drivable {
    @Override
    public boolean drive (int distance, Ground ground) {
        return !(ground.equals(Ground.SWAMP));
    }
}
