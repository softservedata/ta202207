package com.softserve.edu.hw9.geometry;

public class Triangle extends Figure {
    private final int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double getPerimeter() {
        return a + b + c;
    }
}
