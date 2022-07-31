package com.softserve.edu;

public class Pair {
    private int field1;
    private int field2;

    Pair(int field1, int field2) {
        this.field1 = field1;
        this.field2 = field2;
    }

    public void print() {
        System.out.println("Field 1 is " + field1);
        System.out.println("Field 2 is " + field2);
    }

    public void swap() {
        int temp = field1;
        field1 = field2;
        field2 = temp;
    }
}
