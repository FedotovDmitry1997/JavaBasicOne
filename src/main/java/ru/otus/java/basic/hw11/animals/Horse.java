package ru.otus.java.basic.hw11.animals;

public class Horse extends Animal {
    public Horse(String name, int runSpeed, int swimSpeed, int stamina) {
        super(name, runSpeed, swimSpeed, stamina);
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
    public float swim(int distance){
        if (stamina < distance * 4) {
            stamina = 0;
            updateIsTired();
            return -1;
        }
        stamina -= distance * 4;
        updateIsTired();
        return (float)distance / swimSpeed;
    }
}
