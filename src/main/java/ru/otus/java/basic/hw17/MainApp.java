package ru.otus.java.basic.hw17;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> list = startList();
        Tree tree = new Tree(list);
        System.out.println(tree.find(9));
        System.out.println(tree.find(80));
        System.out.println(tree.getSortedList());
    }

    public static List<Integer> startList() {
        List<Integer> startList = new ArrayList<>();
        for (int i = 0; i < 16; i++){
            startList.add(i);
        }
        return startList;
    }
}
