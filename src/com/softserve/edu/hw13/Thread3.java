package com.softserve.edu.hw13;

public class Thread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1 ID " + Thread.currentThread().getId());
        }
    }
}
