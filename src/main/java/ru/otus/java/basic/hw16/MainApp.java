package ru.otus.java.basic.hw16;


import java.util.HashMap;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.add("Ivanov", "89239993333");
        phoneBook.add("Petrov", "88005553535");
        phoneBook.add("Sidorov", "89999999999");
        phoneBook.add("Ivanov", "89039994545");
        System.out.println(phoneBook.find("Ivanov"));
        System.out.println(phoneBook.containsPhoneNumber("89039994545"));
        System.out.println(phoneBook.containsPhoneNumber("89039"));

    }



}
