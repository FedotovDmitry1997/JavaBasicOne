package ru.otus.java.basic.hw11.animals;

public abstract class Animal {
    protected String name;
    protected int runSpeed;
    protected int swimSpeed;
    protected int stamina;
    private boolean isTired;

    public Animal(String name, int runSpeed, int swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
        updateIsTired();
    }
    public abstract float run(int distance);
    public void updateIsTired() {
        isTired = stamina <= 0;
    }
    public void info() {
        System.out.print("Состояние животного: ");
        if (isTired) {
            System.out.println("усталость");
        } else {
            System.out.println("выносливость = " + stamina);
        }
    }
    public boolean getIsTired() {
        return isTired;
    }

    public String getName() {
        return name;
    }

    public int getRunSpeed() {
        return runSpeed;
    }

    public int getSwimSpeed() {
        return swimSpeed;
    }

    public int getStamina() {
        return stamina;
    }
}
