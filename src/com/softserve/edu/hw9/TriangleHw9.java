package com.softserve.edu.hw9;

public class TriangleHw9 extends FigureHw9 {
    private int a;
    private int b;
    private int c;

    public TriangleHw9(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    @Override
    public String toString() {
        return "\nTriangle{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }

    public int getPerimeter(){
        return a + b + c;
    };
}
