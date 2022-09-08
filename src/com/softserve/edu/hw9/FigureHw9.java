package com.softserve.edu.hw9;

public abstract class FigureHw9 implements Comparable<FigureHw9> {

    public abstract int getPerimeter();

    @Override
    public int compareTo(FigureHw9 figure) {
        int perimeter = getPerimeter() - figure.getPerimeter();
        if (perimeter > 0) {
            return 1;
        } else
            return -1;
    }
}

