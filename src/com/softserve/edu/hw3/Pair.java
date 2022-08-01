package com.softserve.edu.hw3;

public class Pair {
    private int a;
    private int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.printf("First number: %d\nSecond number: %d\n", a, b);
    }

    public void swap() {
        final int holder = a;
        a = b;
        b = holder;
    }
}
