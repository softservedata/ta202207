package com.softserve.edu.hw9;

public class SquareHw9 extends FigureHw9 {
    private int a;

    public SquareHw9(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    @Override
    public String toString() {
        return "\nSquare{" +
                "a=" + a +
                '}';
    }

    public int getPerimeter(){
        return a*4;
    };
}