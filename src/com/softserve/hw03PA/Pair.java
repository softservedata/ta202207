package com.softserve.hw03PA;

public class Pair {
    private int i;
    private int k;

    public Pair (int i,int k) {
        this.i = i;
        this.k = k;
    }
   public void print() {
       System.out.print("i = " + i);
       System.out.println("k = " + k);
    }
    public void swap() {
        int t = i;
        i = k;
        k = t;
    }
}
