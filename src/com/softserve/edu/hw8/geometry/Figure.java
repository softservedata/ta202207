package com.softserve.edu.hw8.geometry;

public abstract class Figure {
    protected final int a;
    protected final int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public abstract double perimeter();
}
