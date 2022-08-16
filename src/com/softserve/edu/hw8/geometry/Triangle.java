package com.softserve.edu.hw8.geometry;

public class Triangle extends Figure{
    private final int c;

    public Triangle(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public double perimeter() {
        return a + b + c;
    }
}
