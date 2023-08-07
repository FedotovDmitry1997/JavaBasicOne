package ru.otus.java.basic.hw8;

public class MainApp {
    public static void main(String[] args) {
        Box box = new Box("Черный", 10);
        box.openBox();
        box.putIn("pen");
        box.closeBox();

        User[] users = {
                new User("Ivanov", "Ivan", "Ivanovich",1955, "qwer@gmail.com"),
                new User("Fedotov", "Dmitryi", "Konstantinovich", 1997, "dimba@gmial.com"),
                new User("Petrov", "Petr", "Petrovich", 1967, "petr@gmail.com"),
                new User("Sergeev", "Yan", "Alexsandrovich",1985,"Yan@gmail.com")
        };
        for(int i = 0; i < users.length; i++){
            if (2023 - users[i].getDate() > 40){
                users[i].userInfo();
            }
        }
    }

}
