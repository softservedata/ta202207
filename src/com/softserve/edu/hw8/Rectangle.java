package com.softserve.edu.hw8;

public class Rectangle extends Figure{
    private int a;
    private int b;

    public Rectangle(int a, int b) {
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
