package com.softserve.edu.hw13;

public class Multithreading {
    public static void main(String[] args) {
        Runnable r1 = new Thread1();
        Thread t1 = new Thread(r1);
        Runnable r2 = new Thread2();
        Thread t2 = new Thread(r2);
        Runnable r3 = new Thread3();
        Thread t3 = new Thread(r3);
        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        t3.start();
        try {
            t3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}

