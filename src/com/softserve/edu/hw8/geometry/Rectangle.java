package com.softserve.edu.hw8.geometry;

public class Rectangle extends Figure{

    public Rectangle(int a, int b) {
        super(a, b);
    }

    @Override
    public double perimeter() {
        return 2 * (a + b);
    }
}
