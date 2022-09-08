package com.softserve.edu.hw8;

public abstract class Figure implements Comparable<Figure> {

    public abstract int getPerimeter();

    @Override
    public int compareTo(Figure figure) {
        int result = getPerimeter() - figure.getPerimeter();
        if (result > 0) {
            return 1;
        } else
            return -1;
    }
}

