package com.softserve.edu.hw9;

public class RectangleHw9 extends FigureHw9 {
    private int a;
    private int b;

    public RectangleHw9(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    @Override
    public String toString() {
        return "\nRectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public int getPerimeter(){
        return (a + b)*2;
    };
}
