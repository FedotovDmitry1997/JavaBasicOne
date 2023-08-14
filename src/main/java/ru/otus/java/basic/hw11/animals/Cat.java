package ru.otus.java.basic.hw11.animals;

public class Cat extends Animal {
    public Cat(String name, int runSpeed, int stamina) {
        super(name, runSpeed, 0, stamina);
    }
    @Override
    public float run(int distance){
        if (stamina < distance) {
            stamina = 0;
            updateIsTired();
            return -1;
        }
        stamina -= distance;
        updateIsTired();
        return (float)distance / runSpeed;
    }

}
