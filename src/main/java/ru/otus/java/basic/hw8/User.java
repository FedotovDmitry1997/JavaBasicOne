package ru.otus.java.basic.hw8;

public class User {
    private String surname;
    private String name;
    private String fatherName;
    private int date;
    private String email;

    public User(String surname, String name,String fatherName, int date, String email) {
        this.surname = surname;
        this.name = name;
        this.fatherName = fatherName;
        this.date = date;
        this.email = email;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public void userInfo(){
        System.out.println("ФИО: " + this.name + " " + this.surname + " " + this.fatherName + "\n" + "Год рождения: " + this.date + "\n" + "email: " + this.email);
    }
}
