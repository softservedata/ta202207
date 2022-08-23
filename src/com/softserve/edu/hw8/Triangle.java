package com.softserve.edu.hw8;

public class Triangle extends Figure {
    private int a, b, c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public int getPerimeter() {
        return a + b + c;
    }
}