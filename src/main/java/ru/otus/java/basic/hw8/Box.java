package ru.otus.java.basic.hw8;

public class Box {
    private String color;
    private final int size;

    public Box(String color, int size){
        this.color = color;
        this.size = size;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }
    boolean boxCondition = false;

    public void openBox(){
        boxCondition = true;
        System.out.println("коробка открыта");
    }
    public void closeBox(){
        boxCondition = false;
        System.out.println("коробка закрыта");
    }
    String itemInBox;
    public void putIn(String item){
        if (itemInBox == null && boxCondition) {
            itemInBox = item;
            System.out.println("предмет положили");
        }
    }
    public  void removeItem(){
        if (itemInBox != null && boxCondition){
            itemInBox = null;
            System.out.println("предмет выкинули");
        }
    }
}
