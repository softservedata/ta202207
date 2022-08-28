package com.softserve.edu.hw09PA;

public abstract class Figure implements Comparable<Figure> {
    public abstract int getPerimeter();

    @Override
    public int compareTo(Figure figure) {
        return Double.compare(getPerimeter(), figure.getPerimeter());
    }
}

