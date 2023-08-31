package ru.otus.java.basic.hw17;

import java.util.ArrayList;
import java.util.List;

public class Tree implements SearchTree {
    private Integer value;
    private Tree leftChild;
    private Tree rightChild;

    public Tree(List<Integer> startList) {
        Tree root = makeTree(startList);
        value = root.value;
        leftChild = root.leftChild;
        rightChild = root.rightChild;
    }

    private Tree() {}

    @Override
    public Integer find(Integer element){
        if (value == element) {
            return value;
        }

        if (element > value && rightChild != null) {
            return rightChild.find(element);
        }
        if (element < value && leftChild != null) {
            return leftChild.find(element);
        }
        return null;
    }

    @Override
    public List getSortedList(){
        List<Integer> sortedList = new ArrayList<>();
        elemToList(sortedList);
        return sortedList;

    }

    private void elemToList(List<Integer> sortedList) {
        if (leftChild != null) {
            leftChild.elemToList(sortedList);
        }
        sortedList.add(this.value);
        if (rightChild != null) {
            rightChild.elemToList(sortedList);
        }
    }



    private Tree makeTree(List<Integer> startList) {
        if (!startList.isEmpty()) {
            Tree node = new Tree();
            node.value = startList.get(startList.size() / 2);
            node.leftChild = makeTree(startList.subList(0, startList.size() / 2));
            node.rightChild = makeTree(startList.subList(startList.size() / 2 + 1, startList.size()));
            return node;
        }
        return null;
    }

    @Override
    public String toString() {
        return "Tree{" +
                "value=" + value +
                '}';
    }
}
