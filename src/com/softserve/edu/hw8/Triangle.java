package com.softserve.edu.hw8;

public class Triangle extends Figure{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
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
