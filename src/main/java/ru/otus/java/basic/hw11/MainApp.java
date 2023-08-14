package ru.otus.java.basic.hw11;

import ru.otus.java.basic.hw11.animals.Cat;
import ru.otus.java.basic.hw11.animals.Dog;
import ru.otus.java.basic.hw11.animals.Horse;

public class MainApp {
    public static void main(String[] args) {
        // cat
        Cat cat = new Cat("Барсик", 10, 1000);
        System.out.println("КОТ:\nВыносливость: " + cat.getStamina() + "\nСкорость бега: " + cat.getRunSpeed());
        System.out.println("Дистанция: " + 100);
        System.out.println("Бежать (сек): " + cat.run(100));
        cat.info();
        System.out.println("Дистанция: " + 900);
        System.out.println("Бежать (сек): " + cat.run(900));
        cat.info();
        System.out.println("Дистанция: " + 100);
        System.out.println("Бежать (сек): " + cat.run(100));
        cat.info();
        System.out.println();

        // dog
        Dog dog = new Dog("Коржик", 13, 1, 2000);
        System.out.println("ПЕС:\nВыносливость: " + dog.getStamina() + "\nСкорость бега: " + dog.getRunSpeed() + "\nСкорость плавания: " + dog.getSwimSpeed());
        System.out.println("Дистанция: " + 500);
        System.out.println("Бежать (сек): " + dog.run(500));
        dog.info();
        System.out.println("Дистанция: " + 500);
        System.out.println("Плыть (сек): " + dog.swim(500));
        dog.info();
        System.out.println("Дистанция: " + 500);
        System.out.println("Плыть (сек): " + dog.swim(500));
        dog.info();
        System.out.println();

        // horse
        Horse horse = new Horse("Стрела", 21, 2, 5000);
        System.out.println("ЛОШАДЬ:\nВыносливость: " + horse.getStamina() + "\nСкорость бега: " + horse.getRunSpeed() + "\nСкорость плавания: " + horse.getSwimSpeed());
        System.out.println("Дистанция: " + 100);
        System.out.println("Бежать (сек): " + horse.run(100));
        horse.info();
        System.out.println("Дистанция: " + 1000);
        System.out.println("Плыть (сек): " + horse.swim(1000));
        horse.info();
        System.out.println("Дистанция: " + 1000);
        System.out.println("Плыть (сек): " + horse.swim(1000));
        horse.info();
    }
}
