package com.softserve.edu.hw9.geometry;

public abstract class Figure implements Comparable<Figure> {
    protected final int a;
    protected final int b;

    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public int compareTo(Figure f) {
        return Double.compare(getPerimeter(), f.getPerimeter());
    }
}
