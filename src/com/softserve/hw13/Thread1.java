package com.softserve.hw13;

public class Thread1 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1 ID " +Thread.currentThread().getId());
        }
    }
}

