package com.softserve.edu.hw13PA;

public class Thread3 implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Thread1 index " + Thread.currentThread().getId());
        }
    }
}