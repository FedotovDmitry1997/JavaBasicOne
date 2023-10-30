package ru.otus.java.basic.hw28;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApp {
    public static final Object mon = new Object();
    public static Character last = 'C';
    public static void main(String[] args) {
        ExecutorService serv = Executors.newFixedThreadPool(3);
        serv.execute(MainApp::a);
        serv.execute(MainApp::b);
        serv.execute(MainApp::c);
        serv.shutdown();
    }

    public static void a() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!last.equals('C')) {
                        mon.wait();
                    }
                    System.out.print("A");
                    last = 'A';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void b() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!last.equals('A')) {
                        mon.wait();
                    }
                    System.out.print("B");
                    last = 'B';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void c() {
        synchronized (mon) {
            try {
                for (int i = 0; i < 5; i++) {
                    while (!last.equals('B')) {
                        mon.wait();
                    }
                    System.out.print("C");
                    last = 'C';
                    mon.notifyAll();
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
