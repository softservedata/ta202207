package com.softserve.edu.hw3;

public class Pair {
    private int k1;
    private int k2;

    public Pair(int k1, int k2) {
      this.k1 = k1;
      this.k2 = k2;
    }

    public void print() {
        System.out.println(k1);
        System.out.println(k2);
    }
    public void swap() {
        k1 = k1 - k2;
        k2 = k1 + k2;
        k1 = k2 - k1;

    }
}


