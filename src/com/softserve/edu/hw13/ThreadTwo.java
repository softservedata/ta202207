package com.softserve.edu.hw13;

public class ThreadTwo implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("ID of ThreadTwo = " + Thread.currentThread().getId());
        }
    }
}
