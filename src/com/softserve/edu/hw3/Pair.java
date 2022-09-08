package com.softserve.edu.hw3;

public class Pair {
    private int a;
    private int b;

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void print() {
        System.out.println("print a value = " + a);
        System.out.println("print b value = " + b);
    }

    public void swap() {
        System.out.println("a and b have been swapped");
        int temp;
        temp = a;
        a = b;
        b = temp;
    }
}
