package com.softserve.edu.hw13;

public class ThreadOne implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ID of ThreadOne = " + Thread.currentThread().getId());
        }
    }
}