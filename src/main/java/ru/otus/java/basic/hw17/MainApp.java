package ru.otus.java.basic.hw17;

import java.util.ArrayList;
import java.util.List;

public class MainApp {
    public static void main(String[] args) {
        List<Integer> list = Tree.startList();
        Tree tree = new Tree(list);
        System.out.println(tree.find(9));
        System.out.println(tree.find(80));
        System.out.println(tree.getSortedList());
    }
}
