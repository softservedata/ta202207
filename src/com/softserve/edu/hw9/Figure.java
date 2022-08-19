package com.softserve.edu.hw9;

import java.util.Comparator;

abstract class Figure implements Comparable<Figure> {
    protected final int a;
    protected final int b;


    public Figure(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getPerimeter() {
        return  2 * (a + b);
    }

    @Override
    public int compareTo(Figure figure) {
        return Integer.compare(figure.getPerimeter(), getPerimeter());
    }
}


