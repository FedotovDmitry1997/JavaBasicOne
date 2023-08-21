package ru.otus.java.basic.hw13;

import ru.otus.java.basic.hw13.transport.AllRoad;
import ru.otus.java.basic.hw13.transport.Drivable;
import ru.otus.java.basic.hw13.transport.Horse;

public class MainApp {
    public static void main(String[] args) {
        Human human = new Human("Ivan");
        AllRoad transport1 = new AllRoad(100);
        human.takeTransport(transport1);
        human.move(10, Ground.FOREST);
        human.move(30, Ground.SWAMP);
        human.exitTransport();

        human.move(30, Ground.FOREST);

        Horse transport2 = new Horse(20);
        human.takeTransport(transport2);
        human.move(10, Ground.SWAMP);
        human.move(10, Ground.PLAIN);

    }
}
