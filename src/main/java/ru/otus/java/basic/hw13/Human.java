package ru.otus.java.basic.hw13;

import ru.otus.java.basic.hw13.transport.Drivable;

public class Human {
    private String name;
    private Drivable currentTransport;

    public Human(String name) {
        this.name = name;
    }
    public void takeTransport(Drivable transport){
        currentTransport = transport;
    }
    public void exitTransport(){
        currentTransport = null;
    }
    public boolean move(int distance, Ground ground){
        if (currentTransport == null){
            System.out.println("Пошел пешком");
            return true;
        }
        if (currentTransport.drive(distance, ground)) {
            System.out.println("Расстояние преодоленно");
            return true;
        }
        System.out.println("Невозможно преодолеть расстояние");
        return false;
    }

}
