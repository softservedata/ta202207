package com.softserve.hw03PA;

public class Pair {
    private int i;
    private int k;


    public Pair(int i, int k) {
        this.i = i;
        this.k = k;
    }

    public int getI() {
        return i;
    }

    public int getK() {
        return k;
    }

    public void setI(int i) {
        this.i = i;
    }

    public void setK(int k) {
        this.k = k;
    }

    public void print() {
        System.out.println("i = " + i);
        System.out.println("k = " + k);
    }
    public void swap() {
        int t = i;
        i = k;
        k = t;
    }
}
