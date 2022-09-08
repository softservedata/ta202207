package com.softserve.edu.hw13;

public class AppHw13 {
    public static void main(String[] args) {

        Runnable run1 = new ThreadOne();
        Thread thread1 = new Thread(run1);

        Runnable run2 = new ThreadTwo();
        Thread thread2 = new Thread(run2);

        Runnable run3 = new ThreadThree();
        Thread thread3 = new Thread(run3);

        thread1.start();
        thread2.start();
        //the first and the second threads will be running first of all
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        //the third thread will be the last one to run
        thread3.start();
        try {
            thread3.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
