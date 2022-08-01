package com.softserve.hw03;

public class Pair {
    private int a;
    private int b;

    public Pair() {
        a = 0;
        b = 0;
    }

    public Pair(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        if (b > 0) {
            this.b = b;
        }
    }

    public void swap() {
        // TODO
        // change a <-> b
    }

    @Override
    public String toString() {
        return "Pair{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
