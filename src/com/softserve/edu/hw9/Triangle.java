package com.softserve.edu.hw9;


public class Triangle extends Figure {
    private final int c;

    public Triangle(int a, int b, int c) {
        super(a,b);
        this.c = c;
    }

    public int getPerimeter() {
        return a + b + c;
    }

}
