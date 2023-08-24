package ru.otus.java.basic.hw16;
import java.util.*;

public class PhoneBook {
    Map<String, Set<String>> phoneNumbers = new HashMap<>();

    public void add(String name, String phone) {
        if (phoneNumbers.containsKey(name)) {
            phoneNumbers.get(name).add(phone);
            return;
        }
        Set<String> phones = new HashSet<>();
        phones.add(phone);
        phoneNumbers.put(name, phones);
    }
    public Set<String> find(String name) {
        return phoneNumbers.get(name);
    }
    public boolean containsPhoneNumber(String phone) {
        for (String name: phoneNumbers.keySet()) {
            if (phoneNumbers.get(name).contains(phone)) {
                return true;
            }
        }
        return false;
    }

}
