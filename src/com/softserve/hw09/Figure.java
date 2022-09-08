package com.softserve.hw09;

public abstract class Figure implements Comparable<Figure> {

    public abstract double getPerimeter();

    @Override
    public int compareTo(Figure figure) {
        double res = getPerimeter() - figure.getPerimeter();
        return res > 0 ? 1 : res < 0 ? -1 : 0;
    }

}
